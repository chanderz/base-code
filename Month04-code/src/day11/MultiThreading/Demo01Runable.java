package day11.MultiThreading;

/**
 * *
 * * @Description：创建多线程程序的第二种方式：Runable接口
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月12日 11:09
 * *
 */
/*
    java.lang.Runable
    Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法。
    java.lang.Thread的构造方法：
        Thread(Runnable target)
          分配新的 Thread 对象。
        Thread(Runnable target, String name)
          分配新的 Thread 对象。
    实现步骤：
        1.创建Runable接口的实现类
        2.在实现类中重写Runable接口中的Run方法，设置线程任务
        3.创建一个Runable接口的实现类对象
        4.创建Thread类对象，构造方法中传递Runable接口的实现类对象
        5.调用Thread类中的start方法，开启新的线程执行run方法

    实现Runable接口创建多线程的好处：
        1.避免了单继承的局限性
            一个类只能继承一个类，类继承了Thread类就不能继承其他类
            实现Runable接口，还可以继承其他类，实现其他接口
        2.增强了程序的扩展性，降低了程序的耦合性（解耦）
            实现Runable接口的方式，把设置线程任务和开启新线程进行了分离（解耦）
            实现类中，重写了run方法：用来设置线程任务
            创建Thread类对象，调用start方法：开启新线程
 */
public class Demo01Runable {
    public static void main(String[] args) {
        Demo02RunableImpl ri = new Demo02RunableImpl();
        //Thread thread = new Thread(ri);//打印线程名称
        Thread thread = new Thread(new Demo03RunableImpl2());
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
