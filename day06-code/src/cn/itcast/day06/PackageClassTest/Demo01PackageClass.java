package cn.itcast.day06.PackageClassTest;
/*
包装类：
    基本数据类型的数据，使用起来非常方便，但没有对应的方法来操作这些数据
    所以我们可以使用一个类，把基本类型的数据包装起来，这个类叫包装类。在包装类中定义一些方法，用来操作基本类型的数据
 */
/*
装箱：把基本数据类型包装到包装类中（基本数据类型->包装类）
    构造方法：
        Integer(int value)构造一个新分配的Integer对象，它表示指定的int值
        Integer(String s)构造一个新分配的Integer对象，它表示String参数所指示的int值
        传递的字符串，必须是基本类型的字符串，否则会抛出异常
    静态方法：
        static Integer valuesOf(int i)返回一个表示指定的int值得Integer实例
        static Integer valuesOf(String s)返回保存指定的String的值得Integer对象
拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
    成员方法：
        int intValue()以int类型返回该Integer的值
 */

public class Demo01PackageClass {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        Integer iii = new Integer(3);//方法上有横线说明方法过时了
        Integer i = 4;
        Integer ii = Integer.valueOf(4);
        System.out.println(i);
        System.out.println(ii);
        int num = i.intValue();
        System.out.println(num);
    }
}
