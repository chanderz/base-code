package cn.itcast.day04.InterfaceTest;

public class MyFirstInterfaceImpl implements MyFirstInterface,MySecondInterface{
    @Override
    public void method1() {
        System.out.println("first method");
    }

    @Override
    public void method2() {
        System.out.println("second method");
    }

    @Override
    public void method3() {
        System.out.println("third method");
    }

    @Override
    public void method4() {
        MyFirstInterface.super.method4();
    }

    @Override
    public void SecondMethod() {

    }
}
