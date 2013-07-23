package com.exception;

public class Throws2 {
    public static void main(String[] args) {
        String input = "HELLO";
        try {
            String capitalized = capitalize(input);
            System.out.println(capitalized);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static String capitalize(String s) throws NullPointerException, AlreadyCapitalizedException {
        if (s == null) {
            throw new NullPointerException("Your passed a null argument");
        }
        Character firstChar = s.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            throw new AlreadyCapitalizedException();
        }
        String theRest = s.substring(1);
        return firstChar.toString().toUpperCase() + theRest;
    }
}

@SuppressWarnings("serial")
class AlreadyCapitalizedException extends Exception {
    public String toString() {
        return "Input has already been capitalized";
    }
}