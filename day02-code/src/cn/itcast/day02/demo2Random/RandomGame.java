package cn.itcast.day02.demo2Random;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static int getN() {
        return new Scanner(System.in).nextInt();
    }

    public static int generateN() {
        return new Random().nextInt(101);
    }

    public static void main(String[] args) {
        int n = generateN();
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入你猜测的数字：");
            int num = getN();
            if (num < n) {
                System.out.print("你猜的太小了！");
                if(i == 9){
                    System.out.println("你已经用尽了猜测次数！");
                    break;
                }
                System.out.println("你的剩余可猜测次数为："+ (9-i));
                continue;
            }else if (num > n){
                System.out.print("你猜的太大了！");
                if (i == 9){
                    System.out.println("你已经用尽了猜测次数！");
                    break;
                }
                System.out.println("你的剩余可猜测次数为："+ (9-i));
                continue;
            }else if (num == n){
                System.out.print("恭喜你，你猜对啦！");
                System.out.println("你猜对一共用了"+ (i+1)+"次");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}

