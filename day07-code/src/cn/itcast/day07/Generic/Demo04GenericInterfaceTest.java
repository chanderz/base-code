package cn.itcast.day07.Generic;

public class Demo04GenericInterfaceTest {
    public static void main(String[] args) {
        Demo04GenericInterfaceImpl1 dgi = new Demo04GenericInterfaceImpl1();
        dgi.method("12932");

        Demo04GenericInterfaceImpl2<String> gdi2 = new Demo04GenericInterfaceImpl2<>();
        gdi2.method("hahah");
    }
}
