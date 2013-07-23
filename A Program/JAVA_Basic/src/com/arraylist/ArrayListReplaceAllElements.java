package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReplaceAllElements {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("D");
    System.out.println(arrayList);
    
    //--------------------------------
    Collections.fill(arrayList, "REPLACED");
    System.out.println(arrayList);
    
    //--------------------------------
    List list = new ArrayList();
    for (int i = 0; i < 10; i++)
      list.add("");
    Collections.fill(list, "Hello");
    System.out.println(list);

    //--------------------------------
    Collections.replaceAll(arrayList, "A", "Replace All");
    System.out.println(arrayList);
  }
}