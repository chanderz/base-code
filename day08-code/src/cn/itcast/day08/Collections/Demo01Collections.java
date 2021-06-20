package cn.itcast.day08.Collections;
/*
    - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
    - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
    - public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        注意：sort(List<T> list)使用前提
            被排序的集合里面存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序规则
            Comparable接口排序规则：this（自己）- 参数：升序
    - public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。
        注意：Comparator排序规则：o1 - o2为升序，o2 - o1为降序

    Comparator和Comparable的区别：
        Comparable：自己（this）和别人参数比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
        Comparator：相当于找了个第三方裁判比较两个
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "北京","上海","杭州","苏州");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Person p1 = new Person("西安",34);
        Person p3 = new Person("w成都",28);
        Person p2 = new Person("武汉",36);
        Person p4 = new Person("s长沙",28);
        ArrayList<Person> list1 = new ArrayList<>();
        Collections.addAll(list1, p1, p2, p3, p4);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge()-o2.getAge(); //升序，o2-o1降序
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list1);
    }
}
