package cn.itcast.day08.ListAndSet;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    Set集合报错元素唯一
        存储的元素(String,Integer,...Student,Person),必须重写hashCode和equals方法

    要求：
        同名同年龄的人，视为同一人，只能存储一次
 */
public class Demo05HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("北京",3500);
        Person p2 = new Person("上海",800);
        Person p3 = new Person("上海",800);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
