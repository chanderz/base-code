package cn.itcast.day02.demo1;

public class Demo01PhoneTest {
    public static void main(String[] args) {
        Demo01PhoneOne phone = new Demo01PhoneOne();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("===========");
        phone.brand = "apple";
        phone.price = 9299;
        phone.color = "seablue";
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        phone.call("jobs");
        phone.sendmessage();
    }
}
