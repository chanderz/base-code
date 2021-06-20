package day11.ThreadSecurity;

/**
 * *
 * * @Description：Sell tickets, created 3 thread start selling shared tickets at the same time
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月12日 14:22
 * *
 */

public class Demo02TicketTest {
    public static void main(String[] args) {
        //Demo01RunableImpl1 ri = new Demo01RunableImpl1();
        //Demo01RunableImpl2 ri = new Demo01RunableImpl2();
//        Demo01RunableImpl3 ri = new Demo01RunableImpl3();
        Demo01RunableImpl4 ri = new Demo01RunableImpl4();
        Thread t0 = new Thread(ri);
        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        t0.start();
        t1.start();
        t2.start();
    }
}
