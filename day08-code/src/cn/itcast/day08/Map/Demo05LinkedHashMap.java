package cn.itcast.day08.Map;
/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序
    底层原理：
        哈希表+链表（记录元素顺序）
 */

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "a");
        map.put("b", "b");
        map.put("a", "c");
        System.out.println(map);    //key值不允许重复

        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("c", "a");
        map1.put("a", "a");
        map1.put("b", "b");
        map1.put("a", "c");
        System.out.println(map1);

    }
}
