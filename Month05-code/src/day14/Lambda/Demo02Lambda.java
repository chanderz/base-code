package day14.Lambda;

/**
 * *
 * * @Description：Lambda starting
 * Lambda表达式的标准格式：
 *  由三部分组成：
 *      1.一些参数
 *      2.一个箭头
 *      3.一段代码
 *  格式：
 *      （参数列表）->{一些重写方法的代码};
 *  解释说明：
 *      ()：接口中的参数列表，没有参数就空着；有参数写参数，多个参数用空格分隔
 *      ->：传递的意思，把参数传递给方法体{};
 *      {}：重写接口的抽象方法的方法体
 *
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月08日 11:04
 * *
 */
public class Demo02Lambda {
  public static void main(String[] args) {
    //
    new Thread(()->{
      System.out.println(Thread.currentThread().getName()+"-new thread created");
      }).start();
    new Thread(()->System.out.println(Thread.currentThread().getName()+"-new thread created")).start();
  }

}
