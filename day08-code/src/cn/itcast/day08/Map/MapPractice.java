package cn.itcast.day08.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/*
    计算一个字符串中每个字符出现次数
 */
public class MapPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.next();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = sc.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)){
                Integer value = map.get(aChar);
                map.put(aChar,++value);
            }
            else {
                map.put(aChar,1);
            }
            /*if (map.get(aChar) != null){
                Integer value =  map.get(aChar);
                map.put(aChar,++value);
            }else {
                map.put(aChar, 1);
            }*/
        }
        for (Character c : map.keySet()){
            System.out.print(c+"有"+map.get(c)+"个，");
        }

    }
}
