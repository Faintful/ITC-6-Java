package Esercizi;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EsDue {

/*    scrivi un programma che prenda in esame una stringa(una frase) dell'utente.
    Se è un numero però la stringa deve essere rifiutata e quindi il programma dirà
    al nostro utente di inserire di nuovo un input valido. Al secondo tentativo se si
    inserisce di nuovo qualcosa di non valido allora il programma si chiuderà dicendo
    "Operazione annullata" Se anziché di essere una stringa è uno spazio vuoto anche
    questo verrà annullato*/

    public static void main(String[] args) {
//        int[] intArray = {34, 5, 634};
//        System.out.println(Arrays.toString(intArray));
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(new String("cat"));
        stringArrayList.add(new String("dog"));
        stringArrayList.add(new String("bird"));

        int scanInt = scanner.nextInt();
        System.out.println(stringArrayList.contains(stringArrayList.get(scanInt)));
    }

}
