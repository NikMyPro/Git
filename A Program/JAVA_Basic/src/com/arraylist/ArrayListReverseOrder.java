package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseOrder {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("C");
    arrayList.add("D");
    arrayList.add("E");

    //---------------------------------------------------
    System.out.println(arrayList);
    Collections.reverse(arrayList);
    System.out.println(arrayList);
    
    //---------------------------------------------------
    System.out.println(arrayList);
    Collections.sort(arrayList, Collections.reverseOrder());
    System.out.println(arrayList);
  }
}