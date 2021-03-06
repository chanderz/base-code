package cn.itcast.day09.Exception;

/**
 * @author Zhaozheng on 2021年05月30日 10:50
 */
/*
    自定义异常类
    格式：
        public class XXXException extends Exception | RuntimeException {
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
        }
    注意：
        1.自定义异常类一般都是以Exception结尾，说明该类是一个异常类
        2.自定义异常类，必须继承的Exception或者RuntimeException
            继承Exception：自定义的异常类就是一个编译期异常，如果方法内部抛出了编译期异常，就必须处理这个异常，要么throw要么try...catch
            继承RuntimeException：自定义异常类就是运行期异常，无需处理，交给虚拟机处理（中断）

 */
public class RegisterException extends Exception {
    public RegisterException(){
        super();
    }
    /*
        添加一个带异常信息的构造方法
        查看源码发现，所有异常类都有一个带异常信息的构造方法，方法内部会调用父类异常信息的构造方法，让父类来处理这个异常信息
     */
    public RegisterException(String message){
        super(message);
    }
}
