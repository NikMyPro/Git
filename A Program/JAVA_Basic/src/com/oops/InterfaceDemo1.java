package com.oops;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

interface Visitor {
    void visit(FriendsInHighSchool g);

    void visit(FriendsFromNeighbour r);

    void visit(NewFriends c);
}

interface Friend {
    void accept(Visitor v);
}

class FriendsInHighSchool implements Friend {
    public void accept(Visitor v) {
        v.visit(this);
    }
}

class FriendsFromNeighbour implements Friend {
    public void accept(Visitor v) {
        v.visit(this);
    }
}

class NewFriends implements Friend {
    public void accept(Visitor v) {
        v.visit(this);
    }
}

class Party implements Visitor {
    String s;

    public String toString() {
        return s;
    }

    public void visit(FriendsInHighSchool g) {
        s = "FriendsInHighSchool";
    }

    public void visit(FriendsFromNeighbour r) {
        s = "FriendsFromNeighbour";
    }

    public void visit(NewFriends c) {
        s = "NewFriends";
    }
}

class Drink implements Visitor {
    public void visit(FriendsInHighSchool g) {
        System.out.println("Drink and FriendsInHighSchool");
    }

    public void visit(FriendsFromNeighbour r) {
        System.out.println("Drink and FriendsFromNeighbour");
    }

    public void visit(NewFriends c) {
        System.out.println("Drink and NewFriends");
    }
}

class FriendsGenerator {
    private static Random rand = new Random();

    public static Friend newFlower() {
        switch (rand.nextInt(3)) {
        default:
        case 0:
            return new FriendsInHighSchool();
        case 1:
            return new FriendsFromNeighbour();
        case 2:
            return new NewFriends();
        }
    }
}

public class InterfaceDemo1 {
    public static void main(String args[]) {
        List<Friend> flowers = new ArrayList<Friend>();

        for (int i = 0; i < 10; i++)
            flowers.add(FriendsGenerator.newFlower());

        Party sval = new Party();
        Iterator it = flowers.iterator();
        while (it.hasNext()) {
            ((Friend) it.next()).accept(sval);
            System.out.println(sval);
        }
        Drink bee = new Drink();
        it = flowers.iterator();
        while (it.hasNext())
            ((Friend) it.next()).accept(bee);

    }

}