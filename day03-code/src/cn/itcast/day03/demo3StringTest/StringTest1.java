package cn.itcast.day03.demo3StringTest;
/*
定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
 */
public class StringTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(getString(arr));

    }
    public static String getString(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1){
                str = str.concat("word"+arr[i]+"#");
            }
            else {
                str = str.concat("word"+arr[i]+"]");
            }
        }
        return str;
    }
}
