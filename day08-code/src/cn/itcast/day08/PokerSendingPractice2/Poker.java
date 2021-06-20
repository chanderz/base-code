package cn.itcast.day08.PokerSendingPractice2;
/*
    具体规则：

1. 组装54张扑克牌将
2. 54张牌顺序打乱
3. 三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
4. 查看三人各自手中的牌（按照牌的大小排序）、底牌
    > 规则：手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3

##
 */

import java.util.*;

public class Poker {
    public static void main(String[] args) {
        /*
            组装54张牌
         */
        HashMap<Integer,String> poker = new HashMap<>();
        List<String> colors = List.of("♠","♥","♣","♦");
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int cout = 0;
        poker.put(++cout,"BigKing");
        poker.put(++cout,"JuniorKing");
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(++cout,color+number);
            }
        }
        //取出编号集合
        Set<Integer> numberAll = poker.keySet();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        Collections.addAll(numberAll);

        //打乱牌顺序
        Collections.shuffle(pokerIndex);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        for (int j = 1; j <= pokerIndex.size(); j++) {
            if (j > 51){
                list4.add(pokerIndex.get(j-1));
            }
            else if (j % 3 == 1) {
                list1.add(pokerIndex.get(j-1));
            }
            else if (j % 3 == 2) {
                list2.add(pokerIndex.get(j-1));
            }
            else  {
                list3.add(pokerIndex.get(j-1));
            }
        }

        LinkedHashMap<Integer,String> player1 = new LinkedHashMap<>();
        LinkedHashMap<Integer,String> player2 = new LinkedHashMap<>();
        LinkedHashMap<Integer,String> player3 = new LinkedHashMap<>();
        LinkedHashMap<Integer,String> bottomPoker = new LinkedHashMap<>();
        player1 = sortPoker(list1,poker);
        System.out.println("player1:"+player1);

        /*Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Collections.sort(list3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (Integer integer : list1) {
            player1.put(integer,poker.get(integer));
        }
        for (Integer integer : list2) {
            player2.put(integer,poker.get(integer));
        }
        for (Integer integer : list3) {
            player3.put(integer,poker.get(integer));
        }
        for (Integer integer : list4) {
            bottomPoker.put(integer,poker.get(integer));
        }
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player1);
        System.out.println("player3:"+player1);
        System.out.println("bottomPoker:"+bottomPoker);*/
    }
    public static LinkedHashMap<Integer,String> sortPoker(List<Integer> list, HashMap<Integer,String> poker) {
        LinkedHashMap<Integer,String> player = new LinkedHashMap<>();
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer integer : list) {
            player.put(integer,poker.get(integer));
        }
        return player;
    }
}
