package day11.MultiThreading;

/**
 * *
 * * @Description：Person class
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年06月12日 13:52
 * *
 */
public class Person extends Thread{
    private String name;

    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+"-->"+i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
