package com.oops;
//Interface
interface GetName {
    public void getUsername();
}

interface GetCity {
    public void getCity();
}

public class Interface1 implements GetName, GetCity {
    public void getUsername() {
        System.out.println("Welcome Niraj!");
    }

    public void getCity() {
        System.out.println("I am from Ahmedabad ");
    }

    public static void main(String args[]) {
        Interface1 a = new Interface1();
        a.getUsername();
    }
}
