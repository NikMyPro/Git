package com.arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListRotateElements {
  public static void main(String[] args) {
    List numbers = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }

    System.out.println(Arrays.toString(numbers.toArray()));
    Collections.rotate(numbers, 5);
    System.out.println(Arrays.toString(numbers.toArray()));
  }
}