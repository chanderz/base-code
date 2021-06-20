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
    线程会出现的问题：重复，超范围
    解决办法：让一个线程在访问共享数据时，无论是否失去了CPU的执行权，都要让其他线程只能等待，直到当前线程访问完成
 */
public class Demo01RunableImpl1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " is selling No " + ticket + " ticket");
                ticket--;
            }
        }
    }
}
