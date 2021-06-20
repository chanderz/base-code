package cn.itcast.day05.RedPack;

public class Bootstrap {
    public static void main(String[] args) {
        RedPacketFrame rpf = new MyRed("just a test");
        rpf.setOwnerName("乔布斯");
        OpenMode om = new NormalMode();
        OpenMode or = new RandomMode();
        rpf.setOpenWay(or);
        }
    }
