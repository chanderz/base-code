package cn.itcast.day08.ListAndSet;
/*
    java.util.List接口 extends Collection接口
    list接口特点：
        1，有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
        2.有索引，包含了一些带索引的方法
        3.允许存储重复的元素

    list接口带索引的方法（特有）：
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。

    注意：
        操作索引的时候一定要注意越界异常
        IndexOutOfBoundsException:索引越界异常，集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);//重写了toString方法

        list.add(3,"北京");
        System.out.println(list);

        String r = list.remove(2);
        System.out.println(list);
        System.out.println("remove方法返回移除的值："+r);

        String s = list.set(0,"上海");
        System.out.println(list);
        System.out.println("set方法返回更新前的值："+s);

        String g = list.get(1);
        System.out.println(list);
        System.out.println("get方法得到的值："+g);


        System.out.println("======================");

        //list集合遍历的三种方式
        //------使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------------");

        //------使用迭代器
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("------------------");

        //使用增强for
        for (String st : list){
            System.out.println(st);
        }
    }
}
