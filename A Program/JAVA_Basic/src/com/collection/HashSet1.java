package com.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet1 {

  public static void main(String[] args) {
    List myList = new ArrayList();
    myList.add("Hello");
    myList.add("Hello");
    myList.add("World");
    myList.add("Yes");
    myList.add("No");
    Set set = new HashSet(myList);

    System.out.println(set);
  }

}