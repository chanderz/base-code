package cn.itcast.day06.SystemTest;
/*
public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
 */

public class Demo01System {
    public static void main(String[] args) {
        demo2();
        demo3();
    }

    public static void demo3() {
        /*将src数组中前3个元素，复制到dest数组的前3个位置上
        复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
        复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
         */
        int[] src = new int[]{1,2,3,4,5};//int[] arr1 = {1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};//int[] arr2 = {6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.print("[");
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i]);
            if (i != dest.length-1 ){
                System.out.print(",");
            }else {
                System.out.println("]");
            }
        }
    }

    public static void demo1() {
        //currentTimeMillis方法就是 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
        System.out.println(System.currentTimeMillis());
    }
    public static void demo2(){
        //验证for循环打印数字1-9999所需要使用的时间（毫秒）
        long start = System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) {
            System.out.print(i);
        }
        System.out.println(" ");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("程序共耗时："+(double) (end-start)/1000+"s");
    }
}
