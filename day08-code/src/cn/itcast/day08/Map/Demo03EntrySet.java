package cn.itcast.day08.Map;
/*
    Map集合遍历的第二种方式：使用Entry对象遍历
    Map集合中的方法：
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的Set视图
    实现步骤：
        1.使用Map集合中的方法EntrySet(),把Map集合中的多个Entry对象取出来，存储到一个Set集合中
        2.遍历Set集合，获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */

import java.util.*;

public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Aaron",29);
        map.put("Bill",32);
        map.put("Cisco",33);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
