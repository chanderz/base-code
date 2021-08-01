package day13.WaitAndNotify;

/**
 * *
 * * @Description：test class
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月01日 14:07
 * *
 */
/*
    进入到TimeWaiting（计时等待）有两种方式
    1.使用sleep(long m)方法，在毫秒值结束后，线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法，wait方法如果在毫秒值结束后还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态

    唤醒方法：
    void notify() 唤醒此对象监视器上等待的单个线程
    void notifyAll() 唤醒此对象监视器上等待的所有线程
 */
public class test {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        bz.condition = false;
        new BaoziPu(bz).start();
        new Eater1(bz).start();
        new Eater2(bz).start();
    }
}
