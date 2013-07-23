package com.array;

import java.util.Arrays;

public class ArrayCompare{
    public static void main(String[] argv) throws Exception {

        boolean b = Arrays.equals(new char[] { 'a' }, new char[] { 'a' }); // true
        boolean c = Arrays.equals(new int[] { 0 }, new int[] { 0 }); // true
    }
}