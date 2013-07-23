package com.generic;

public class Generic_Constructors_super {
    public static void main(String args[]) {
        Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 99);
        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}

class GenSub<T> {
    T ob;

    GenSub(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class Gen2<T, V> extends GenSub<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}