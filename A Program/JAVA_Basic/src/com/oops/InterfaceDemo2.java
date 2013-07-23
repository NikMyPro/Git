package com.oops;


import java.util.ArrayList;
import java.util.Iterator;

public class InterfaceDemo2 {
  public static void main(String args[]) {
    Corporation corporation = new Corporation();

    Division rnd = new Division("R&D");
    rnd.add(new VP("A", "R&D"));
    rnd.add(new VP("B", "R&D"));
    rnd.add(new VP("C", "R&D"));

    Division sales = new Division("Sales");

    sales.add(new VP("E", "Sales"));
    sales.add(new VP("F", "Sales"));
    sales.add(new VP("G", "Sales"));
    sales.add(new VP("F", "Sales"));

    Division western = new Division("Sales");
    western.add(new VP("W", "Sales"));
    western.add(new VP("Z", "Sales"));

    sales.add(western);

    VP vp = new VP("Cary", "At Large");

    corporation.add(rnd);
    corporation.add(sales);
    corporation.add(vp);

    corporation.print();
  }
}

class Corporation extends Corporate {
  private ArrayList<Corporate> corporate = new ArrayList<Corporate>();


  public Corporation() {
  }

  public void add(Corporate c) {
    corporate.add(c);
  }

  public void print() {
    Iterator iterator = corporate.iterator();

    while (iterator.hasNext()) {
      Corporate c = (Corporate) iterator.next();
      c.print();
    }
  }
}

abstract class Corporate {
  public String getName() {
    return "";
  }

  public void add(Corporate c) {
  }

  public Iterator iterator() {
    return null;
  }

  public void print() {
  }
}

class Division extends Corporate {
  private Corporate[] corporate = new Corporate[100];
  private int number = 0;
  private String name;

  public Division(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void add(Corporate c) {
    corporate[number++] = c;
  }

  public Iterator iterator() {
    return new DivisionIterator(corporate);
  }

  public void print() {
    Iterator iterator = iterator();

    while (iterator.hasNext()) {
      Corporate c = (Corporate) iterator.next();
      c.print();
    }
  }
}

class VP extends Corporate {
  private String name;
  private String division;

  public VP(String n, String d) {
    name = n;
    division = d;
  }

  public String getName() {
    return name;
  }

  public void print() {
    System.out.println("Name: " + name + " Division: " + division);
  }

  public Iterator iterator() {
    return new VPIterator(this);
  }

}

class VPIterator implements Iterator {
  private VP vp;

  public VPIterator(VP v) {
    vp = v;
  }

  public VP next() {
    return vp;
  }

  public boolean hasNext() {
    return false;
  }

  public void remove() {
  }
}

class DivisionIterator implements Iterator {
  private Corporate[] corporate;
  private int location = 0;

  public DivisionIterator(Corporate[] c) {
    corporate = c;
  }

  public Corporate next() {
    return corporate[location++];
  }

  public boolean hasNext() {
    if (location < corporate.length && corporate[location] != null) {
      return true;
    } else {
      return false;
    }
  }

  public void remove() {
  }
}