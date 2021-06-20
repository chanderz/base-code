package day11.ThreadSecurity;

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
            synchronize(锁对象){
                需要同步操作的代码（访问了共享数据的代码）
            }
            注意：
                1.同步代码块中的锁对象，可以使用任意对象
                2.但是必须保证多个线程使用的锁对象是同一个
                3.锁对象作用：把同步代码块锁住，只允许一个线程在同步代码块中执行
                4.谁拿到锁就进入代码块,其他的线程只能在外等着 (BLOCKED)。直到锁被归还（线程在同步代码块中执行完毕）
        2.同步方法
        3.锁机制
 */
public class Demo01RunableImpl2 implements Runnable {
    private int ticket = 100;

    Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is selling No " + ticket + " ticket");
                    ticket--;
                }
            }
        }
    }
}
