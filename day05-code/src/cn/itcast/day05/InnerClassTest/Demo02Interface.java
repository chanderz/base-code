package cn.itcast.day05.InnerClassTest;


import java.util.ArrayList;
import java.util.List;

public class Demo02Interface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static List<String> addNames(List<String> list) {
        list.add("马尔扎哈");
        return list;
    }
}
