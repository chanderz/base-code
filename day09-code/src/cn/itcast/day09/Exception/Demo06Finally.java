package cn.itcast.day09.Exception;

/**
 * @author Zhaozheng on 2021年05月30日 10:23
 */
/*
    如果finally有return语句，永远返回finally中的结果，需要避免该情况
 */
public class Demo06Finally {
    public static void main(String[] args) {
        System.out.println(getA());
    }
    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a=100;
            return a;
        }
    }
}
