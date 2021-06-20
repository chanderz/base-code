package cn.itcast.day10.MultiThreading;

/**
 * *
 * * @Description：创建多线程程序的第一种方式--创建Thread类的子类
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月06日 9:56
 * *
 */
/*
    Intel Core（核心） i7 8866 - 4核心8线程（同时执行8个任务）
    进程：软件运行时会进入到内存中，这就是一个进程
    线程：点击功能执行，就会开启一条应用程序到CPU的执行路径，CPU就可以通过这个路径执行功能，这个路径就叫线程
    注意：线程属于进程，是进程中的一个执行单元，负责程序的执行

    主线程：执行主(main)方法的的线程

    单线程程序：java程序中只有一个线程
    执行从main方法开始，从上到下依次执行

    JVM执行main方法，main方法会进入到栈内存
    JVM会找操作系统开辟一条main方法通向CPU的执行路径
    CPU就可以通过这个路径来执行main方法
    这个路径就叫main（主）线程
 */
/*
    创建多线程程序的第一种方式：创建Thread的子类
    java.lang.Thread类：是描述线程的类，我们想要实现多线程的程序，就必须继承Thread类
    实现步骤：
        1.创建一个Thread的子类
        2.在Thread类的子类中重写run方法，设置线程任务（开启线程要做什么？）
        3.创建Thread类的子类对象
        4.调用Thread类中的start方法，开启新的线程，执行run方法
            void start() 使线程开始执行；java虚拟机调用该线程的run方法
            结果是两个线程并发的进行；当前线程（main线程）和另一个线程（创建的新线程，执行其run方法）
            多次启动一个线程是非法的，特别是当线程已经结束后，不能再重新启动
    java程序是抢占式调度，哪个线程优先级高，哪个线程先执行，同一优先级随机选择一个执行
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Demo02MyThread mt = new Demo02MyThread();

        //mt.start();//会开辟新的栈空间，与main方法所开辟的栈空间同步进行（直接用mt.run会在main方法的栈空间中运行（单线程））
        new Demo02MyThread().start();
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！"+i);
        }
    }
}
