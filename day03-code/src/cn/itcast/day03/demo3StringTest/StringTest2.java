package cn.itcast.day03.demo3StringTest;

import java.util.Scanner;

/*
键盘录入一个字符，统计字符串中大小写字母及数字字符个数
 */
public class StringTest2 {
    public static void main(String[] args) {
        String str = printIn();
        System.out.println("大写字母有："+getBigAlpha(str)+"个");
        System.out.println("小写字母有："+getSmallAlpha(str)+"个");
        System.out.println("数字有："+getNumber(str)+"个");
        System.out.println("其他字符有："+getOthers(str)+"个");
    }
    public static String printIn(){
        return new Scanner(System.in).next();
    }
    public static int getBigAlpha(String str){
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 64 && chars[i] < 91){
                count++;
            }
        }
        return count;
    }
    public static int getSmallAlpha(String str){
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 96 && chars[i] < 123){
                count++;
            }
        }
        return count;
    }
    public static int getNumber(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                count++;
            }
        }
        return count;
    }
    public static int getOthers(String str){
        return str.length() - getBigAlpha(str) - getSmallAlpha(str) - getNumber(str);
    }
}
