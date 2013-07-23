/**
 * 
 */
package com.other;

/**
 * @ProjectName Abc
 * @PackageName ab.cd
 * @FileName test.java
 * @Author Gateway Technolabs Pvt Ltd.
 * @ModifiedDate Jun 14, 2013 10:25:03 AM
 * @Description 
 */
public class Integer_vs_int {
    static Integer integer;
    int i;
    
    public static void main(String[] args) {
        integer =  new Integer(0);
        Integer_vs_int integer_vs_int = new Integer_vs_int();
        integer_vs_int.go();
    }

    public void go() {
        i = integer;
        System.out.println(integer);
        System.out.println(i);
    }
}
