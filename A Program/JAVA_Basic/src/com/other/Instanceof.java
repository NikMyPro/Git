package com.other;
interface one {
}

class Two implements one {
}

class Three implements one {
}

public class Instanceof {
    public static void main(String args[]) {
        one test1 = new Two();
        one test2 = new Three();
        System.out.println(test1 instanceof one); // true
        System.out.println(test2 instanceof one); // true
        System.out.println(test1.getClass().equals(test2.getClass())); // false
    }
}