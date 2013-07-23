package com.singleton;

public class Singleton1 {
    static SingletonClass s1 = null, s2 = null;

    public static void main(String[] args) {
        s1 = SingletonClass.getInstance();
        s2 = SingletonClass.getInstance();
    }
}

class SingletonClass {
    private static SingletonClass mySingleton = null;

    private SingletonClass() {
    }

    public static synchronized SingletonClass getInstance() {
        if (null == mySingleton) {
            mySingleton = new SingletonClass();
            System.out.println(mySingleton.toString());
        } else {
            System.out.println(mySingleton.toString());
        }
        return mySingleton;
    }
}
