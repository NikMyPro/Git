package com.generic;

public class Generic_Overriding {
    public static void main(String[] arg) {
        Gen4<Integer> intObject = new Gen4<Integer>(88);
        Gen5<Long> longObject = new Gen5<Long>(99L);

        intObject.getObject();
        longObject.getObject();
    }
}

class Gen4<T> {
    T ob;

    Gen4(T o) {
        ob = o;
    }

    T getObject() {
        System.out.println("Gen4's getObject(): ");
        return ob;
    }
}

class Gen5<T> extends Gen4<T> {

    Gen5(T o) {
        super(o);
    }

    T getObject() {
        System.out.println("Gen5's getObject(): ");
        return ob;
    }
}
