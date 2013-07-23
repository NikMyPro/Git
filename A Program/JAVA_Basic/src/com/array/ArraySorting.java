package com.array;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        method1();
        //method2();
    }

    public static void method1() {
        String[] myArray = new String[] { "A", "a", "B" };
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void method2() {
        char[] c1 = new char[] { 'c', 'h', 'a', 'r', 's' };
        for (char ch : c1) {
            System.out.print(ch);
        }
        Arrays.sort(c1);

        for (char ch : c1) {
            System.out.print(ch);
        }

        char[] c2 = new char[] { 'c', 'h', 'a', 'r', 's' };
        Arrays.sort(c2, 1, 4);
        for (char ch : c1) {
            System.out.print(ch);
        }
    }
}