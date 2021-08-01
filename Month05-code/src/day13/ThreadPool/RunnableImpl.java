package day13.ThreadPool;

/**
 * *
 * * @Description：Implements Runnable and overwrite run method
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月01日 16:15
 * *
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
