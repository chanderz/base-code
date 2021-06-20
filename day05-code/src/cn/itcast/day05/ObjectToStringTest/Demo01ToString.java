package cn.itcast.day05.ObjectToStringTest;

import java.util.Objects;

/*
Person类默认继承了Object类
 */
public class Demo01ToString {
    public static void main(String[] args) {
        Person p1 = new Person("Aaron",18);
        Person p2 = new Person("Billy",18);
        boolean p = p1.equals(p2);//比较的地址值
        System.out.println(p);
        Person p3 = new Person();
        String s1 = null;
        String s2 = "abc";
        //System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));
    }
}
