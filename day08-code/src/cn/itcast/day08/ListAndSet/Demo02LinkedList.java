package cn.itcast.day08.ListAndSet;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合特点：
        1.底层是一个链表结构：查询慢，增删块
        2.里面包含了大量操作收尾元素的方法
        注意：使用LinkList集合特有的方法，不能使用多态

    * public void addFirst(E e):将指定元素插入此列表的开头。
    * public void addLast(E e):将指定元素添加到此列表的结尾。
    * public void push(E e):将元素推入此列表所表示的堆栈。相当于addFirst

    * public E getFirst():返回此列表的第一个元素。
    * public E getLast():返回此列表的最后一个元素。

    * public E removeFirst():移除并返回此列表的第一个元素。
    * public E removeLast():移除并返回此列表的最后一个元素。
    * public E pop():从此列表所表示的堆栈处弹出一个元素。相当于removeFirst

    * public boolean isEmpty()：如果列表不包含元素，则返回true。
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        //show01(linked);
        //show02(linked);
        show03(linked);
        linked.clear();
        show03(linked);
    }

    private static void show03(LinkedList<String> linked) {
        if (!linked.isEmpty()){
            String s = linked.removeFirst();
            System.out.println(linked);
            String s1 = linked.removeLast();
            String s2 = linked.pop();
            System.out.println(s);
            System.out.println(s1);
            System.out.println(s2);
        }
        else {
            System.out.println("集合为空");
        }
    }

    private static void show02(LinkedList<String> linked) {
        String s = linked.get(1);
        System.out.println("get:"+s);
        String s1 = linked.getFirst();
        System.out.println("getFirst:"+s1);
        String s2 = linked.getLast();
        System.out.println("getLast:"+s2);
    }

    private static void show01(LinkedList<String> linked) {
        System.out.println(linked);
        linked.addFirst("天津");
        System.out.println(linked);
        linked.push("广州");
        linked.addLast("深圳");
        System.out.println(linked);
    }
}
