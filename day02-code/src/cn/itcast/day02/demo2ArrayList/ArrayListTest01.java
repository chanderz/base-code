package cn.itcast.day02.demo2ArrayList;

import java.util.ArrayList;

/*
    但ArrayList集合的长度可以随意变化；
    对于ArrayList来说，有一个尖括号<E>代表泛型；
    泛型：装在集合当中的所有元素，全都是统一的什么类型；
    注意：泛型只是引用类型，不是基本类型；

    注意事项：
    对于ArrayList集合来说，直接打印得到的不是地址值，而是内容；
    如果内容为空，得到的是空的中括号[]；

    public boolean add(E e);
    public E get(int index);
    public E remove(int index);
    public int size();
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println("是否添加成功？"+list.add("Aaron"));
        list.add("Bieber");
        list.add("Conna");
        list.add("Danny");
        list.add("Eric");
        System.out.println(list);
        System.out.println("第2号索引位置："+list.get(1));
        System.out.println("集合长度为："+list.size());
        System.out.println("删掉的第3号索引位置元素是："+list.remove(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("遍历的第"+(i+1)+"个元素是："+list.get(i));
        }
    }
}
