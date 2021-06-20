package cn.itcast.day07.Generic;

public class Demo02GenericClass<E> {
    private E name;

    public Demo02GenericClass() {
    }

    public Demo02GenericClass(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
