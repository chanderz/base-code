package cn.itcast.day04.SendRedPackTest;

public class Users {
    private String name;
    private int money;

    public Users() {
    }

    public Users(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void show(){
        System.out.println("姓名："+name+"，有"+money+"元钱。");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
