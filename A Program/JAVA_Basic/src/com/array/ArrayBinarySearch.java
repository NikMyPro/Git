package com.array;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        method1();
        method2();
    }
    
    public static void method1() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("4");
        arrayList.add("2");
        arrayList.add("5");
        arrayList.add("3");
        
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList contains : " + arrayList);
        int index = Collections.binarySearch(arrayList, "4");
        System.out.println("Element found at : " + index);
    }
    
    public static void method2() {
        List list = new LinkedList();
        
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            list.add(month);
        }
        
        Collections.sort(list);
        System.out.println("Month Names = " + list);
        int index = Collections.binarySearch(list, "October");
        if (index > 0) {
            System.out.println("Found at index = " + index);
            String month = (String) list.get(index);
            System.out.println("Month = " + month);
        }
    }
}