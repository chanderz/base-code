package day11.MultiThreading;

/**
 * *
 * * @Description：Anomynous inner class implementation thread build
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月12日 12:41
 * *
 */
/*
    匿名内部类方式实现线程的创建

    匿名内部类的作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象合一步完成
        把实现类实现类接口，重写接口中的方法，创建实现类对象合一步完成
    匿名内部类的最终产物：子类/实现类对象
    格式：
        new 父类/接口(){
            重复父类/接口中的方法
        }
 */
public class Demo04InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        // new MyThread().start();
        new Thread(){
            //重写run方法，设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();

        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"Software Engineer");
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"Senior Software Engineer");
                }
            }
        }).start();

    }
}
