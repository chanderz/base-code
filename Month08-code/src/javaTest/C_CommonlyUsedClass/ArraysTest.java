package javaTest.C_CommonlyUsedClass;

import java.util.Arrays;

/**
 * *
 * * @Description：Arrays 是针对数组进行操作的工具类
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 16:11
 * *
 */
public class ArraysTest {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 24, 69, 80, 57, 13 };

        // public static String toString(int[] a) 把数组转成字符串
        System.out.println("排序前：" + Arrays.toString(arr));//排序前：[24, 69, 80, 57, 13]

        // public static void sort(int[] a) 对数组进行排序
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));//排序后：[13, 24, 57, 69, 80]

        // [13, 24, 57, 69, 80]
        // public static int binarySearch(int[] a,int key) 二分查找,要求结构必须为顺序存储结构且为有序排列
        System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));//binarySearch:2
        System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));//binarySearch:-6(key not found)
    }
}