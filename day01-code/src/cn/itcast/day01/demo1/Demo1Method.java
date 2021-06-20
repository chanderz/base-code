package cn.itcast.day01.demo1;

public class Demo1Method {
    public static void main(String[] args) {
        System.out.println(compare(10, 209));
        print(2);
    }

    public static boolean compare(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static void print(int a){
        for(int i=1; i<=a; i++){
            System.out.println("hello,world!");
        }
    }
}
