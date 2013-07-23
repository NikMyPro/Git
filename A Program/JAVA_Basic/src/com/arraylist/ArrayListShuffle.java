package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShuffle {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("C");
    arrayList.add("D");
    arrayList.add("E");

    System.out.println(arrayList);

    Collections.shuffle(arrayList);

    System.out.println(arrayList);

  }

}