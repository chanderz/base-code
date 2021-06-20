package cn.itcast.day02.demo2ArrayList;

import java.util.ArrayList;

public class ArrayListTest003 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("Aaron");
        al.add("Sherry");
        al.add("Conna");
        al.add("Billy");
        System.out.println(al);
        printArrayList(al);
    }
    public static void printArrayList(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (i != 0 && i != list.size()-1){
                System.out.print(list.get(i)+"@");
            }
            else if (i == 0){
                System.out.print("{"+list.get(i));
            }
            else {
                System.out.println(list.get(i)+"}");
            }
        }
    }

}
