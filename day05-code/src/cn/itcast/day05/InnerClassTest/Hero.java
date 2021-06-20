package cn.itcast.day05.InnerClassTest;

public class Hero {
    private String heroName;
    private int age;
    private Weapon weapon;
    private MyInterface skill;

    public MyInterface getSkill() {
        return skill;
    }

    public void setSkill(MyInterface skill) {
        this.skill = skill;
    }

    public void attack(){
        System.out.println("年龄为"+age+"的英雄"+heroName+"正在使用"+weapon.getName()+"攻击人");
        System.out.print("发出");
        skill.skill();
        System.out.println("的声音");
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero(String heroName, int age, Weapon weapon) {
        this.heroName = heroName;
        this.age = age;
        this.weapon = weapon;
    }

    public Hero() {
    }
}
