package com.exception;

public class Throws1 {
    public static void main(String[] args) {
        String input = null;
        try {
            String capitalized = capitalize(input);
            System.out.println(capitalized);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    public static String capitalize(String s) throws NullPointerException {
        if (s == null) {
            throw new NullPointerException("Your passed a null argument");
        }
        Character firstChar = s.charAt(0);
        String theRest = s.substring(1);
        return firstChar.toString().toUpperCase() + theRest;
    }
}
