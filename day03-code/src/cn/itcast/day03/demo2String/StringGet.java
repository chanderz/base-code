package cn.itcast.day03.demo2String;
/*
    public int length():拿到字符串长度
    public String concat(String str):当前字符串和参数字符串拼接返回新字符串
    public char charAt(int index):获取索引位置的单个字符串
    public int indexOf(String str):查找参数字符串在本字符串中的首次出现的位置索引值，如果没有返回-1
    public String substring(int index):截取当前位置直到末尾，返回新字符串
    public String substring(int begin, int end):截取当前begin到end位置的字符串，返回新字符串
    备注：范围为[begin,end)
    public char[] toCharArray():将当前字符串转换成字符数组作为返回值
    public byte[] getBytes():获取当前字符串底层的字节数组
    public String replace(CharSequence OldString, CharSequence NewString):
    将所有出现的老字符串替换成为新的字符串，返回替换之后的新字符串
    备注：CharSequence代表可以接收字符串类型
    public String[] split(String regex):按照参数规则，将字符串切分为若干部分
    注意事项：split方法实际上是一个正则表达式，按照英文"."进行切分，必须写"//."
 */
public class StringGet {
    public static void main(String[] args) {
//        System.out.println("abcdefg".length());
//        System.out.println("hi".concat(",how are you"));
//        System.out.println("hello".charAt(1));
//        System.out.println("hello".indexOf("ll"));
//        System.out.println("helloworld".substring(5));
//        System.out.println("helloworld".substring(5,8));
        char[] chars = "hello".toCharArray();//转换成字符数组
        System.out.println(chars[0]);
        System.out.println(chars.length);

        byte[] bytes = "abc".getBytes();//转换成字节数组
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = "How old are you";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "你好sb";
        String str4 = str3.replace("sb", "**");
        System.out.println(str3);
        System.out.println(str4);

        String str5 = "a b c d e f";
        String[] s = str5.split(" ");
        System.out.println(s.length);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }


    }
}
