package cn.itcast.day02.demo1;

public class Demo01PhoneTest02 {
    public static void main(String[] args) {
        Demo01PhoneOne two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Demo01PhoneOne getPhone(){
        Demo01PhoneOne one = new Demo01PhoneOne();
        one.brand = "xiaomi";
        one.price = 4999;
        one.color = "black";
        return one;
    }
}
