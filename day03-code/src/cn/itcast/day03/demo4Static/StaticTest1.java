package cn.itcast.day03.demo4Static;
/*
1.静态不能直接访问非静态
2.静态方法中不能用this

根据类名访问静态成员变量时，全程和对象没有关系，只和类有关系

静态代码块格式：
public class 类名称{
    static {
        //静态代码块内容
    }
}
特点：当第一次用到本类是，静态代码块执行唯一一次
    静态内容总是优先于非静态，所以静态代码块比构造方法先执行
静态代码块典型用途：用来一次性的对静态成员变量进行赋值
 */
public class StaticTest1 {
    public static void main(String[] args) {
        MyClass s1 = new MyClass("Aaron", 12);
        MyClass.room = 100;
        System.out.println("姓名："+s1.getName()+"，年龄："+s1.getAge()+
                "，学号："+s1.getId()+"，班级："+s1.room);
        MyClass s2 = new MyClass("Micheal",14);
        System.out.println("姓名："+s2.getName()+"，年龄："+s2.getAge()+
                "，学号："+s2.getId()+"，班级："+s2.room);
        s1.method();
        MyClass.methodStatic();
    }
}
