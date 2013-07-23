package com.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

    public static void main(String args[]) {
        method1();
    }

    public static void method1() {
        List<String> list1 = new ArrayList<String>();

        list1.add("Hello");
        list1.add("World");
        printList1(list1);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(100);
        list2.add(200);
        printList(list2);
    }

    //with Wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    //Same as above without Wildcard
    public static <T> void printList1(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
