package cn.itcast.day05.InnerClassTest;

public class Body {
    private int x = 1;
    public class Heart{
        private int x = 2;
        public void beat(){
            int x = 3;
            System.out.println("跳动");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Body.this.x);
        }
    }
    public void method(){
        System.out.print("心脏");
        Heart h = new Heart();
        h.beat();
    }
}
