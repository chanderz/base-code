package cn.itcast.day07.Generic;

public class Demo03GenericMethodTest {
    public static void main(String[] args) {
        Demo03GenericMethod dg = new Demo03GenericMethod();
        dg.method01(1020);
        dg.method01(true);
        dg.method01("public");
        Demo03GenericMethod.method02(1328);
        Demo03GenericMethod.method02("静态放啊");
    }
}
