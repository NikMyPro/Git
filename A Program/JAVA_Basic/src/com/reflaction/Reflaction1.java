package com.reflaction;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Reflaction1 {

    public static void main(final String[] args) {
        //checkMethodAvialable(String.class, "hashCode");
        // method1();
        // method2();
        // method3();
    }

    public static void method1() {
        Method[] methods = String.class.getMethods();
        for (int idx = 0; idx < methods.length; idx++) {
            System.out.println("\n" + methods[idx] + " declared by " + methods[idx].getDeclaringClass());
            System.out.println("\n" + methods[idx] + " Return Type " + methods[idx].getReturnType());
            System.out.println("\n" + methods[idx] + " Param Type " + methods[idx].getParameterTypes());
        }
    }

    public static void method2() {
        System.out.println(String.class.getName());
        System.out.println(int[].class.getName());
        System.out.println(float[].class.getName());
        System.out.println(String[].class.getName());
        System.out.println(String.class.getPackage());
    }

    public static void method3() {
        try {
            String pc = String.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkMethodAvialable(Class<?> clazz, String methodName) {
        try {
            clazz.getDeclaredMethods();
            System.out.println(clazz.getDeclaredMethods());
            clazz.getMethod("hashCode");
            System.out.println("True");
            return true;
        } catch (NoSuchMethodException e) {
            System.out.println("False");
            return false;
        }
    }

    public static void method4() {
        final Set classes = new HashSet();
        classes.add(Class.class);
        classes.add(Comparable.class);
        classes.add(Serializable.class);
        classes.add(Integer.class);
        classes.add(int.class);
        classes.add(Float[].class);
        classes.add(String.class);
        classes.add(double[].class);
        classes.add(boolean.class);

        // --
        System.out.println("Finding interface Class objects in the set.");
        Iterator iter = classes.iterator();
        while (iter.hasNext()) {
            useIsInterface((Class) iter.next());
        }

        System.out.println("\nFinding primitive Class objects in the set.");
        iter = classes.iterator();
        while (iter.hasNext()) {
            useIsPrimitive((Class) iter.next());
        }

        System.out.println("\nFinding array Class objects in the set.");
        iter = classes.iterator();
        while (iter.hasNext()) {
            useIsArray((Class) iter.next());
        }
    }

    public static void useIsArray(final Class dataType) {
        if (dataType == null) {
            throw new NullPointerException();
        }
        if (dataType.isArray()) {
            System.out.print(dataType.getName());
            System.out.println("\t ==> " + dataType.getComponentType());
        }
    }

    public static void useIsInterface(final Class dataType) {
        if (dataType == null) {
            throw new NullPointerException();
        }
        if (dataType.isInterface()) {
            System.out.println(dataType.getName());
        }
    }

    public static void useIsPrimitive(final Class dataType) {
        if (dataType == null) {
            throw new NullPointerException();
        }
        if (dataType.isPrimitive()) {
            System.out.println(dataType.getName());
        }
    }
}