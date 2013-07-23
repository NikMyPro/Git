package com.reflaction;

import java.lang.reflect.Modifier;
import java.util.Collection;

public class GetModifier {

    public static void main(final String[] args) {
          printModifiers(Object.class);
          printModifiers(Float.class);
          printModifiers(Collection.class);
          printModifiers(int.class);
          printModifiers(String.class);
        }

        public static void printModifiers(final Class dataType) {
          final int modifiers = dataType.getModifiers();
          if (Modifier.isPrivate(modifiers)) {
            System.out.print("private ");
          }
          if (Modifier.isPrivate(modifiers)) {
            System.out.print("private ");
          }
          if (Modifier.isPublic(modifiers)) {
            System.out.print("private ");
          }
          if (Modifier.isAbstract(modifiers)) {
            System.out.print("abstract ");
          }
          if (Modifier.isFinal(modifiers)) {
            System.out.print("final ");
          }
          if (Modifier.isNative(modifiers)) {
            System.out.print("native ");
          }
          if (Modifier.isInterface(modifiers)) {
            System.out.print("interface ");
          }
          if (Modifier.isStatic(modifiers)) {
            System.out.print("static ");
          }
          if (Modifier.isStrict(modifiers)) {
            System.out.print("strict ");
          }
          if (Modifier.isSynchronized(modifiers)) {
            System.out.print("synchronized ");
          }
          if (Modifier.isTransient(modifiers)) {
            System.out.print("transient ");
          }
          if (Modifier.isVolatile(modifiers)) {
            System.out.print("volatile ");
          }
          System.out.println(dataType.getName());
        }
      }