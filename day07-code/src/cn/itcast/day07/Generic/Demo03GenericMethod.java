package cn.itcast.day07.Generic;
/*
    定义含有泛型的方法：泛型定义在方法的修饰符和返回类型之间

    格式：
        修饰符<泛型>返回值类型 方法名(参数列表(使用泛型)){
            方法体
        }
    含有泛型的方法，在调用方法的时候确定泛型的数据类型
    传递什么参数，泛型就是什么类型
 */
public class Demo03GenericMethod {
    public <M> void method01(M m){
        System.out.println(m);
    }
    public static <M> void method02(M m){
        System.out.println("静态方法："+m);
    }

}
