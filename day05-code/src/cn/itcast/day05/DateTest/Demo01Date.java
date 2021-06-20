package cn.itcast.day05.DateTest;

import java.util.Date;

/*
java.util.Date:表示日期和时间的类
类Date表示特定的瞬间，精确到毫秒：1秒=1000毫秒
毫秒值的作用：可以对时间和日期进行计算：可以把日期转换为毫秒计算，计算完毕把毫秒转换为日期
时间原点：1970年1月1日 00:00:00（英国格林尼治时间）
意思是计算当前时间到时间原点之间一共经历了多少毫秒（long类型值）
注：中国属于东八区，会把时间增加8小时
Date()获取当前系统的时间和日期
Date(long date)带参数（毫秒值，类型为long），把毫秒值转换为Date
long getTime()把日期转换为毫秒（相当于System.currentTimeMillis())
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        demo01();
    }

    private static void demo01() {
        Date date = new Date();
        System.out.println(date);  //Sun Apr 18 09:09:06 CST 2021
        Date date2 = new Date(238923822398L);
        System.out.println(date2);
        long time = date.getTime();
        System.out.println(time);
    }
}
