package Esercizi;

import java.util.Random;
import java.util.Scanner;

public class IndovinaNumero {
    /*
    * Scrivere un'applicazione che genera un numero casual intero (0-100) e consenta
    * all'utente di indovinarlo. L'utente ha solo tre tentativi per poter indovinare.
    * In caso in cui l'utente sbagli a scegliere il valore, l'applicazione segnalerà
    * degli aiuti del tipo "ho pensato un numero più grande/piccolo". L’applicazione
    * dovrà dare esito finale in base alle risposte dell’utente.
    *
    * TODO: L'applizazione deve generare un numero casual da 1 a 100
    * TODO: L'utente ha soltanto tre tentativi, dopo di che esce dall'applicazione.
    * TODO: In caso l'utente sbagli, l'applicazione stamperà degli aiuti a video
    * TODO: L'applicazione stamperà a video l'esito finale*/

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int numeroSegreto = random.nextInt(101);
    int risposta;
    int tentativiRimasti = 3;

    private void domanda() {
        System.out.println("Indovina un numero da 1 a 100");
    }

    private void numeroTroppoGrande() {
        System.out.println("Il numero è più grande. Riprovi.");
    }

    private void numeroTroppoPiccolo() {
        System.out.println("Il numero è più piccolo. Riprovi.");
    }

    private void numeroSbagliato() {
        System.out.println("Sbagliato!");
    }

    private void victory() {
        System.out.println("Hai vinto!");
    }

    private void defeat() {
        System.out.println("Hai perso!");
    }

    private void promptForAnswer() {
        risposta = scanner.nextInt();
    }

    public void game() {
        while (risposta != numeroSegreto && tentativiRimasti >= 1) {
            domanda();
            promptForAnswer();
            if (risposta != numeroSegreto) {
                tentativiRimasti--;
                numeroSbagliato();
                if (tentativiRimasti == 0) {
                    defeat();
                } else {
                    if (risposta > numeroSegreto) {
                        numeroTroppoPiccolo();
                    } else {
                        numeroTroppoGrande();
                    }
                }
            } else {
                victory();
            }
        }
    }

    public static void main(String[] args) {
        IndovinaNumero gioco = new IndovinaNumero();
        gioco.game();
        gioco.scanner.close();
    }

}
