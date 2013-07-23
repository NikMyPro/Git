/**
 * 
 */
package com.other;
import static java.lang.Math.*;
/**
 * @ProjectName Abc
 * @PackageName ab.cd
 * @FileName test.java
 * @Author Gateway Technolabs Pvt Ltd.
 * @ModifiedDate Jun 14, 2013 10:25:03 AM
 * @Description 
 */
public class StringFormat {
    
    public static void main(String[] args) {
        String string = String.format("%d",42);
        //String string = String.format("%,d",1000000000);
        //String string = String.format("Rank is %,d out of %,.2f",1000000000,12345678.123456);
        //String string = String.format("%.2f",1000.222);
        //String string = String.format("%,6.1f",1000.222);
        //String string = String.format("%x",42);
        //String string = String.format("%c","a");
        System.out.println(string);
        abs(2354.345345);
    }
}
