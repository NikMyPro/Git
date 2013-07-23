package com.oops;
//Inheritance 
class Animal {
    public void eat() {
        System.out.println("Eating for grass");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog can eat a bread");
    }
    public void Run() {
        System.out.println("Run on Ground");
    }
}

class Fish extends Animal {
    public void eat() {
        System.out.println("Fish can eat a algae");
    }
    public void Swimm() {
        System.out.println("Swimm in water");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Fish fish = new Fish();
        Dog dog = new Dog();
        fish.eat();
        dog.eat();
    }
}

