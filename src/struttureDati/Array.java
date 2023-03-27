package struttureDati;

import java.util.Random;
import java.util.Scanner;

public class Array {
    /*
    * Scrivere un programma che:
    * TODO: Chiede all'utente di inserire quanti valori gestire (n)
    * TODO: Crea una struttura dati in grado di contenere n elementi
    * TODO: Genera e salva n elementi randomici
    * Scrive a video:
    *   TODO: I valori salvati
    *   TODO: La somma di tutti i valori
    *   TODO: Massimo di tutti i valori
    *    */

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n;
        int somma = 0;

        System.out.println("Inserisci un numero di elementi dell'array:");
        n = scanner.nextInt();
        scanner.close();
        int[] intArray = new int[n];

        for (int k = 0; k < intArray.length; k++) {
            intArray[k] = random.nextInt(101);
            System.out.println(intArray[k]);
            somma += intArray[k];
        }

        System.out.println("Somma dell'array è: " + somma);

        /*VALORE MASSIMO:*/

        int max;

        for (int k = 0; k < intArray.length; k++) {
            int temp = intArray[k];
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[k] > intArray[j++]) {
                    max = intArray[k];
                }
            }
        }
    }
}
