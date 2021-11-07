package javaTest.A_ObjectClone;

/**
 * *
 * * @Description：
 *      使用 clone() 方法来拷贝一个对象即复杂又有风险，它会抛出异常，并且还需要类型转换。
 *      Effective Java 书上讲到，最好不要去使用 clone()，可以使用拷贝构造函数或者拷贝工厂来拷贝一个对象。
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 10:34
 * *
 */

public class CloneMain {
    private int x;
    private static int y;

    public static void main(String[] args) {
        CloneMain a = new CloneMain();
        int x = a.x;
        int y = CloneMain.y;

        // 拷贝对象和原始对象的引用类型引用同一个对象
        ShallowCloneExample s = new ShallowCloneExample();
        ShallowCloneExample w = null;
        try {
            w = (ShallowCloneExample) s.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        s.set(2,222);
        System.out.println(s.get(2));
        System.out.println(w.get(2));

        //拷贝对象和原始对象的引用类型引用不同类型
        DeepCloneExample e1 = new DeepCloneExample();
        DeepCloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.set(5,222);
        System.out.println(e1.get(5));
        System.out.println(e2.get(5));

        //使用 clone() 方法来拷贝一个对象即复杂又有风险，它会抛出异常，并且还需要类型转换。
        //Effective Java 书上讲到，最好不要去使用 clone()，可以使用拷贝构造函数或者拷贝工厂来拷贝一个对象。
        CloneConstructorExample c1 = new CloneConstructorExample();
        CloneConstructorExample c2 = new CloneConstructorExample(c1);
        e1.set(2, 222);
        System.out.println(c1.get(2)); // 222
        System.out.println(c2.get(2)); // 2
    }
}
