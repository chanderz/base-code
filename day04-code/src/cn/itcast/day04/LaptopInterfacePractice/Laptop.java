package cn.itcast.day04.LaptopInterfacePractice;

public class Laptop{
    public void run(){
        System.out.println("电脑启动");
    }
    public void USBUsing(USBInterface usb){
        if(usb != null){
            usb.openDevice();
            if (usb instanceof Mouse){
                Mouse usbm = (Mouse) usb;
                usbm.click();
            }
            if (usb instanceof KeyBoard){
                KeyBoard usbk = (KeyBoard) usb;
                usbk.type();
            }
        }
    }
    public void Close(USBInterface usb1,USBInterface usb2){
        usb1.closeDevice();
        usb2.closeDevice();
        System.out.println("笔记本关闭");
    }

}
