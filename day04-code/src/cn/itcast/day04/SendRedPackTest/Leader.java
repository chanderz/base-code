package cn.itcast.day04.SendRedPackTest;

import java.util.ArrayList;

public class Leader extends Users{
    public Leader() {
    }

    public Leader(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendRedPack(int totalMoney, int count){
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return  list;
        }
        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int rest = totalMoney % count;
        for (int i = 0; i < count-1; i++) {
            list.add(avg);
        }
        int last = avg + rest;
        list.add(last);
        return list;
    }
}
