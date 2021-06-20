package cn.itcast.day04.LaptopInterfacePractice;

import jdk.swing.interop.SwingInterOpUtils;

public class KeyBoard implements USBInterface {
    @Override
    public void openDevice() {
        System.out.println("键盘连接笔记本成功");
    }

    @Override
    public void closeDevice() {
        System.out.println("键盘断开笔记本成功");
    }
    public void type(){
        System.out.println("键盘打字");
    }
}
