package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayListEnumeration  {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("D");
    arrayList.add("E");
    arrayList.add("F");

    Enumeration e = Collections.enumeration(arrayList);
    while (e.hasMoreElements())
      System.out.println(e.nextElement());
  }
}