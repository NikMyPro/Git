package com.generic;

public class Generic_Class {

    public static void main(String args[]) {
        //GenericClass<int> strOb = new GenericClass<int>(53); // Error, can't use primitive type

         // Create a Gen reference for Integers.
        GenericClass<Integer, String> iOb = new GenericClass<Integer, String>(88,"Generics Test");
        iOb.showType();
        
        int v1 = iOb.getObj1(); // no cast is needed.
        System.out.println("value: " + v1);
        
        String v2 = iOb.getObj2(); // no cast is needed.
        System.out.println("value: " + v2);
        
        //-------------------------------------------------
        System.out.println("//-------------------------------------------------");
        Gen raw = new Gen(new Double(98.6));
        raw.showType();

        double d = (Double) raw.getObj(); // Cast here is necessary because type is unknown.
        System.out.println("value: " + d);
    }
}

class GenericClass<T,V> {
    T ob1;
    V ob2;

    GenericClass(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    T getObj1() {
        return ob1;
    }

    V getObj2() {
        return ob2;
    }

    void showType() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
}

class Gen<T> { 
    T ob;
     
    Gen(T o) { 
      ob = o; 
    } 
   
    T getObj() { 
      return ob; 
    } 
    
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
  } 
