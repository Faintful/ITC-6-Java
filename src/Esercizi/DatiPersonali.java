package Esercizi;

import java.util.Scanner;

public class DatiPersonali {

    /*      Crea un programma che abbia un nome, e si presenti al nostro utente
            Il programma farà delle domande personali al nostro utente quale:
            età, nome, cognome, altezza. Alla fine stamperà su schermo tutte le informazioni
            facendo un riassunto delle caratteristiche.
            */

    Scanner scanner = new Scanner(System.in);

    String nome;
    String cognome;
    int età;
    int altezza;

    public void initialize() {
        chiediNome();
        chiediCognome();
        chiediEtà();
        chiediAltezza();
        riassunto();
    }

    public void chiediNome() {
        System.out.println("Come ti chiami?");
        nome = scanner.nextLine();
    }

    public void chiediCognome() {
        System.out.println("Qual è il tuo cognome?");
        cognome = scanner.nextLine();
    }

    public void chiediEtà() {
        System.out.println("Quanti anni hai?");
        età = scanner.nextInt();
    }

    public void chiediAltezza() {
        System.out.println("Quanto sei alto/a? (in centimetri)");
        altezza = scanner.nextInt();
    }

    public void riassunto() {
        System.out.println("Ti chiami " + nome + ". Il tuo cognome è " + cognome + ". Hai " + età + " anni, e sei alto " + altezza +" centimetri.");
    }

    public static void main(String[] args) {
        DatiPersonali datiPersonali = new DatiPersonali();
        datiPersonali.initialize();
    }

}
