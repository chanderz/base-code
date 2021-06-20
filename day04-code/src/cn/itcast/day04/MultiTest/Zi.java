package cn.itcast.day04.MultiTest;

public class Zi extends Fu{
    int num = 10;
    @Override
    public void method() {
        System.out.println("子类方法");
    }
    public void showNum(){
        System.out.println(num);
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
