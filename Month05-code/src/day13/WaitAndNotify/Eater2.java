package day13.WaitAndNotify;

/**
 * *
 * * @Description：Eater class(Thread class)
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月01日 14:02
 * *
 */
public class Eater2 extends Thread{
    private Baozi bz;
    public Eater2(Baozi bz){
        this.bz = bz;
    }
    @Override
    public void run(){
        while (true){
            synchronized (bz){
                System.out.println("吃货二号要吃包子");
                if (!bz.condition){
                    try {
                        bz.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货二号正在吃："+bz.getPi()+bz.getXian()+"包子");
                bz.condition = false;
                bz.notify();
                System.out.println("吃货二号吃完了："+bz.getPi()+bz.getXian()+"包子");
                System.out.println("-----------");
            }
        }
    }
}
