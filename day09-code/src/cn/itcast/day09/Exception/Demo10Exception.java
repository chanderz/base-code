package cn.itcast.day09.Exception;

/**
 * *
 * * @Description：How to handle with Multiple Exception
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年05月30日 13:17
 * *
 */
/*
    多个异常使用捕捉的处理方式：
        1.多个异常分别处理（写多个try...catch）
        2.多个异常一次捕获，多次处理（写一个try，多个catch）
            注意：catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则会报错
        3.多个异常多次捕获，一次处理
 */
public class Demo10Exception {
}
