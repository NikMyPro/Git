/**
 * 
 */
package com.other;

/**
 * @ProjectName Abc
 * @PackageName ab.cd
 * @FileName test.java
 * @Author Gateway Technolabs Pvt Ltd.
 * @ModifiedDate Jun 14, 2013 10:25:03 AM
 * @Description 
 */
public class Integer_vs_int1_Puzzle {
    public static void main(String[] args) {
        //method1();
        method2();
    }
    
    public static void method1() {
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.println(c);
        System.out.println(a == b);
        // adding Integers
        Integer x = 1;
        Integer y = 1;
        Integer z = x + y;
        System.out.println(z);
        System.out.println(x == y); // this is a bug
    }

    public static void method2() {
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.println(c);
        System.out.println(a == b);
        // add two Integers
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        Integer z = new Integer(x.intValue() + y.intValue());
        System.out.println(z);
        System.out.println(x == y); // comparing references to different objects
    }
}
