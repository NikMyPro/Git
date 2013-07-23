package com.singleton;

public class Singleton4 implements java.lang.Runnable {
    Thread thread;

    public static void main(String args[]) {
        Singleton4 t = new Singleton4();
    }

    public Singleton4() {
        SynchronizedData database = SynchronizedData.getInstance("products");
        thread = new Thread(this, "second");
        thread.start();
        System.out.println("This is the " + database.getName() + " database.");
    }

    public void run() {
        SynchronizedData database = SynchronizedData.getInstance("employees");
        System.out.println("This is the " + database.getName() + " database.");
    }
}

class SynchronizedData {
    private static SynchronizedData singleObject;
    private int record;
    private String name;

    private SynchronizedData(String n) {
        name = n;
        record = 0;
    }

    public static synchronized SynchronizedData getInstance(String n) {
        if (singleObject == null) {
            singleObject = new SynchronizedData(n);
        }
        return singleObject;
    }

    public void edit(String operation) {
        System.out.println("Performing a " + operation + " operation on record " + record + " in database " + name);
    }

    public String getName() {
        return name;
    }
}