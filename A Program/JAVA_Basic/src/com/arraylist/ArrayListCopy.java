package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopy {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Three");
        arrayList2.add("Four");
        arrayList2.add("Five");
        System.out.println(arrayList2);
        
        Collections.copy(arrayList2, arrayList1);
        System.out.println(arrayList2);
    }
    
    public static void method2() {
        char[] copyFrom = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k', 'l', 'm', 'n' };
        char[] copyTo = new char[17];
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }

    public static void method3() {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int[] arrayCopy = new int[intArray.length];

        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
        for (int i = 0; i < arrayCopy.length; i++)
            System.out.println(arrayCopy[i]);
    }
}
