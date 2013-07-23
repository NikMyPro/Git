package com.array;
public class ArrayInteger {

  public static void main(String[] arg) {
    int[] intArray = new int[10];
    //-------------OR-----------------
    //int intArray[] = new int[10];
    int intArray1[] = {1, 2, 3, 4, 5};

    for (int i = 0; i < 10; i++) {
      intArray[i] = 100;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(intArray[i]);
    }
  }
}