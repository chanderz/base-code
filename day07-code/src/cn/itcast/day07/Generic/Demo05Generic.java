package cn.itcast.day07.Generic;
/*
    泛型的通配符：？代表任意数据类型
    使用方式：不能创建对象使用，只能作为方法的参数使用
 */

import java.util.ArrayList;

public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Aaron");
        list1.add("Billy");
        list1.add("Cindy");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        printArray(list1);
        printArray(list2);
    }

    private static void printArray(ArrayList<?> list) {
        for (Object i : list) {
            System.out.println(i);
        }

    }
}
