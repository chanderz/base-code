package cn.itcast.day02.demo2ArrayList;

import java.util.ArrayList;
import java.util.Random;
class Students{
    private String name;
    private int id;

    public Students() {
    }

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class ArrayListTest002 {
    public static int generateInt() {
        Random r = new Random();
        return r.nextInt(33) + 1;
    }

    public static ArrayList<Integer> arraylist01() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            array.add(generateInt());
        }
        return array;
    }
    public static ArrayList getStudents(){
        ArrayList<Students> array = new ArrayList<>();
        Students s1 = new Students("张三",1);
        Students s2 = new Students("李四",2);
        Students s3 = new Students("王五",3);
        Students s4 = new Students("赵六",4);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        return array;
    }

    public static void main(String[] args) {
        //ArrayList<Students> array = getStudents();

        /*for (int i = 0; i < array.size(); i++) {
            Students s =  array.get(i);
            System.out.println(s.getName()+" "+s.getId());
        }*/
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arraylist.add(generateInt());
        }
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

    }
}
