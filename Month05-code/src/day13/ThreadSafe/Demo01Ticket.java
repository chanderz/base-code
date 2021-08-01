package day13.ThreadSafe;

/**
 * *
 * * @Description：模拟卖票案例，创建三个线程，同时开启，对共享的票进行出售
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月01日 10:49
 * *
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread r1 = new Thread(r);
        Thread r2 = new Thread(r);
        Thread r3 = new Thread(r);
        r1.start();
        r2.start();
        r3.start();
    }
}
