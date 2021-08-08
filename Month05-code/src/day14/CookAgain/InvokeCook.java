package day14.CookAgain;

import day14.Cook.Cook;

/**
 * *
 * * @Description：使用Lambda的省略样式实现cook
 * Lambda表达式：是可推导可省略的
 * 可以省略的内容：
 *      1.（参数列表）：括号中的参数类型是可以省略不写的
 *      2.（参数列表）：括号中的参数如果只有一个，那么类型和括号都可以省略
 *      3.（一些代码）：如果{}中的代码只有一行，无论是否有返回值，都可以省略（{},return,分号）
 *          注意：要省略{},return,分号要一起省略
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月08日 15:39
 * *
 */
public class InvokeCook {
    public static void main(String[] args) {
        //TODO 请在此Lambda【标准格式】调用invokeCook方法
        invokeCook(()->System.out.println("Food Done!"));
    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
