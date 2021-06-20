package cn.itcast.day05.RedPack;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int Money = totalMoney;
        int Count = totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            list.add(randomGenerate(Money,Count));
            Money -= list.get(i);
            Count--;
        }
        list.add(Money);
        return list;
    }
    public static int randomGenerate(final int totalMoney, final int totalCount){
        int avg = totalMoney / totalCount;
        Random r = new Random();
        return r.nextInt(2*avg)+1;
    }
}
