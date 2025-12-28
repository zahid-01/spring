package org.example;

public class Alien {
    private int age;
    private Computer comp;

    public Alien(int age, Computer comp) {
        System.out.println("Alien constructor");
        this.comp = comp;
        this.age = age;
    }

    Alien() {
        System.out.println("Alien constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getLaptop() {
        return comp;
    }

    public void setLaptop(Computer comp) {
        this.comp = comp;
    }

    void code() {
        System.out.println("Alien code");
        comp.compile();
    }
}
