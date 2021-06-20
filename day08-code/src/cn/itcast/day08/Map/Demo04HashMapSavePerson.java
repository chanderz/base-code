package cn.itcast.day08.Map;
/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
        作为key的元素，必须重写hashCode方法与equals方法，以保证key唯一
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        //show01();
        show02();

    }

    private static void show02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("秦始皇", 54), "秦朝");
        map.put(new Person("唐太宗", 64), "唐朝");
        map.put(new Person("明成祖", 52), "明朝");
        map.put(new Person("汉武帝", 64), "汉朝");
        map.put(new Person("秦始皇", 54), "秦朝");
        Set<Person> set = map.keySet();
        for (Person person : set) {
            System.out.println(person+"-->" + map.get(person));
        }
        Set<Map.Entry<Person, String>> set1 = map.entrySet();
        for (Map.Entry<Person, String> entry: set1) {
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
    }

    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 29));
        map.put("上海", new Person("李四", 32));
        map.put("杭州", new Person("王五", 28));
        map.put("苏州", new Person("赵六", 34));
        map.put("南京", new Person("刘七", 31));
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"-->"+ map.get(s));
        }
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
    public String toString(){
        return "Person{" + name + " = " + age + "}";
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name,person.name);

    }
}
