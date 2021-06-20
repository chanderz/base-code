package cn.itcast.day05.DateTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat:是日期/时间格式化子类的抽象类
作用；格式化（日期->文本）、解析（文本->日期）
成员方法：
    String format(Date date):按照指定模式，把Date日期格式化为符合模式的字符串
    Date parse(String source):把符合模式的字符串，转换成Date日期
DateFormat类是抽象类，无法直接创建对象使用，可以使用DateFormat的子类SimpleDateFormat
java.text.SimpleDateFormat extends DateFormat
构造方法：
        SimpleDateFormat(String pattern):参数为指定的模式
        yyyy-MM-dd HH:mm:ss
        yyyy年MM月dd天 HH时mm分ss秒
 */

public class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        //demo1(date);
        //demo2("2021-04-18 18:12:11");
        demo2("2021年04月18日 18时12分11秒");
    }
    /*
    String format(Date date)使用方法：
    1.创建SimpleDateFormat对象，构造方法中传递指定的模式
    2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
     */
    public static void demo1(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String text = sdf.format(date);
        String text1 = sdf1.format(date);
        System.out.println(date);
        System.out.println(text);
        System.out.println(text1);
    }
    /*
    Date parse(String source)使用步骤：
    1.创建SimpleDateFormat对象，构造方法中传递指定的模式
    2.调用SimpleDateFormat对象中方法parse，把符合构造方法中模式的字符串，解析为Date日期
    注意：
    public Date parse(String source) throws ParseException
    parse方法声明了一个叫ParseException解析异常，
    如果字符串和构造方法中的模式不一样，那么程序就会抛出此异常，
    调用一个抛出异常的方法，要么throws继续声明抛出一个异常，要么try...catch自己处理这个异常
     */
    public static void demo2(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf1.parse(s);
        //Date date1 = sdf1.parse(s);
        System.out.println(date);
        //System.out.println(date1);
    }
}
