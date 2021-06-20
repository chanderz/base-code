package cn.itcast.day03.demo1String;
/*
    字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中

    对于基本类型来说：==是进行数值的比较
    对于引用类型来说：==是进行【地址值】得比较

    ==是进行地址值的比较，如果需要比较字符串内容，可以使用两个方法：
    1.public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同才会返回true
    备注：Object可以接受任何对象
    2.public boolean equalsIgnoreCase(String str):忽略大小写进行字符串比较
 */

public class StringTest002 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        System.out.print(str1 == str2);
        System.out.print(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println("==========");
        System.out.print(str1.equals(str2));
        System.out.print(str1.equals(str3));
        System.out.println(str1.equals("abc"));
        System.out.println("aBc".equals(str1));
        System.out.println("aBc".equalsIgnoreCase(str1));
    }
}
