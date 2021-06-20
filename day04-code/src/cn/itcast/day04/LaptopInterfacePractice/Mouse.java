package cn.itcast.day04.LaptopInterfacePractice;

public class Mouse implements USBInterface{
    @Override
    public void openDevice() {
        System.out.println("鼠标连接笔记本成功");
    }

    @Override
    public void closeDevice() {
        System.out.println("鼠标断开笔记本成功");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
