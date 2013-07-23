package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String args[]) {
        method1();
        //method2();
        //method3();
    }
    

    public static void method1() {
        List stringList = new ArrayList();
        stringList.add("Java 5");
        stringList.add("with generics");

        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("Java 5");
        stringList2.add("with generics");

        String s1 = (String) stringList.get(0);
        System.out.println(s1.toUpperCase());

        String s2 = stringList2.get(0);
        System.out.println(s2.toUpperCase());
    }

    public static void method2() {
        List<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("Hello again");
        
        List<List<String>> listOfLists = new ArrayList<List<String>>();
        listOfLists.add(listOfStrings);
        
        String s = listOfLists.get(0).get(0);
        System.out.println(s); // prints "Hello again"
    }

    public static void method3() {
        List<Number> numlist = new ArrayList<Number>();

        numlist.add(new Integer(123));
        numlist.add(new Float(123));
    }

}
