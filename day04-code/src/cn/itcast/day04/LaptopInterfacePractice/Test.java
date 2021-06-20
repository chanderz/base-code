package cn.itcast.day04.LaptopInterfacePractice;

public class Test {
    public static void main(String[] args) {
        Laptop computer = new Laptop();
        computer.run();
        USBInterface usb1 = new Mouse();
        //usb1.openDevice();
        computer.USBUsing(usb1);
        USBInterface usb2 = new KeyBoard();
        computer.USBUsing(usb2);
        computer.Close(usb1,usb2);
    }
}
