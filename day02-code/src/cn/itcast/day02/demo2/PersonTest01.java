package cn.itcast.day02.demo2;
/*
    匿名对象使用方法：new 类名称();
    注意事项：匿名对象只能使用唯一一次，下次再次使用不得不再创建一个匿名对象；
    使用建议：如果确定有一个对象只需要使用唯一一次，就可以使用匿名对象；
 */
public class PersonTest01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.show();
        Person p2 = new Person("Aaron", -20, true);
        p2.show();
        new Person("Mary",12,false).show();
    }
}
