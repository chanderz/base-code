package cn.itcast.day07.Generic;

public class Demo02GenericClassTest {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        Demo02GenericClass dg = new Demo02GenericClass();
        dg.setName("hahaha");
        Object obj = dg.getName();
        System.out.println(obj);
        System.out.println("======");

        Demo02GenericClass<Integer> dg2 = new Demo02GenericClass<>();
        dg2.setName(200);
        Integer name = dg2.getName();
        System.out.println(name);
        System.out.println("======");

        Demo02GenericClass<String> dg3 = new Demo02GenericClass<>();
        dg3.setName("Aaron");
        String name1 = dg3.getName();
        System.out.println(name1);
    }
}
