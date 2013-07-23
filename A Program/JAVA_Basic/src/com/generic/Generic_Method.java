package com.generic;

public class Generic_Method {
    
    public static void main(String args[]) {
        method1();
        //method2();
    }
    
    public static void method1() {
        Integer Array[] = { 1, 2, 3, 4, 5 };
        if (isIn(2, Array))
            System.out.println("2 is in Array");

        if (!isIn(7, Array))
            System.out.println("7 is not in Array");

        // ------------------------------------
        System.out.println(" ------------------------------------");
        String strs[] = { "one", "two", "three", "four", "five" };

        if (isIn("two", strs))
            System.out.println("two is in strs");

        if (!isIn("seven", strs))
            System.out.println("seven is not in strs");
    }
    
    static <T, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }
    //-------------------------------------------------------------------------
    
    public static void method2() {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        
        System.out.println("Array integerArray contains:");
        printArray(integerArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray); // pass a Double array
        System.out.println("\nArray characterArray contains:");
        printArray(characterArray); // pass a Character array
    }
    
    public static <E> void printArray(E[] inputArray) {
        // display array elements
        for (E element : inputArray)
            System.out.printf("%s ", element);
                
                System.out.println();
    }
}

