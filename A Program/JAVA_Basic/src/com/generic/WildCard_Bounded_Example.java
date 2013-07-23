package com.generic;

// Demonstrate a bounded wildcard.
public class WildCard_Bounded_Example {

    public static void main(String args[]) {
        Two td[] = { new Two(0, 0), new Two(7, 9), new Two(18, 4), new Two(-1, -23) };
        Gene<Two> tdlocs = new Gene<Two>(td);
        System.out.println("Contents of tdlocs.");
        showTwo(tdlocs); // OK, is a TwoD

        Four fd[] = { new Four(1, 2, 3, 4), new Four(6, 8, 14, 8), new Four(22, 9, 4, 9), new Four(3, -2, -23, 17) };
        Gene<Four> fdlocs = new Gene<Four>(fd);
        System.out.println("Contents of fdlocs.");
        
        // These are all OK.
        showTwo(fdlocs);
        showThree(fdlocs);
        showAll(fdlocs);
    }

    static void showTwo(Gene<?> c) {
        System.out.println("X Y Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        System.out.println();
    }

    static void showThree(Gene<? extends Three> c) {
        System.out.println("X Y Z Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        System.out.println();
    }

    static void showAll(Gene<? extends Four> c) {
        System.out.println("X Y Z T Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        System.out.println();
    }
}

class Two {
    int x, y;
    
    Two(int a, int b) {
        x = a;
        y = b;
    }
}

class Three extends Two {
    int z;
    
    Three(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class Four extends Three {
    int t;
    
    Four(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class Gene<T extends Two> {
    T[] coords;
    
    Gene(T[] o) {
        coords = o;
    }
}