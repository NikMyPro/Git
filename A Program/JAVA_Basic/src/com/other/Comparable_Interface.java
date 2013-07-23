package com.other;

import java.util.Arrays;

public class Comparable_Interface {

    public static void main(String args[]) {
        Person1[] authors = {new Person1("D", "S"), 
                            new Person1("J", "G"), 
                            new Person1("T", "C"), 
                            new Person1("C", "S"), 
                            new Person1("P", "C"),
                            new Person1("B", "B") };

        Arrays.sort(authors); // Sort using Comparable method
        System.out.println("\nOrder after sorting into ascending sequence:");
        
        for (Person1 author : authors) {
            System.out.println(author);
        }

        Person1[] people = { new Person1("C", "S"), 
                            new Person1("N", "K"), 
                            new Person1("T", "C"), 
                            new Person1("C", "D") };
        int index = 0;
        System.out.println("\nIn search of authors:");

        for (Person1 person : people) {
            index = Arrays.binarySearch(authors, person);
            if (index >= 0) {
                System.out.println(person + " was found at index position " + index);
            } else {
                System.out.println(person + " was not found. Return value is " + index);
            }
        }
    }
}

class Person1 implements Comparable<Person1> {
    private String firstName;
    private String surname;

    public Person1(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String toString() {
        return firstName + " " + surname;
    }

    public int compareTo(Person1 person) {
        int result = surname.compareTo(person.surname);
        return result == 0 ? firstName.compareTo(((Person1) person).firstName) : result;
    }
}
