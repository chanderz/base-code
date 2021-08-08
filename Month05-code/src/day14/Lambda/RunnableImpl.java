package day14.Lambda;

/**
 * *
 * * @Description：
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月08日 9:55
 * *
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-New Thread Created");
    }
}
