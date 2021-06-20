package cn.itcast.day05.InnerClassTest;

public class Outer {
    public void methodOuter() {
        class Inner {
            int num = 10;

            public void methodInner() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
