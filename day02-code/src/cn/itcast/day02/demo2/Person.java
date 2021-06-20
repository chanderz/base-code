package cn.itcast.day02.demo2;

import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;
    private boolean male;

    public Person() {
    }

    public Person(String name, int age, boolean male) {
        this.name = name;
        setAge(age);
        this.age = getAge();
        this.male = male;
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
        if(age < 0 || age > 100){
            System.out.println("年龄有误");
        }else {
            this.age = age;
        }
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void show(){
        System.out.println("姓名："+name+",年龄："+age+",是否男生："+male);
    }
}
