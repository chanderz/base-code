package cn.itcast.day09.Exception;
/*
    try...catch:异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，产生异常对象之后怎么处理异常对象
            一般在工作中会把异常信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){
        }
    注意：
        1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
          如果try中没有产生异常，那么就不会执行catch中的异常的处理逻辑，执行玩try中的代码，继续执行try...catch之后的代码
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05TryCatch {
    public static void main(String[] args) {
        try{
            readFile("d:\\a.xt");
        }catch (IOException e){//try中抛出什么异常对象，catch就定义什么异常变量，用来接受这个异常对象
            //异常的处理逻辑，产生异常对象之后，怎么处理异常对象
            //System.out.println("catch - 传递的文件后缀不是.txt");
            /*
            Throwable中定义了三个处理异常的方法
            String getMessage():返回此throwable的简短描述
            String toString():返回此throwable的详细消息字符串
            void printStackTrace():JVM打印异常对象，默认此方法，打印的异常信息最全面
             */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }
    public static void readFile(String filename) throws IOException {
        /*
            如果传递的路径，不是txt结尾
            那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if (!filename.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
