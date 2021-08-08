package day14.SortTest;

import java.util.*;

/**
 * *
 * * @Description：使用数组存储多个Person对象，对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月08日 13:06
 * *
 */
public class SortTest {
    public static void main(String[] args) {
        //
        Person p1 = new Person("Aaron","male",28);
        Person p2 = new Person("Billy","male",30);
        Person p3 = new Person("Carry","male",27);
        Person p4 = new Person("Danny","male",32);
        Person p5 = new Person("Eric","male",28);
        ArrayList<Person> arrayList = new ArrayList<>();
        Person[] arr = { p1, p2, p3, p4, p5};
        Collections.addAll(arrayList,p1,p2,p3,p4,p5);
        Arrays.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                int result = o2.getAge() - o1.getAge();
                if (result == 0){
                    result = o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                return result;
            }
        });
        for (Person person : arr) {
            //
            System.out.println(person);
        }
        Arrays.sort(arr, (o1, o2)-> o1.getAge() - o2.getAge());
        for (Person person : arr) {
            //
            System.out.println(person);
        }
        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        for (Person person : arrayList) {
            //
            System.out.println(person);
        }
        //System.out.println(arrayList);
    }
}
