package cn.itcast.day07.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        //show1();
        show2();
    }

    /*
    <E>Element
    <T>Type
        创建集合对象，使用泛型
        好处：
            1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
            2.把运行期异常（代码运行之后会抛出异常），提示到了编译期（写代码的时候会报错）
        弊端：
            泛型是什么类型，只能存储什么类型的数据
     */
    private static void show2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }

    /*
        创建集合对象，不使用泛型
        好处：集合不使用泛型默认为Object类型，可以存储任何类型的数据
        弊端：不安全，会引发异常
     */
    private static void show1() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);

        /*
        想使用String类特有方法，需要向下转型
        向下转型后，使用length()方法会抛出异常
         */
            String s = (String) obj;
            System.out.println(s.length());
        }
    }
}
