package javaTest.B_HandleString;

/**
 * *
 * * @Description：StringBuffer
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 14:44
 * *
 */
public class StringBufferTest {
    public static void main(String[] args) {
        int i = 101;
        System.out.println(i>>>1);
        long l = -1;
        System.out.println(l>>>=10);

        // 创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        // 链式编程
        sb.append("hello").append(true).append(12).append(34.56);
        System.out.println("sb:" + sb);

        // public StringBuffer insert(int offset,String
        // str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
        sb.insert(5, "world");
        System.out.println("sb:" + sb);
        System.out.println("sb.capacity():" + sb.capacity());//16+18=34,true为1；返回当前容量——理论值
        System.out.println("sb.length():" + sb.length());//21；返回长度（字符数）——实际值
        System.out.println("sb.deleteCharAt(0):"+sb.deleteCharAt(0));//删除指定位置的字符
        System.out.println("sb.delete(0,1):"+sb.delete(0,2));//删除指定位置的字符,左闭右开[0,2)
        System.out.println("sb.replace(0,3):"+sb.replace(0,2,"Hello"));//替换
        System.out.println("sb.substring(0,5):"+sb.substring(0,5));//截取
        System.out.println("sb.substring(5):"+sb.substring(5));//截取
        System.out.println("sb.reverse():"+sb.reverse());//反转
        System.out.println(sb.getClass());
        System.out.println(sb.substring(0,5).getClass());


    }

}
