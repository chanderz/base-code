package day13.ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * *
 * * @Description：实现卖票实例
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月01日 10:06
 * *
 */
public class RunnableImpl implements Runnable{
    Lock lock = new ReentrantLock();

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket>0) {
                try {
                    Thread.sleep(1); //提供安全问题出现的几率
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"--正在卖第"+ticket+"张票");
                ticket--;
            }
            lock.unlock();
        }
    }
}
