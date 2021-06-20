package cn.itcast.day08.ListAndSet;
/*
    可变参数：是jdk1.5之后出现的新特性
    使用前提：
        当方法的参数列表类型已经确定，但参数的个数不确定，就可以使用可变参数
    使用格式：
        修饰符 返回值类型 方法名（数据类型...变量名）{}
    可变参数的原理：
        可变参数底层就是一个数组，根据传参个数不同创建不同长度的数组来存储这些参数
        传递的参数个数可以是0个，1，2，3多个
    可变参数使用的注意事项：
        1.一个方法的参数列表只能有一个可变参数
        2.一个方法有多个参数时，可变参数必须写在参数列表末尾
    可变参数的特殊（终极）写法：
        public static void method(Object...obj){    //可传递任意类型参数
        }
 */

public class Demo07VarArgs {
    public static void main(String[] args) {
        //定义一个方法来计算两个int类型整数的和
        sum(1,2);
        sum(1,2,8,100,43);
    }
    /*
        sum()会创建一个长度为0的数组，new int[0]
        sum(1)会创建一个长度为0的数组，new int[]{1}
        sum(1,2)会创建一个长度为0的数组，new int[]{1,2}
     */
    private static void sum(int... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println(sum);
    }
}
