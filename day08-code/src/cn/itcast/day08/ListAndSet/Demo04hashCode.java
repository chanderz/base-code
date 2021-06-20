package cn.itcast.day08.ListAndSet;
/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    int hashCode() 返回该对象的哈希值
    hashCode方法的源码：
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */
/*
    jdk1.8前：哈希表=数组+链表
    jdk1.8后：哈希表=数组+红黑树（提高查询的速度）
 */

import java.util.Objects;

public class Demo04hashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);

        /*
            toString方法的源码：
                return getClass().getName() + "@" + Integer.toHexString(HashCode());
         */
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);

        /*
            String类的哈希值
                String类重写Object类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}