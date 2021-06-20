package cn.itcast.day04.MultiTest;
/*
代码当中体现多态性，其实就一句话：父类引用指向子类对象
new的是谁就优先用谁，没有就向上查找
口诀：编译看左边，运行看右边

格式：
父类名称 对象名 = new 子类名称();
或
接口名称 对象名 = new 实现类名称();

 */
/*
访问成员变量的两种方式：
1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上查找
2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上查找（子类覆盖重写就是子，没有覆盖重写就是父）

成员变量：编译看左边，运行还看左边
成员方法：编译看左边，运行看右边
 */
/*
向上转型一定是安全的，没有问题，但有一个弊端：
对象一旦转型为父类，那么就无法调用子类原本特有的内容
解决方案：用对象的向下转型【还原】
格式：子类名称 对象名 = (子类名称)父类对象;
含义：将父类对象，【还原】成为本来的子类对象
注意事项：
a.必须保证对象本来创建的时候就是zi，才能向下转型成为zi
b.如果对象创建的时候本来不是zi，非要向下转型成为zi，就会报错：ClassCastException

对象 instanceof 类名称
会返回一个boolean值结果，判断前面的对象能不能当作后面的类的实例
 */
public class Demo01Multi {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
        System.out.println(obj.num);
        if (obj instanceof Zi){
            Zi objs = (Zi) obj;
            objs.methodZi();
        }
        if (obj instanceof Nv){
            Nv objsz = (Nv) obj;
            objsz.methodNv();
        }
    }
    public static void giveMeAChild(Fu obj){
        if (obj instanceof Zi){
            Zi objs = (Zi) obj;
            objs.methodZi();
        }
        if (obj instanceof Nv){
            Nv objsz = (Nv) obj;
            objsz.methodNv();
        }
    }
}
