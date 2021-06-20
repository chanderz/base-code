package cn.itcast.day07.IteratorTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口：迭代器（对集合进行遍历）
 boolean hasNext()
          如果仍有元素可以迭代，则返回 true。
 E next()
          返回迭代的下一个元素。
 void remove()
          从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。

Iterator是接口，无法直接使用，需要使用接口实现类
Collection接口中有个方法iterator()，这个方法返回的就是迭代器的实现类对象
    Iterator<E> iterator()返回此collection的元素上进行迭代的迭代器

迭代器使用步骤（重点）：
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
    2.使用Iterator接口中的hasNext判断还有没有下一个元素
    3.使用Iterator接口中的next取出元素中的下一个元素

 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("YaoMing");
        coll.add("Kobe");
        coll.add("Lebron");
        coll.add("Duncan");
        coll.add("Parker");
        coll.add("Harden");
        coll.add("Curry");

        Iterator<String> it = coll.iterator();
        /*for (int i = 0; i < coll.size(); i++) {
            boolean b = it.hasNext();
            System.out.println(b);
            String s = it.next();
            System.out.println(s);
        }*/
        System.out.println("=======");
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("========");
        for (String i : coll){
            System.out.println(i);
        }

    }
}
