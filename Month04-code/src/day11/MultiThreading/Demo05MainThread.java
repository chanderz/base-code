package day11.MultiThreading;

/**
 * *
 * * @Description：Main method executed by thread
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月12日 13:54
 * *
 */
/*
    主线程：执行主方法（main）的线程
    执行从main方法开始，从上到下依次执行

 */
public class Demo05MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("Bill");
        p1.start();
        Person p2 = new Person("Aaron");
        p2.start();
    }
}
