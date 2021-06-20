package cn.itcast.day04.SendRedPackTest;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Leader l = new Leader("Aaron",100);
        Member one = new Member("Marial", 12);
        Member two = new Member("Micheal", 0);
        Member three = new Member("Marc", 10);
        l.show();
        one.show();
        two.show();
        three.show();
        System.out.println("========");
        ArrayList<Integer> list = l.sendRedPack(25, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);
        l.show();
        one.show();
        two.show();
        three.show();
    }
}
