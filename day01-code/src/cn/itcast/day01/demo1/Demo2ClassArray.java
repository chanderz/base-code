package cn.itcast.day01.demo1;

public class Demo2ClassArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        array[0] = new Person();
        array[1] = new Person();
        array[2] = new Person();
        System.out.println(array[0]);
        System.out.println(array[0].getAge());
        System.out.println(array[1]);
        System.out.println(array[2]);
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
}
