package com.oops;


public class Abstract_Template {
    public static void main(String args[]) {
        Car automotiveRobot = new Car("Automotive");
        Cooker cookieRobot = new Cooker("Cook");
        automotiveRobot.go();
        System.out.println("---------------------------------------");
        cookieRobot.go();
    }
}

class Cooker extends Machine {
    private String name;

    public Cooker(String n) {
        name = n;
    }

    public void getParts() {
        System.out.println("Getting a flour and sugar....");
    }

    public void assemble() {
        System.out.println("Baking a cookie....");
    }

    public void test() {
        System.out.println("Crunching a cookie....");
    }

    public String getName() {
        return name;
    }
}

class Car extends Machine {
    private String name;

    public Car(String n) {
        name = n;
    }

    public void getParts() {
        System.out.println("Getting a carburetor....");
    }

    public void assemble() {
        System.out.println("Installing the carburetor....");
    }

    public void test() {
        System.out.println("Revving the engine....");
    }

    public String getName() {
        return name;
    }
}

abstract class Machine {
    public final void go() {
        start();
        getParts();
        assemble();
        test();
        stop();
    }

    public void start() {
        System.out.println("Starting....");
    }

    public void getParts() {
        System.out.println("Getting parts....");
    }

    public void assemble() {
        System.out.println("Assembling....");
    }

    public void test() {
        System.out.println("Testing....");
    }

    public void stop() {
        System.out.println("Stopping....");
    }
}