package com.other;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableAndComparator2 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Person();
        persons[0].setFirstName("A");
        persons[0].setLastName("X");
        persons[0].setAge(56);

        persons[1] = new Person();
        persons[1].setFirstName("S");

        persons[1].setLastName("C");
        persons[1].setAge(8);

        persons[2] = new Person();
        persons[2].setFirstName("E");
        persons[2].setLastName("H");
        persons[2].setAge(16);

        persons[3] = new Person();
        persons[3].setFirstName("B");
        persons[3].setLastName("Q");
        persons[3].setAge(69);

        System.out.println("Natural Order");
        displayList(persons);

         Arrays.sort(persons, new LastNameComparator());
         System.out.println("Sorted by last name");
         displayList(persons);
        
         Arrays.sort(persons, new FirstNameComparator());
         System.out.println("Sorted by first name");
         displayList(persons);

        Arrays.sort(persons);
        System.out.println("Sorted by age");
        displayList(persons);
    }

    public static void displayList(Person[] persons) {
        for (int i = 0; i < 4; i++) {
            Person person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + ". Age:" + age);
        }
        System.out.println();
    }
}

class Person implements Comparable {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Object anotherPerson) throws ClassCastException {
        if (!(anotherPerson instanceof Person)) {
            throw new ClassCastException("A Person object expected.");
        }
        int anotherPersonAge = ((Person) anotherPerson).getAge();
        return this.age - anotherPersonAge; // Ascending
        // return anotherPersonAge - this.age; //Descending
    }

    public static Comparator<Person> personNameComparator = new Comparator<Person>() {
        public int compare(Person firstPerson, Person secondPerson) {
            String personName1 = firstPerson.getFirstName().toUpperCase();
            String personName2 = secondPerson.getFirstName().toUpperCase();
            // ascending order
            return personName1.compareTo(personName2);
            // descending order
            // return fruitName2.compareTo(fruitName1);
        }
    };
}

class LastNameComparator implements Comparator {
    public int compare(Object firstPerson, Object secondPerson) {
        String fp_firstName = ((Person) firstPerson).getFirstName().toUpperCase();
        String fp_lastName = ((Person) firstPerson).getLastName().toUpperCase();
        String sp_firstName = ((Person) secondPerson).getFirstName().toUpperCase();
        String sp_lastName = ((Person) secondPerson).getLastName().toUpperCase();

        if (fp_lastName.equals(sp_lastName)) {
            return fp_firstName.compareTo(sp_firstName);
        } else {
            return fp_lastName.compareTo(sp_lastName);
        }
    }
}

class FirstNameComparator implements Comparator {
    public int compare(Object firstPerson, Object secondPerson) {
        String fp_firstName = ((Person) firstPerson).getFirstName().toUpperCase();
        String fp_lastName = ((Person) firstPerson).getLastName().toUpperCase();
        String sp_firstName = ((Person) secondPerson).getFirstName().toUpperCase();
        String sp_lastName = ((Person) secondPerson).getLastName().toUpperCase();
        if (fp_firstName.equals(sp_firstName)) {
            return fp_lastName.compareTo(sp_lastName);
        } else {
            return fp_firstName.compareTo(sp_firstName);
        }
    }
}
