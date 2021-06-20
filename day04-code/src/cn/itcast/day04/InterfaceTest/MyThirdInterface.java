package cn.itcast.day04.InterfaceTest;

public interface MyThirdInterface extends MyFirstInterface,MySecondInterface{

    @Override
    default void method4() {

    }
}
