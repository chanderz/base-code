package cn.itcast.day08.Map;
/*
    JDK9的新特性：
        List接口，Set接口，Map接口：里面增加了一个静态方法of，可以给集合一次性添加多个元素
        static <E> List<E> of(E... Elements)
        使用前提：
            当集合中的元素个数已经确定不再改变时使用
        注意：
            1.of方法只适用于List接口，Set接口，Map接口的实现类
            2.of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法来添加元素，会抛出异常
            3.Set接口和Map接口在调用of方法时不能有重复的元素，否则会抛出异常
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo07JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c");
        System.out.println(list);
        //list.add("a");    //UnsupportedOperationException

        //Set<Integer> set = Set.of(1,3,5,1); //IllegalArgumentException
        Set<Integer> set = Set.of(1,3,5);
        System.out.println(set);
        //set.add(4);     //UnsupportedOperationException

        Map<String, Integer> map = Map.of("Aaron",12,"Bill",13);
        //Map<String, Integer> map = Map.of("Aaron",12,"Bill",13,"Aaron",14);////IllegalArgumentException
        System.out.println(map);
        //map.put("Call", 14);    //UnsupportedOperationException


    }
}
