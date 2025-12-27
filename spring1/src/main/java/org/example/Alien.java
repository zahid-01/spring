package org.example;

public class Alien {
    private int age;

    Alien() {
        System.out.println("Alien constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void code() {
        System.out.println("Alien code");
    }
}
