package cn.itcast.day03.demo5Arrays;
/*
请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        String str = printIn();
        System.out.println(sort(str));
        print1(sort(str));
        print2(sort(str));

    }
    public static String printIn(){
        return new Scanner(System.in).next();
    }
    public static String sort(String str){
        char[] chars = str.toCharArray();   //把字符串转换成char数组
        Arrays.sort(chars);                 //对数组进行升序排序
        return Arrays.toString(chars);      //把char数组转换成字符串
    }
    public static void print1(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        Arrays.toString(chars);
        System.out.println(chars);
    }
    public static void print2(String str){
        char[] chars = str.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i] != '[' && chars[i] != ']'){
                System.out.print(chars[i]);
            }
        }
    }
}
