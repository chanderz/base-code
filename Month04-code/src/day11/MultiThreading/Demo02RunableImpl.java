package day11.MultiThreading;

/**
 * *
 * * @Description：class implement Runable interface
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月12日 12:12
 * *
 */
public class Demo02RunableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
