package javaTest.B_HandleString;

import java.util.Locale;
import java.util.Scanner;

/**
 * *
 * * @Description：将一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 *      举例：
 *  *         helloWORLD
 *  *   结果：
 *  *         Helloworld
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 12:27
 * *
 */
public class PracticeString_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        toFormat1(s);
        toFormat2(s);
        toFormat3(s);

    }
    public static void toFormat1(String s){
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (i == 0){
                chs[i] = chs[i] < 97 ? chs[i] : (char) (chs[i] - 32);
            }
            else {
                chs[i] = chs[i] >= 97 ? chs[i] : (char) (chs[i] + 32);
            }
        }
        String ss = String.valueOf(chs);
        System.out.println(ss);
    }
    public static void toFormat2(String s){
        String ss = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println(ss);
    }
    public  static void toFormat3(String s){
        if(s.substring(s.length()-6).equalsIgnoreCase("RETAIL")){
            s = s.substring(0,s.length()-6);
        }
        System.out.println(s);
    }
}
