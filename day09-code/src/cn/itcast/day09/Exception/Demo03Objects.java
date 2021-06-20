package cn.itcast.day09.Exception;
/*
    Objects中的静态方法：
    public static <T> T requireNonNull(T obj)`:查看指定引用对象不是null
    源码：
        public static <T> T requireNonNull(T obj){
            if(obj == null){
                throw new NullPointerException();
            }
            return obj
        }
 */

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        method(null);

    }
    public static void method(Object obj) {
        /*if (obj == null){
            throw new NullPointerException("传递的对象的值为空");
        }*/
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象值为null");
    }
}
