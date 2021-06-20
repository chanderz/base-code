package cn.itcast.day10.MultiThreading;

/**
 * *
 * * @Description：Create a thread extends Thread class
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月06日 13:14
 * *
 */
/*
    1.使用Thread方法中的getName()
        String getName()返回该线程的名称
    2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
        static Thread currentThread()返回当前正在执行的线程对象引用
 */
public class Demo02MyThread extends Thread{
    public Demo02MyThread(){
    }
    public Demo02MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
        Thread thread = currentThread();
        System.out.println(thread);
        String n = thread.getName();
        System.out.println(n);
        for (int i = 0; i < 10; i++) {
            System.out.println("run:"+getName()+"-"+i);
        }
    }
}
