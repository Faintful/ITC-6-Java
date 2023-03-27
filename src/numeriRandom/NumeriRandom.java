package numeriRandom;

import java.util.*;

public class NumeriRandom {


    public static void rng() {
        int somma = 0;
        Random random = new Random();
        for (int k = 0; k < 5; k++) {
            int l = random.nextInt(101);
            System.out.println(l);
            somma += l;
        }
        System.out.println(somma);
    }

    public static void main(String[] args) {
       /* Random random = new Random();

        int[] intArray = new int[] {
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101)};

        for (int k = 0; k < 5; k++) {
            double z = random.nextInt(101);
            System.out.println(intArray[k]);
        }

        for (int k : intArray) {
            System.out.println(k);
        }

        System.out.println("---SOMMA---");

        System.out.println(intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4]);

    }*/

        rng();

    }
}

