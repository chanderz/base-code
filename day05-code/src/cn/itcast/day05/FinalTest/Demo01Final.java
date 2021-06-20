package cn.itcast.day05.FinalTest;
/*
final关键字代表最终、不可改变的
常见四种用法：
1.可以用来修饰一个类（这个类不能有任何子类）
2.可以用来修饰一个方法（这个方法是最终方法，也就是不能覆盖重写）
注：对于类、方法来说，abstract和final不能同时使用，因为矛盾
3.可以用来修饰一个局部变量（被修饰后变量不可变）
对于基本类型来说，不可变指变量当中的数据不可变
对于引用类型来说，不可变指变量当中的地址值不可变（地址指向的方法可变）
4.可以用来修饰一个成员变量
a.由于成员变量具有默认值，用来final后需要手动赋值，不会再给默认值了
b.final成员变量，要么使用直接赋值，要么通过构造方法赋值。二选一
c.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
 */

import cn.itcast.day05.FinalTest.sub.MySon;

/*
            public      protected     (default)       private
同一个类        yes         yes         yes             yes
同一个包        yes         yes         yes             no
不同包子类       yes         yes         no              no
不同包非子类      yes         no          no              no
注：default可不写，默认为default
 */
public class Demo01Final extends MySon {
    public void main(String[] args) {
        System.out.println(super.son1);
        System.out.println(super.son2);
    }
}
