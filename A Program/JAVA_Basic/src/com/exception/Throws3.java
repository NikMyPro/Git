package com.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Throws3 {
    public static void main(String args[]) {
        try {
            throw new Exception("for no reason!");
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            System.out.println(sw.toString());
        }
    }
}