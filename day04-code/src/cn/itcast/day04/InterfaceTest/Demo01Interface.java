package cn.itcast.day04.InterfaceTest;

/*
public interface 接口名称{
    接口内容：
    1.常量（Java7）
    2.抽象方法（Java7）---最重要
    3.默认方法（Java8）
    4.静态方法（Java8）
    5.私有方法（Java9）
}

接口使用步骤：
1.接口不能直接使用，必须要有一个实现类来实现该接口
格式：public class 类名称 implements 接口名称{
    //...
    }
2.接口的实现类必须覆盖重写接口中的所有的抽象方法
3.创建实现类的对象进行使用
注意：
1.如果实现类没有实现接口所有抽象方法，那这个实现类必须是抽象类
2.如果实现类所实现的多个接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
3.如果实现类所实现的多个接口中，存在重复的抽象方法，那么只需覆盖重写一次即可
4.如果实现类继承父类和实现的接口中的默认方法产生冲突，优先使用父类当中的方法

 */
/*
1.类与类之间是单继承的，直接父类只有一个
2.类与接口之间是多实现的，一个类可以实现多个接口
3.接口与接口之间是多继承的
注意事项：
1.多个父接口当中的抽象方法如果重复，没关系
2.多个父接口当中的默认方法如果重复，子接口必须进行默认方法的覆盖重写（带着default关键字）
 */

public class Demo01Interface{
    public static void main(String[] args) {
        MyFirstInterface.method5();
        MyFirstInterfaceImpl impl = new MyFirstInterfaceImpl();
        impl.method1();
        impl.method4();
    }
}
