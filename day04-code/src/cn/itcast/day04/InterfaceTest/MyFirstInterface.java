package cn.itcast.day04.InterfaceTest;
/*
1.接口中的抽样方法修饰符必须是两个固定的关键字：public abstract（可以选择性的省略）
2.接口中的默认方法可以解决接口升级的情况
3.接口的静态方法直接通过接口来调用（不需要通过对象来调用）
4.接口的私有方法可以解决多个默认方法之间的重复代码问题：
    从Java9开始，接口当中允许定义私有方法
    A.普通私有方法，解决多个默认方法之间的重复代码问题
    B.静态私有方法，解决多个静态方法之间的重复代码问题
5.接口当中可以定义【成员常量】（其实就是接口的常量），但必须使用public static final三个关键字来修饰·
    注意：
    A.一旦使用final关键字进行修饰，说明不可改变
    B.接口当中的常量，public static final可以省略（默认被这三个关键字修饰）
    C.接口当中的常量，必须赋值
    D.接口当中的常量名称，使用完全大写的字母，用下划线进行分隔（推荐命名规则）
 */

public interface MyFirstInterface {
    public static final int NUM_INTERFACE = 10;
    public abstract void method1();
    abstract void method2();
    void method3();
    public default void method4(){
        System.out.println("默认方法调用成功");
        methodP();
    }
    public static void method5(){
        System.out.println("静态方法调用成功");
        methodS();
    }
    private void methodP(){
        System.out.println("普通私有方法调用成功");
    }
    private static void methodS(){
        System.out.println("静态私有方法调用成功");
    }
}
