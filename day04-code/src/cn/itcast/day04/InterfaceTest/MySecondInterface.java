package cn.itcast.day04.InterfaceTest;

public interface MySecondInterface {
    void SecondMethod();
    default void method4(){
        System.out.println("method4");
    }
}
