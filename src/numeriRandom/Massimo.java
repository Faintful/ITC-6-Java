package numeriRandom;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Massimo {

    /*
    Scrivere un programma che:
        TODO: Genera 7 valori random interi
        TODO: Visualizza tutti i valori (print)
        TODO: Visualizza il valore massimo
     */

    Integer[] valoriRandomInteri = new Integer[7];

    Random random = new Random();

    public void cycle() {
        for (int k = 0; k < valoriRandomInteri.length; k++) {
            valoriRandomInteri[k] = random.nextInt(101);
            System.out.println(valoriRandomInteri[k]);
            System.out.println("iteration: " + k);
        }
    }

    public void sort() {
        for (int k : valoriRandomInteri) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        Massimo massimo = new Massimo();
        massimo.cycle();
        System.out.println("valore massimo è: " + massimo.valoriRandomInteri[0]);
        Arrays.sort(massimo.valoriRandomInteri, new Compares());
        massimo.sort();
        }
    }

