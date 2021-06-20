package cn.itcast.day02.demo2Random;
import java.util.Random;
import java.util.Scanner;

public class RandomTest01 {
    public static void main(String[] args) {
        int n = getN();
        Random r = new Random();
        System.out.println("随机数是：");
        for (int i = 0; i < 100; i++) {
            System.out.print(r.nextInt(n)+1+" ");
        }
    }
    public static int getN(){
        return new Scanner(System.in).nextInt();
    }
}
