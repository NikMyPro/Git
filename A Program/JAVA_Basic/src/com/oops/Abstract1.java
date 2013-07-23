package com.oops;
//Abstract
abstract class Detail {
    abstract void getUsername();
    void IamAlsoAllow() {
        System.out.println("This is a concrete method.");
    }
}

class Man extends Detail {
    void getUsername() {
        System.out.println("Welcome Niraj !");
    }
}

class Abstract1 {
    public static void main(String args[]) {
        Man man = new Man();
        man.getUsername();
        man.IamAlsoAllow();
    }
}