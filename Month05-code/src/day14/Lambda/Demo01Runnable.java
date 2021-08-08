package day14.Lambda;

/**
 * *
 * * @Description：
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月08日 9:57
 * *
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread thread = new Thread(r);
        thread.start();

        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-New Thread Created-");
            }
        };
        new Thread(runnable).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--New Thread Created");
            }
        }).start();
    }
}
