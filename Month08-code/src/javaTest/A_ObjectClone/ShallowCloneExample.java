package javaTest.A_ObjectClone;

/**
 * *
 * * @Description：浅拷贝
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年11月07日 11:08
 * *
 */
public class ShallowCloneExample implements Cloneable{

    private int[] arr;

    public ShallowCloneExample(){
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

