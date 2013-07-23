package com.other;


class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee: SpecificRequest");
    }
}

class Adapter {
    private Adaptee adaptee;

    public Adapter(Adaptee a) {
        adaptee = a;
    }

    public void request() {
        adaptee.specificRequest();
    }
}

public class SimpleAdapter {
    public static void main(String args[]) {
        Adapter t = new Adapter(new Adaptee());
        t.request();
    }
}
