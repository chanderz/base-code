package cn.itcast.day05.InnerClassTest;
/*
一个类内部包含另一个类
例如：身体与心脏、汽车与发动机

分类：
0.外部类：public/(default)
1.成员内部类：public/protected/(default)/private
2.局部内部类（包含匿名内部类）:什么都不能写
注意：内用外，随意访问；外用内，需要内部类对象
====================================
使用成员内部类的两种方法：
1.间接方式：在外部类的方法中使用内部类；然后main方法只是调用外部类的方法
2.直接方式：公式：
外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
===========================================================
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】
原因：
1.new处理的对象是在堆内存当中
2.局部变量跟着方法走，在栈内存当中
3.方法结束后，立刻出栈，局部变量会立刻消失
4.但是new处理的对象会在堆内存中持续存在，直到垃圾回收消失
从Java8+开始，只要局部变量事实不变，那么final关键字可以省略
 */
public class Demo01InnerClass {
    public static void main1(String[] args) {
        Body b = new Body();
        b.method();
        System.out.println("================");
        Body.Heart bh = new Body().new Heart();
        bh.beat();
        System.out.println("=================");
        Outer o = new Outer();
        o.methodOuter();
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一一次，那么可以省略该类的定义，而改为使用【匿名内部类】
匿名内部类定义格式：
接口名称 对象名 = new 接口名称(){
    //覆盖重写所有抽象方法
};

对格式“new 接口名称(){...}”进行解析：
1.new代表创建对象的动作
2.接口名称就是匿名内部类需要实现的接口
3.{...}才是匿名内部类实现的内容

注意：
1.匿名内部类，在【创建对象】的时候只能使用唯一一次（如果希望多次使用，则需单独定义实现类）
2.匿名对象，在【调用方法】时只能使用唯一一次（如果希望同一对象调用方法多次就必须给对象起名字）
3.匿名内部类省略了【实现类/子类】，匿名对象是省略了【对象名称】
*/
        System.out.println("====================");
        //匿名内部类但不是匿名对象，对象名为my
        MyInterface my = new MyInterface() {
            @Override
            public void skill() {
                System.out.println("what");
            }
        };
        my.skill();
        //匿名内部类也是匿名对象
        new MyInterface(){
            @Override
            public void skill(){
                System.out.println("going");
            }
        }.skill();

    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.setHeroName("艾希");
        h.setAge(12);
        h.setSkill(new MyInterfaceImpl());
        Weapon w = new Weapon("239","霜冻之箭");
        h.setWeapon(w);
        h.attack();
        h.setSkill(new MyInterface() {
            @Override
            public void skill() {
                System.out.print("Pia~Pia~Pia~");
            }
        });
        h.attack();
    }
}
