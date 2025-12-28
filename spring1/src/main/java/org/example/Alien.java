package org.example;

public class Alien {
    private int age;

    private Laptop laptop;

    Alien() {
        System.out.println("Alien constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    void code() {
        System.out.println("Alien code");
        laptop.cpu();
    }
}
