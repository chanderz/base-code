package QuestionFromPlatform.PAT.C;
/*
1003 我要通过！
“答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于 PAT 的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，
否则输出“答案错误”。得到“答案正确”的条件是：
1.字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
2.任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
3.如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
现在就请你为 PAT 写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。

输入格式：
每个测试输入包含 1 个测试用例。第 1 行给出一个正整数 n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过 100，且不包含空格。

输出格式：
每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出 YES，否则输出 NO。
 */

import java.util.Scanner;

public class Demo3_IWillPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String s = sc.next();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] != 'P' && chars[j] != 'A' && chars[j] != 'T') {
                    System.out.println("答案错误");
                    break;
                }
                int index1 = s.indexOf("PAT");
                int index2 = s.indexOf("P");
                int index3 = s.indexOf("T");
                int index4 = s.indexOf("AT");
                if (index1 != -1 && (j < index1 || j > index1 + 3)) {
                    if (chars[j] != 'A'){
                        System.out.println("答案错误");
                        break;
                    }
                }
                else {
                    if (index2 > index3 || index2 > index4) {
                        System.out.println("答案错误");
                        break;
                    }
                }
            }


        }

    }
}
