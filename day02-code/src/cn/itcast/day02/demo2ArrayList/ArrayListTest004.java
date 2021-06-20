package cn.itcast.day02.demo2ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
    用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
    要求：使用自定义的方法来实现筛选
 */
public class ArrayListTest004 {
    public static int getRandom(){
        //Random r = new Random();
        //return r.nextInt(100);
        return new Random().nextInt(20)+1;
    }
    public static ArrayList<Integer> option(ArrayList<Integer> list){
        ArrayList<Integer> smallA = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                smallA.add(list.get(i));
            }
        }
        return smallA;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(getRandom());
        }
        ArrayList<Integer> smallList = option(list);
        System.out.println(list);
        System.out.println(smallList);
        System.out.println("偶数总共有："+smallList.size()+"个");
    }
}
