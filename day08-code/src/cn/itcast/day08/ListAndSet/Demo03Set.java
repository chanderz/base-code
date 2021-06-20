package cn.itcast.day08.ListAndSet;
/*
    java.util.Set接口 extends Collection接口
    Set接口的特点：
        1.不允许存储重复的元素
            注：a.若有相同元素，首先调用hashCode方法比较哈希值是否相同，若相同再调用equals方法比较两个元素是否相同
               b.有部分字符的哈希值相同，如“重地”与“通话”，哈希值都为1179395
        2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
    java.util.HashSet集合 extends Set接口
    HashSet特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
        3.是一个无序集合，存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结构（查询速度特别快）
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo03Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);

        Iterator<Integer> i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for (int j : set){
            System.out.print(j);
        }
    }
}
