package day13.WaitAndNotify;

/**
 * *
 * * @Description：produce Baozi（Thread class）
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月01日 13:33
 * *
 */
public class BaoziPu extends Thread {
    private Baozi bz;
    public BaoziPu(Baozi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.condition) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.setPi("薄皮");
                    bz.setXian("粉丝");
                } else {
                    bz.setPi("厚皮");
                    bz.setXian("牛肉");
                }
                count++;
                System.out.println("包子铺正在生产" + bz.getPi() + bz.getXian() + "包子");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.condition = true;
                bz.notifyAll();
                System.out.println("包子生产完成：" + bz.getPi() + bz.getXian());
                System.out.println("-----------");
            }
        }
    }
}
