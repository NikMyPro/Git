package com.reflaction;

import java.util.Arrays;

public class GetClassInfo {

    public static void main(final String[] args) {
        printMemberClasses(String.class);
    }

    public static void printMemberClasses(final Class dataType) {
        final Class[] nestedClasses = dataType.getClasses();
        final Class[] declaredNestedClasses = dataType.getDeclaredClasses();
        final Class[] nestedInterfaces = dataType.getInterfaces();
        final Class declaringClass = dataType.getDeclaringClass();
        final Class superClass = dataType.getSuperclass();

        // --
        System.out.println("Member Class infor for: " + dataType.getName());
        System.out.println("Nested Classes: " + Arrays.asList(nestedClasses));
        System.out.println("Declared Nested Classes: " + Arrays.asList(declaredNestedClasses));
        System.out.println("Interfaces: " + Arrays.asList(nestedInterfaces));
        System.out.println("Declaring Class: " + declaringClass);
        System.out.println("Super Class: " + superClass);
        System.out.println();
      }
}