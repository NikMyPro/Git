package com.classes;
public class InnerClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.new Inner().hello();
    }
}
class Outer {
    public class Inner {
        public void hello(){
          System.out.println("Hello from Inner()");
        }
    }
}