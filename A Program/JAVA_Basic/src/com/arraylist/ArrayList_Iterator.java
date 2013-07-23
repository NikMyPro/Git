package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
          String str = itr.next();
          System.out.println(str + " is " + str.length() + " chars long.");
        }
    }
}
