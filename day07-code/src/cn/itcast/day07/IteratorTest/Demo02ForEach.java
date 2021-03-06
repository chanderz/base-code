package cn.itcast.day07.IteratorTest;
/*
    增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
    是JDK1.5后出现的新特性
    Collection<E>extends Iterable<E>:所有单列集合都可以使用增强for
    public interface Iterable<T>实现这个接口允许对象成为“foreach”语句的目标

    格式：
    for(集合/数组的数据类型 变量名:集合名/数组名）{
        sout(变量名)
    }
 */

import java.util.ArrayList;
import java.util.Collection;

public class Demo02ForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int i : arr){
            System.out.println(i);
        }

        System.out.println("=============");
        Collection<String> coll = new ArrayList<>();
        coll.add("YaoMing");
        coll.add("Kobe");
        coll.add("Lebron");
        coll.add("Duncan");
        for (String s : coll){
            System.out.println(s);
        }
    }
}
