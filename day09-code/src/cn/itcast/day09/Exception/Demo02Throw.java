package cn.itcast.day09.Exception;
import java.lang.*;
import java.util.*;
/*
    throw关键字
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因");
    注意：
        1.throw关键字必须写在方法内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是RuntimeException子类对象，我们可以不处理，默认交给JVM处理（打印异常对象，中断程序）
            throw关键字后边创建的的是编译异常（写代码的时候报错），我们必须处理这个异常，要么throws，要么try...catch
 */
public class Demo02Throw {
    /*
        定义一个方法，获取数组指定索引处的元素
        参数：int[] arr, int index
        以后工作中对方法传递过来的参数进行合法性校验
        如果参数不合法，那我们必须使用抛出异常的方式，告知方法的调用者，传递参数有问题
     */
    public static int getElement(int[] arr,int index){
        /*
            我们可以对传递过来的参数数组进行合法性校验
            如果数组arr是null
            那么我们就抛出空指针异常，告知方法的调用者“传递的数组值是null”
            注意：NullPointerException是一个运行期异常，我们不用处理，默认交给jvm处理
         */
        if (arr == null){
            throw new NullPointerException("传递的数组值是null");
        }
        /*
            可以对传递过来的参数index进行合法性校验
            如果index的范围不在数组的索引范围内
            那么可以抛出数组索引越界异常，告知方法的调用者“传递的索引超出了数组的使用范围”
         */
        if (index < 0 || index > arr.length-1) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }
        int ele = arr[index];
        return ele;
    }

    public static void main(String[] args) {
        int[] arr = null;
        int[] a = new int[3];
        //getElement(arr,0);
        getElement(a,3);
    }
}
