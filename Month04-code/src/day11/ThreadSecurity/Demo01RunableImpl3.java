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
        2.同步方法
            使用步骤：
                1.把访问了共享数据的代码抽取出来，放在一个方法中
                2.在方法上添加synchronized修饰符
            格式：
                修饰符 synchronized 返回值类型 方法名（参数列表）{
                    需要同步操作的代码（访问了共享数据的代码）
                    }

        3.锁机制
 */
public class Demo01RunableImpl3 implements Runnable {
    private static int ticket = 100;

    Object lock = new Object();

    @Override
    public void run() {
            while (true) {
                //payTicket();
                payTicketStatic();
            }
    }

    /*
        普通同步方法的锁对象是this
     */
    public synchronized void payTicket(){
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

    /*
        静态同步方法锁对象不能是this的原因：
            this是创建对象之后产生的，静态方法优先于对象
        静态方法的锁对象是本类的class属性-->class文件对象（反射）
     */
    public synchronized static void payTicketStatic(){
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
