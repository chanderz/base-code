package cn.itcast.day08.Map;
/*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable:底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap：底层也是一个哈希表，是一个线程不安全集合，是多线程集合，速度快

    HashMap集合（之前学的所有集合）：可以存储null值，null键
    Hashtable集合：不能存储null值，null键

    Hashtable和vector集合一样，在jdk1.0之后被更先进的集合（HashMap、ArrayList）取代了
    Hashtable的子类Properties依然活跃在历史舞台
    Properties集合是一个唯一和IO流相结合的集合
 */

import java.util.HashMap;
import java.util.Hashtable;

public class Demo06Hashtable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);

        Hashtable<String, String> ht = new Hashtable<>();
        //ht.put(null,"a");//NullPointerException
        //ht.put("b",null);//NullPointerException
        //ht.put(null,null);//NullPointerException

    }

}
