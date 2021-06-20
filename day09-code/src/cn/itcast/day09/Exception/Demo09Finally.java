package cn.itcast.day09.Exception;

import java.io.IOException;

/**
 * *
 * * @Description：Finally codeblocks
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年05月30日 13:06
 * *
 */
/*
    finally的语法:
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，接收异常对象之后，怎么处理异常对象
            一般工作中会把异常的信息记录到一个日志中
        }finally{
            无论是否出现异常都会执行
        }

    注意:
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO）
 */
public class Demo09Finally {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");
        } catch (IOException e) {//try中抛出什么异常对象，catch就定义什么异常变量，用来接受这个异常对象
            //异常的处理逻辑，产生异常对象之后，怎么处理异常对象
            //System.out.println("catch - 传递的文件后缀不是.txt");
            /*
            Throwable中定义了三个处理异常的方法
            String getMessage():返回此throwable的简短描述
            String toString():返回此throwable的详细消息字符串
            void printStackTrace():JVM打印异常对象，默认此方法，打印的异常信息最全面
             */
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }

    public static void readFile(String filename) throws IOException {
        /*
            如果传递的路径，不是txt结尾
            那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
