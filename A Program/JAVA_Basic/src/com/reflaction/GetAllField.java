package com.reflaction;

import java.lang.reflect.Field;

public class GetAllField {

    public static void main(final String[] args) {
        Integer value = new Integer("123");
        System.out.println("Before: " + value);
        initIntFields(value);
        System.out.println("After: " + value);
    }

    public static void initIntFields(final Object obj) {
        try {
            Field[] fields = obj.getClass().getDeclaredFields();
            for (int idx = 0; idx < fields.length; idx++) {
                if (fields[idx].getType() == int.class) {
                    fields[idx].setAccessible(true);
                    fields[idx].setInt(obj, 0);
                }
            }
        } catch (final IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }
}