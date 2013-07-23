package com.generic;

  public class Generic_Constructors {
    public static void main(String args[]) {

      GenericClass2 test = new GenericClass2(100);
      GenericClass2 test2 = new GenericClass2(123.5F);

      test.showValue();
      test2.showValue();
    }
  }
  
  class GenericClass2 {
      private double val;
      
      <T extends Number> GenericClass2(T arg) {
          val = arg.doubleValue();
      }
      
      void showValue() {
          System.out.println("val: " + val);
      }
  }