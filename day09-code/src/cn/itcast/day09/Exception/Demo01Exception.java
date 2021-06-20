package cn.itcast.day09.Exception;
/*
    java.lang.Throwable:类是java语言中所有错误或异常的超类
        Exception：编译期异常，进行编译（写代码）java程序时出现的问题
            RuntimeException：运行期异常，java程序运行过程中出现的问题
            把异常处理掉，程序可以继续执行
        Error：错误
            错误相当于程序得了无法治愈的毛病，必须修改源代码，程序才能继续执行
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception:编译期异常，进行编译（写代码）java程序出现的问题
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = simpleDateFormat.parse("1999-1919");
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(d);

        //RuntimeException：运行期异常，java程序运行过程中出现的问题
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hahah");

        /*
            Error:错误
            OutofMemoryError:Java Heap space
            内存溢出的错误，创建的数组太大了，超出了给jvm分配的内存
         */
        int[] a = new int[1024*1024*1024];
        //必须修改代码，创建的数组需小一点
        System.out.println(a);

    }
}