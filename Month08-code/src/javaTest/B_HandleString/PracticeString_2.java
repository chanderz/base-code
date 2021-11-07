package javaTest.B_HandleString;

/**
 * *
 * * @Description：把数组中的数据按照指定个格式拼接成一个字符串。举例：int[] arr = {1,2,3};输出结果：[1, 2, 3]
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 13:34
 * *
 */
public class PracticeString_2 {
    public static String arrayToString(int[] arr){
        String s = "[";
        for (int i : arr) {
            if (i == arr.length) {
                s += i;
            }
            else {
                s += i + ",";
            }
        }
        s += "]";
        return s;
    }
    public static StringBuffer arrayToStringBuffer(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i : arr) {
            if (i == arr.length){
                sb.append(i);
            }
            else {
                sb.append(i).append(",");
            }
        }
        sb.append("]");
        return sb;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arrayToString(arr));
        System.out.println(arrayToString(arr).getClass());

        System.out.println(arrayToStringBuffer(arr));
        System.out.println(arrayToStringBuffer(arr).toString());
        System.out.println(arrayToStringBuffer(arr).toString().getClass());
        System.out.println(arrayToStringBuffer(arr).getClass());

    }
}
