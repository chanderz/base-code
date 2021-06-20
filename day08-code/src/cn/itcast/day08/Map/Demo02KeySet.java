package cn.itcast.day08.Map;
/*
    Map集合的第一种遍历方式，通过键找值的方式
    Map集合中的方法：
        Set<K> keySet() 返回此映射中包含的键的Set视图
    实现步骤：
        1.使用Map集合中的方法keySet(),把Map集合所有key取出来，存储到一个Set集合中
        2.遍历Set集合，获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value

 */

import java.util.*;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Aaron",29);
        map.put("Bill",32);
        map.put("Cisco",33);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        for (String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+" = "+value);
        }
    }
}
