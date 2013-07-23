package com.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortable {

    public static void main(String[] args) {
        int[] intArray = new int[] { 5, 4, 3, 2, 1 };
        Arrays.sort(intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
        // --------------------------------------------
        String[] fruits = new String[] { "Pineapple", "Apple", "Orange", "Banana" };
        Arrays.sort(fruits);
        int i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp);
        }
        // --------------------------------------------
        List<String> fruits1 = new ArrayList<String>();
        fruits1.add("Pineapple");
        fruits1.add("Apple");
        fruits1.add("Orange");
        fruits1.add("Banana");
        Collections.sort(fruits1);
        int j = 0;
        for (String temp : fruits1) {
            System.out.println("fruits " + ++j + " : " + temp);
        }
    }
}
