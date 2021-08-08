package day14.CalculatorTest;

/**
 * *
 * * @Description：使用Lambda标准格式（有参数返回）
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月08日 14:55
 * *
 */
public class CalculatorTest {
    public static void main(String[] args) {
        //// TODO 请在此使用Lambda【标准格式】调用invokeCalc方法来计算120+130的结果ß
        invokeCalc(120,130,(a, b)->{return a+b;});
        invokeCalc(120,130,(a, b)->a+b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是："+result);
    }
}
