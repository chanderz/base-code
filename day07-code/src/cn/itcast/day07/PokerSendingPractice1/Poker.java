package cn.itcast.day07.PokerSendingPractice1;

/*
    步骤：
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //准备牌
        String[] c = {"♥","♠","♣","♦"};
        String[] n = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        ArrayList<String> pokerBox = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        colors.add("♠");
        colors.add("♥");
        colors.add("♦");
        colors.add("♣");

        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        for (int i = 2; i < 11; i++) {
            numbers.add(i+"");
        }
        for (String s : c) {
            for (String s1 : n) {
                pokerBox.add(s+s1);
            }
        }
        /*for (String color : colors){
            for (String number : numbers) {
                pokerBox.add(color+number);
            }
        }*/
        pokerBox.add("大王");
        pokerBox.add("小王");

        //洗牌（随机打乱集合中元素的顺序）
        Collections.shuffle(pokerBox);

        //准备发牌
        Collection<String> card0 = new ArrayList<>();
        Collection<String> card1 = new ArrayList<>();
        Collection<String> card2 = new ArrayList<>();
        Collection<String> card3 = new ArrayList<>();

        //三张底牌
        for (int i = pokerBox.size()-3; i < pokerBox.size(); i++) {
            card0.add(pokerBox.get(i));
        }
        //发牌
        for (int i = 0; i < pokerBox.size()-3; i++){
            /*if (i > 51){
                card0.add(pokerBox.get(i));
            }*/
            if (i % 3 == 0){
                card3.add(pokerBox.get(i));
            }
            else if ((i-2) % 3 == 0){   // i % 3 == 2
                card2.add(pokerBox.get(i));
            }
            else {  // i % 3 == 1
                card1.add(pokerBox.get(i));
            }
        }
        //看牌
        System.out.println("底牌:"+card0);
        System.out.println("Billy:"+card1);
        System.out.println("Candy:"+card2);
        System.out.println("Danny:"+card3);


        /*System.out.print("底牌为：");
        for (String s : card0) {
            System.out.print(s+" ");
        }
        System.out.println("");
        System.out.print("第一手牌为：");
        for (String s : card1) {
            System.out.print(s+" ");
        }
        System.out.println("");
        System.out.print("第二手牌为：");
        for (String s : card2) {
            System.out.print(s+" ");
        }
        System.out.println("");
        System.out.print("第三手牌为：");
        for (String s : card3) {
            System.out.print(s+" ");
        }*/




    }

}
