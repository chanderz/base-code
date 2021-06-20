package day11.ThreadSecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * *
 * * @Description：Runable Implementation Class（出现了线程安全问题）
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月12日 14:17
 * *
 */
/*
    要解决上述多线程并发访问一个资源的安全性问题:也就是解决重复票与不存在票问题，Java中提供了同步机制 (synchronized)来解决。
    三种方式完成同步操作：
        1.同步代码块
        2.同步方法
        3.锁机制
            java.util.concurrent.locks.Lock接口
            Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
            Lock接口中的方法：
                void lock()   获取锁
                void unlock() 释放锁
            java.util.concurrent.locks.ReentrantLock implements Lock接口
            使用步骤：
                1.在成员位置创建一个ReentrantLock对象
                2.在可能出现安全问题的代码前调用Lock接口中的lock获取锁
                2.在可能出现安全问题的代码后调用Lock接口中的unlock释放锁

 */
public class Demo01RunableImpl4 implements Runnable {
    private int ticket = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + " is selling No " + ticket + " ticket");
                    ticket--;
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();//无论程序是否异常都会把锁释放
                }
            }
        }
            /*while (true) {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is selling No " + ticket + " ticket");
                    ticket--;
                }
                lock.unlock();
            }*/
        }
}
