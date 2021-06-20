package cn.itcast.day08.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
    java.util.Map<k,v>集合
    Map<k,v>集合特点：
        1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
        2.Map集合中的元素，key和value的数据类型可以相同也可以不同
        3.Map集合中的元素，key值不允许重复，value值可以重复
        4.Map集合中的元素，key和value是一一对应的

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点：
        1.HashMap集合底层是哈希表：查询速度特别快
            JDK1.8之前：数组+单向链表
            JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询的速度
        2.HashMap集合是一个无序的集合，存储元素与取出元素的顺序有可能不一致

    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap的特点：
        1.LinkedHashMap集合底层是哈希表+链表
        2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        show01();
    }

    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
        public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
     */
    private static void show01() {
        Map<String,String> map = new HashMap<>();
        map.put("上海","东方明珠");
        String v1 = map.put("北京","故宫");
        map.put("杭州","西湖");
        System.out.println(map);
        String v2 = map.put("北京","长城");
        System.out.println(v1+v2);
        System.out.println(map);

        String v3 = map.remove("北京");
        System.out.println(v3);
        System.out.println(map);

        String s = map.get("上海");
        System.out.println(s);

        System.out.println(map.containsKey("北京"));
        System.out.println(map.containsKey("上海"));

        Set<String> set = map.keySet();
        System.out.println(set);

        Set<Map.Entry<String, String>> set1 = map.entrySet();
        System.out.println(set1);
    }
}
