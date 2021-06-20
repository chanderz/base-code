package cn.itcast.day03.demo6Math;
/*
请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
 */
public class MathPractice1 {
    public static void main(String[] args) {
        int count = 0;
        for (double i = -10.8 ; i < 5.9; i++){
            double j = Math.ceil(i);
            if (Math.abs(j) > 6 || Math.abs(j) < 2.1){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main2(){
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) min; i < max; i++ ){
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println(count);
    }
}
