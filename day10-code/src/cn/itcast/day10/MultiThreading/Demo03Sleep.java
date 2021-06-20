package cn.itcast.day10.MultiThreading;

/**
 * *
 * * @Description：public static void sleep(long mills):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月06日 16:54
 * *
 */
public class Demo03Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            //睡眠1s
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
