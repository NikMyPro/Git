package com.singleton;

public class Singleton2 {
    public static void main(String[] args) {
        SingletonA s = SingletonA.getReference();
        String result = "" + s.getValue();
        System.out.println(result);
        
        SingletonA s2 = SingletonA.getReference();
        s2.setValue(9);
        result = "" + s.getValue();
        System.out.println(result);
    }
}

final class SingletonA {
    private static SingletonA s = new SingletonA(47);
    private int i;

    private SingletonA(int x) {
      i = x;
    }

    public static SingletonA getReference() {
      return s;
    }

    public int getValue() {
      return i;
    }

    public void setValue(int x) {
      i = x;
    }
  }
