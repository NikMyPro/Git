package com.classes;
class MyMessage {
    public void printMessage() {
        System.out.println("Original message");
    }
}

public class AnonymousClasses2 {

    public static void main(String[] args) {
        AnonymousClasses2 tac = new AnonymousClasses2();

        MyMessage m = new MyMessage();
        m.printMessage();

        tac.showGeneralMessage(new MyMessage() {
            public void printMessage() {
                System.out.println("Override message");
            }
        });
    }

    void showGeneralMessage(MyMessage msg) {
        msg.printMessage();
    }
}