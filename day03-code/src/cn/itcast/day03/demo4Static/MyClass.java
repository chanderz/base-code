package cn.itcast.day03.demo4Static;

public class MyClass {
    private int id;
    private String name;
    private int age;
    private static int idcount = 0;
    static int room;

    public MyClass() {
        this.id = ++idcount;
    }

    public MyClass(String name, int age) {
        this.id = ++idcount;
        this.name = name;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void method(){
        System.out.println("这是一个成员方法");
        System.out.println(this);
    }
    public static void methodStatic(){
        System.out.println(idcount);

        System.out.println("这是一个静态方法");
    }
}
