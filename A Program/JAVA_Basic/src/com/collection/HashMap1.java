package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

    public static void main(String args[]) {
        method1();
    }
    
    public static void method1() {
        Map<String, String> map = new HashMap<String, String>();
        map.put ("key1", "value1");
        map.put ("key2", "value2");
        String s = map.get("key1");
        System.out.println(s); // prints "Hello again"
    }
}
