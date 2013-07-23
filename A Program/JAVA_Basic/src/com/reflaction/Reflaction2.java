package com.reflaction;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Reflaction2 {

    public static void main(final String[] args) {
        method4();
    }

    public static void method4() {
        final Set classes = new HashSet();
        // interface Class
        classes.add(Comparable.class);
        classes.add(Serializable.class);

        // primitive Class
        classes.add(int.class);
        classes.add(boolean.class);

        // array Class
        classes.add(Float[].class);
        classes.add(double[].class);

        classes.add(Class.class);
        classes.add(Integer.class);
        classes.add(String.class);

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