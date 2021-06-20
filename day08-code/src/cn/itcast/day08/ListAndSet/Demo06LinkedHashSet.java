package cn.itcast.day08.ListAndSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo06LinkedHashSet<S> {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("北京");
        set.add("北京");
        set.add("上海");
        set.add("广州");
        set.add("深圳");
        set.add("杭州");
        set.add("南京");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("北京");
        linked.add("北京");
        linked.add("上海");
        linked.add("广州");
        linked.add("深圳");
        linked.add("杭州");
        linked.add("南京");
        System.out.println(linked);
    }
}
