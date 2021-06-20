package cn.itcast.day06.StringBuilderTest;

import java.util.ArrayList;

/*
java.lang.StringBuilder，StringBuilder又称为可变字符序列，它是一个类似于String的字符串缓冲区(底层是数组，未被final修饰可变)
通过某些方法调用可以改变该序列的长度和内容:
构造方法：
- public StringBuilder()：构造一个空的StringBuilder容器。
- public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。
常用方法：
- public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
- public String toString()：将当前StringBuilder对象转换为String对象。
- public StringBuilder reverse():将此字符序列用其反转形式取代
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        //demo1();
        //demo2();
    }
    public static void demo1(){
        String s = "hello";
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(sb2);
    }
    private static void demo2(){
        StringBuilder sb = new StringBuilder("one");
        StringBuilder bu1 = sb.append("-two");
        StringBuilder bu2 = sb.append(true);
        System.out.println(bu1 == bu2);
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
        sb.append(1.8).append("haha").append("ok").append(true).append('e');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
