package javaTest.B_HandleString;

/**
 * *
 * * @Description：统计大串中小串出现的次数
 *      举例：
 *  *         在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 *  *   结果：
 *  *         java出现了5次
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 14:04
 * *
 */
public class PracticeString_3 {
    public static int smallCount(String b, String s) {
        int count = 0;

        int index = b.indexOf(s);
        while (index != -1){
            count++;
            int a = index + s.length();
            b = b.substring(a);
            index = b.indexOf(s);
        }
        return count;
    }

    public static void main(String[] args) {
        String b = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String s = "java";
        System.out.println(smallCount(b,s));
    }
}
