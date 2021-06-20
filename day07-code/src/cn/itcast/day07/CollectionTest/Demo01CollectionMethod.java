package cn.itcast.day07.CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * public boolean add(E e)：  把给定的对象添加到当前集合中 。
 * public void clear() :清空集合中所有的元素。
 * public boolean remove(E e): 把给定的对象在当前集合中删除。
 * public boolean contains(E e): 判断当前集合中是否包含给定的对象。
 * public boolean isEmpty(): 判断当前集合是否为空。
 * public int size(): 返回集合中元素的个数。
 * public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class Demo01CollectionMethod {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("My");
        coll.add("First");
        coll.add("Collection");
        boolean x = coll.add("Test");
        System.out.println(x);
        System.out.println(coll);
        //coll.clear();
        //boolean z = coll.isEmpty();
        //System.out.println(z);
        //System.out.println(coll);
//        boolean y = coll.remove("My");
//        System.out.println(y);
//        System.out.println(coll);
        boolean w = coll.contains("My");
        System.out.println(w);
        int v = coll.size();
        System.out.println(v);
        System.out.println("=======");
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
