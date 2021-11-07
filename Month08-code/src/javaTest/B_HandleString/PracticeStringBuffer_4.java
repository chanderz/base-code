package javaTest.B_HandleString;

import java.util.Scanner;

/**
 * *
 * * @Description：判断一个字符串是否是对称字符串
 * * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 15:28
 * *
 */
public class PracticeStringBuffer_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new StringBuffer(s).reverse().toString().equals(s));

        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2);
        change(s1, s2);
        System.out.println(s1 + "---" + s2);

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "---" + sb2);
        change(sb1, sb2);
        System.out.println(sb1 + "---" + sb2);
    }

    //StringBuffer作为参数传递(形参未return)
    public static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }

    //String作为参数传递(形参未return)
    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
    }
}
