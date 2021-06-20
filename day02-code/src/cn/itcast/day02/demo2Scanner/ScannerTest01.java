package cn.itcast.day02.demo2Scanner;
/*
    1.导包    import 包路径.类名称（Java.lang包下内容不需要导包，其他都需要导包）
    2.创建    类名称 对象名 = new 类名称();
    3.使用    对象名.方法名();
 */

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);
        methodParam(sc);
        int num = sc.nextInt();
        System.out.println("输入的数字是："+num);
        int num2 = methodReturn();
        System.out.println("输入的数字是："+num2);
        int num3 = new Scanner(System.in).nextInt();
        System.out.println("输入的数字是："+num3);
        System.out.println("结果是："+sum(num,num2));
        System.out.println("最大值是："+sum(num,num2,num3));

//        String str = sc.next();
//        System.out.println("输入的数字是："+str);
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        int sum = Math.max(a, b);
        sum = sum > c ? sum : c;
        return sum;
    }
    public static int methodReturn(){
        return new Scanner(System.in).nextInt();
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的数字是："+num);
    }
}
