package com.oops;


abstract class ApplicationFramework {
    public ApplicationFramework() {
      templateMethod(); // Dangerous!
    }

    abstract void customize1();

    abstract void customize2();

    final void templateMethod() {
      for (int i = 0; i < 5; i++) {
        customize1();
        customize2();
      }
    }
  }

  class MyApp extends ApplicationFramework {
    void customize1() {
      System.out.print("Hello ");
    }

    void customize2() {
      System.out.println("World!");
    }
  }

  public class Abstract_Template2 {

    public static void main(String args[]) {
      MyApp app = new MyApp();
    }
  }