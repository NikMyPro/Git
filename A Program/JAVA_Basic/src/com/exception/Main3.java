package com.exception;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try {
            System.out.println("Executed main()");
            System.in.read();
            return;
        } catch (IOException e) {
            System.out.println("I/O exception caught in main()");
        } finally {
            System.out.println("Executed finally block");
        }
        System.out.println("Executed Last line");
    }
}