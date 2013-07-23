package com.arraylist;
import java.util.Arrays;

public class ArrayListBinarySearch {
    public static void main(String[] args) {
        //method1();
        method2();
    }
    
    public static void method1() {
        byte bArray[] = { 1, 2, 4, 5 };
        Arrays.sort(bArray);

        byte searchValue = 2;

        int intResult = Arrays.binarySearch(bArray, searchValue);
        System.out.println("Result of binary search of 2 is : " + intResult);

        searchValue = 7;
        intResult = Arrays.binarySearch(bArray, searchValue);
        System.out.println("Result of binary search of 3 is : " + intResult);
    }
    
    public static void method2() {
        char charArray[] = { 'a', 'b', 'd', 'e' };
        Arrays.sort(charArray);

        char searchValue = 'b';
        System.out.println(Arrays.binarySearch(charArray, searchValue));

        searchValue = 'z';
        System.out.println(Arrays.binarySearch(charArray, searchValue));
    }
}