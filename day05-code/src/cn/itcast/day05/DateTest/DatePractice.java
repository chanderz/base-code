package cn.itcast.day05.DateTest;
/*
    练习：请使用日期时间相关API，计算一个人已经出生了多少天
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DatePractice {
    public static void main(String[] args) throws ParseException{
        System.out.println("请输入您的出生日期：");
        String birthday = input();
        Date date = getDate(birthday);
        long d = getDays(date);
        System.out.println(d);
    }

    public static String input() {
        return new Scanner(System.in).next();
    }
    public static long getDays(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println("date:"+date);
        long d = date.getTime();
//        Date today = new Date();
//        System.out.println("dateN:"+today);
//        long dt = today.getTime();
        long dt = new Date().getTime();
        long day = dt - d;
        day = day/3600/24/1000;
        return  day;
    }
    public static Date getDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.parse(s);
    }
}
