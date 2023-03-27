package struttureDati;

import java.util.Random;

public class Interrogato {
    /*
    * Definire un array di stringhe che contiene i nomi di tutti gli studenti
    *
    * Il programma estrae e visualizza un nome scelto pseudorandomicamente*/

    public static void main(String[] args) {

        Random random = new Random();

        String[] studenti = {"Alfredo", "Carlo", "Cristian", "Emanuele", "Giorgia",
                "Giovanni", "Giovanni B", "Giuseppe", "Ignazio", "Jezzel", "Manuel", "Marco", "Mariangela",
                "Matteo", "Michela", "Nazarena", "Samuele", "Sergio", "Vincenzo"};

        System.out.println(studenti[random.nextInt(studenti.length)]);

    }
}
