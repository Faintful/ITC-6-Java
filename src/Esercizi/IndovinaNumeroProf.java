package Esercizi;

import java.util.Random;
import java.util.Scanner;

class IndovinaNumeroWhile {

    public static void main(String[] args) {

        // creazione di oggetti di interesse

        Scanner in = new Scanner(System.in);
        Random erre = new Random();

        // dichiaro e inizializzo variabili di interesse
        int x = erre.nextInt(101);
        int n = 0, tentativi = 0;

        System.out.println(x);

        // gestisco ciclo per i tre tentativi
        while(tentativi < 3) {

            // chiedo e salvo valore dell'utente
            System.out.print("Dimmi valore (0-100)\n> ");
            n = in.nextInt();

            // gestisco controlli sui valori
            if(x == n) {
                System.out.println("HAI VINTO!!!");
                tentativi = 3;
            }
            else {
                System.out.print("Il valore è più ");

                if(n > x)
                    System.out.println("piccolo");
                else
                    System.out.println("alto");

            }

            tentativi++;
        }

        // visualizzo messaggio in caso in cui l'utente perda
        if(x != n)
            System.out.println("GAME OVER!!! Il valore era " + x);


        in.close();

    }

}