package cn.itcast.day06.PackageClassTest;
/*
自动装箱与自动拆箱：
    基本数据类型和包装类之间可以自动的相互转换
    JDK1.5之后出现的新特性
 */

import java.sql.Array;
import java.util.ArrayList;

public class Demo02PackageClass {
    public static void main(String[] args) {
        /*
            自动装箱：直接把int类型的整数赋值给包装类
            Integer in = 1; 就相当于 Integer in = new Integer(1);
         */
        Integer in = 1;
        /*
            自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本类型的数据，再参与计算
            int + 2;就相当于 in.intValue() + 3 =3;
            in = in + 2; 就相当于 in = new Integer(3)自动装箱
         */
        in = in + 2;
        System.out.println(in);

        //ArrayList集合无法直接存储整数，可以存储Integer包装类
        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);//自动装箱 list.add(new Integer(1));

        int a = list.get(0); //自动拆箱 list.get(0).intValue();
    }
}
