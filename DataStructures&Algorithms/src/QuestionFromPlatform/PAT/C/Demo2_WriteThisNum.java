package QuestionFromPlatform.PAT.C;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1002 写出这个数
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

输入格式：
每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10^100

输出格式：
在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。
 */
public class Demo2_WriteThisNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        String s = String.valueOf(n);
        char[] array = s.toCharArray();
        Map<Integer, String> map = Map.of(0,"零",1,"一",2,"二",3,"三",4,"四",5,"五",6,"六",7,"七",8,"八",9,"九");
        int sum = 0;
        for (char c: array) {
            int integer = c - '0';
            sum += integer;

        }
        String string = String.valueOf(sum);
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int g = chars[i] - '0';
            System.out.print(map.get(g));
            if (i != chars.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
