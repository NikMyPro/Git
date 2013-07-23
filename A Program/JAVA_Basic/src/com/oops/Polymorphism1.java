package com.oops;
//Polymorphism 
public class Polymorphism1 {
    public static void main(String[] args) {
        Student studObj = new Student();
        Employee empObj = new Employee();
        Home homeObj = new Home();
        
        Person perObj = empObj;
        String name = perObj.getName();
        System.out.println(name);
    }
}

class Person {
    public String getName()  {               
          return "I am Niraj.";   
    }
}

class Student extends Person {
    public String getName()  {               
       return "I am Student of MCA";   
 }
}

class Employee extends Person {
    public String getName() { 
     return "I am Android Developer."; 
  }
}

class Home extends Person {
    public String getName() { 
     return "I am Niraj Patel."; 
  }
}