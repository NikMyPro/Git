package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListReadOnlyPermission {

    public static void main(String args[]) {
        // method1();
        method2();
    }

    public static void method1() {
        List<Character> list = new ArrayList<Character>();
        list.add('X');
        System.out.println("Element added to list: " + list.get(0));

        Collection<Character> immutableCol = Collections.unmodifiableCollection(list);
        immutableCol.add('Y');
    }

    public static void method2() {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list = Collections.unmodifiableList(list);
        list.add(1, "G");

        System.out.println(list);
    }
}