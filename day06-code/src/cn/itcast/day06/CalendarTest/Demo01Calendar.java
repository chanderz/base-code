package cn.itcast.day06.CalendarTest;
/*
java.util.Calendar类：日历类
Calendar是一个抽象类，里面提供了许多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR)
Calendar类无法直接创建对象使用，里面有一个静态方法叫getInstance()，该方法返回了Calendar类的子类对象
static Calendar getInstance()使用默认时区和语言环境获得一个日历
注：西方月份从0开始，东方从1开始
 */

import java.util.Calendar;
import java.util.Date;

/*
public int get(int field)：返回给定日历字段的值。
public void set(int field, int value)：将给定的日历字段设置为给定值。
public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
        System.out.println(c);

        c.set(2022, 10,12);
        c.set(Calendar.YEAR,1222);
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        int day = c.get(Calendar.DATE);
        System.out.println(day);

        System.out.println("============");

        c.add(Calendar.YEAR,-1);
        c.add(Calendar.MONTH,-1);
        c.add(Calendar.DATE,-1);

        year = c.get(Calendar.YEAR);
        System.out.println(year);

        month = c.get(Calendar.MONTH);
        System.out.println(month);

        day = c.get(Calendar.DATE);
        System.out.println(day);



    }
}
