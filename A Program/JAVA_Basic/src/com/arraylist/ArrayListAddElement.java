package com.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListAddElement {
    public static void main(String args[]) throws Exception {
        // method1();
        // method2();
        method3();
    }

    public static void method1() {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "G");

        System.out.println(list);
    }

    public static void method2() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        arrayList.add(1, "INSERTED");
        for (String str : arrayList)
            System.out.println(str);
    }

    public static void method3() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        Vector<String> v = new Vector<String>();
        v.add("4");
        v.add("5");

        // append all elements of Vector to ArrayList
        arrayList.addAll(v);

        for (String str : arrayList)
            System.out.println(str);
    }
}