package cn.itcast.day01.demo1;

public class Demo2Array {
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String[] exchangeArray(String[] array) {
        for (int min = 0, max = array.length-1; min < max; min++, max--) {
            String temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        return array;
    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length-1; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //动态初始化：数据类型[] 数组名 = new 数据类型[数据元素个数];
        int[] arrayA = new int[5]; //动态初始化数组
        //动态初始化可以拆分为两个步骤
        int[] arrayE;
        arrayE = new int[4];

        /*
        静态初始化标准格式：
        数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, ...};
         */
        String[] arrayB = new String[]{"hallo", "hi", "ok"};
        //静态初始化标准格式可以拆分为两个步骤
        int[] arrayC;
        arrayC = new int[]{11, 10, 12, 1};

        /*
        静态初始化省略格式：
        数据类型[] 数组名 = {元素1, 元素2, ...};
        静态初始化省略格式不能拆分为两个步骤
         */
        char[] arrayD = {'a', 'e', '1'};
        /*System.out.println(arrayD);
        System.out.println(arrayA);
        System.out.println(arrayB);
        System.out.println(arrayC);
        System.out.println(arrayD);
        System.out.println(arrayE);
        System.out.println(arrayD[0]);*/
        printArray(arrayB);
        exchangeArray(arrayB);
        printArray(arrayB);
        System.out.println(getMax(arrayC));
    }
}