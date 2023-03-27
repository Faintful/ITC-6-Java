package canzoni;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Canzone> canzoni = new ArrayList<>();

    boolean on = true;

    public Playlist() {
    }

    private void riga() {
        System.out.println("----------------------------------------------------------");
    }

    public void inizio() {

        while (on) {System.out.println("""
            1) Inserire canzone in playlist
            2) Visualizzare playlist
            3) Modificare playlist
            4) Extra

            0) Uscire dal programma
            """);
            int menuPrincipale = scanner.nextInt();
            switch (menuPrincipale) {
                default:
                    System.out.println("Input non valido");
                    break;
                case 0:
                    riga();
                    on = false;
                    System.out.println("Chiusura programma");
                    riga();
                    break;
                case 1:
                    riga();
                    System.out.println("Inseririmento nuova canzone");
                    System.out.println("\n");
                    System.out.println("Inserire nome della canzone:");
                    scanner.nextLine();
                    String titolo = scanner.nextLine();
                    System.out.println("Inserire testo della canzone:");
                    String testo = scanner.nextLine();
                    System.out.println("Inserire nome artista della canzone:");
                    String cantante = scanner.nextLine();
                    System.out.println("Inserire lunghezza della canzone:");
                    int lunghezza = scanner.nextInt();
                    canzoni.add(new Canzone(titolo, testo, cantante, lunghezza));
                    System.out.println("Canzone inserita con successo!");
                    riga();
                    break;
                case 2:
                    riga();
                    System.out.println("Visualizzazione canzoni. Scegli una canzone:");
                    for (int k = 0; k < canzoni.size(); k++) {
                        String string = "\n";
                        System.out.println(string += k + 1 + ")");
                    }
                    riga();
                    int sceltaCanzone;
                    if (!canzoni.isEmpty()) {
                        do {
                            sceltaCanzone = scanner.nextInt();
                            if (canzoniContains(sceltaCanzoneMenoUno(sceltaCanzone))) {
                                System.out.println("Input non valido. Riprovi.");
                            }
                        }
                        while (canzoniContains(sceltaCanzoneMenoUno(sceltaCanzone)));
                    } else {
                        System.out.println("Inserire canzoni e poi riprovare.");
                        riga();
                        break;
                    }
                    System.out.println("Scegli opzione:");
                    System.out.println("""

            1) Visualizza nome
            2) Visualizza artista
            3) Visualizza testo
            4) Visualizza durata
            5) Visualizza tutti i dati insieme

            0) Menù precedente
            """);
                    int scegliOpzioneDatiCanzoni = scanner.nextInt();
                    switch (scegliOpzioneDatiCanzoni) {
                        case 1:
                            riga();
                            System.out.println(canzoni.get(sceltaCanzoneMenoUno(sceltaCanzone)).getTitolo());
                            riga();
                            break;
                        case 2:
                            riga();
                            System.out.println(canzoni.get(sceltaCanzoneMenoUno(sceltaCanzone)).getArtista());
                            riga();
                            break;
                        case 3:
                            riga();
                            System.out.println(canzoni.get(sceltaCanzoneMenoUno(sceltaCanzone)).getTesto());
                            riga();
                            break;
                        case 4:
                            riga();
                            System.out.println(canzoni.get(sceltaCanzoneMenoUno(sceltaCanzone)).getDurata());
                            riga();
                            break;
                        case 5:
                            riga();
                            System.out.println(canzoni.get(sceltaCanzoneMenoUno(sceltaCanzone)));
                            riga();
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Scegli opzione:");
                    System.out.println("""

            1) Visualizzare se due canzoni hanno lo stesso cantante
            2) Visualizzare la canzone che dura di più
            3) Visualizzare quante canzoni durano almeno 3 minuti

            0) Menù precedente
            """);
                    int sceltaExtra;
                    sceltaExtra = scanner.nextInt();
                    switch (sceltaExtra) {
                        default:
                            System.out.println("Input non valido");
                        case 0:
                            break;
                        case 1:
                            if (!canzoni.isEmpty()) {
                                riga();
                                System.out.println("Stesso cantante? Scegli due canzoni:");
                                for (int k = 0; k < canzoni.size(); k++) {
                                    String string = "\n";
                                    System.out.println(string += k + 1 + ") " + canzoni.get(k));
                                }
                                int sceltaPrimaCanzone = scanner.nextInt() - 1;
                                System.out.println("Scegli una seconda canzone:");
                                int sceltaSecondaCanzone = scanner.nextInt() - 1;
                                if (canzoni.get(sceltaPrimaCanzone).artista.equals(canzoni.get(sceltaSecondaCanzone).artista)) {
                                    System.out.println("Gli artisti sono uguali!");
                                } else {
                                    System.out.println("Gli artisti non sono uguali...");
                                }
                                riga();
                                break;
                            } else {
                                System.out.println("Inserire canzoni e poi riprovare.");
                            }
                            break;
                        case 2:
                            if (!canzoni.isEmpty()) {
                                riga();
                                Canzone longestSong = canzoni.get(0);
                                for (Canzone canzone: canzoni) {
                                    if (canzone.getDurata() > longestSong.getDurata()) {
                                        longestSong = canzone;
                                    }
                                }
                                System.out.println("La canzone che dura di più è la canzone numero " + (canzoni.indexOf(longestSong) + 1));
                                riga();
                                break;
                            } else {
                                System.out.println("Inserire canzoni e poi riprovare.");
                            }
                            break;
                        case 3:
                            if (!canzoni.isEmpty()) {
                                riga();
                                String canzoniLunghe = "";
                                for (Canzone canzone : canzoni) {
                                    if (canzone.getDurata() > 3) {
                                        canzoniLunghe += (canzoni.indexOf(canzone) + 1) + ", ";
                                    } else {
                                        System.out.println("Non ci sono canzoni più lunghe di tre minuti nella playlist");
                                        break;
                                    }
                                }
                                canzoniLunghe += ".";
                                System.out.println("Le canzoni più lunghe di tre minuti sono le canzoni numero: " + canzoniLunghe);
                                riga();
                                break;
                            } else {
                                System.out.println("Inserire canzoni e poi riprovare.");
                            }
                            break;
                    }
                    break;
                case 3:
                    if (!canzoni.isEmpty()) {
                        riga();
                        System.out.println("Che cosa vorresti modificare della playlist?");
                        System.out.println("""
                                1) Voglio modificare una canzone
                                2) Voglio eliminare una canzone
                                
                                0) Menù precedente
                                """);
                        int sceltaImpostaPlaylist;
                        sceltaImpostaPlaylist = scanner.nextInt();
                        switch (sceltaImpostaPlaylist) {
                            default:
                                System.out.println("Input non valido");
                            case 0:
                                break;
                            case 1:
                                System.out.println("Scegli una canzone da mofidicare:");
                                for (int k = 0; k < canzoni.size(); k++) {
                                    String string = "\n";
                                    System.out.println(string += k + 1 + ")");
                                }
                                int sceltaSetCanzone;
                                sceltaSetCanzone = scanner.nextInt();
                                System.out.println("Scegli che cosa vuoi modificare:");
                                System.out.println("""
                                        1) Imposta titolo
                                        2) Imposta artista
                                        3) Imposta testo
                                        4) Imposta durata
                                        
                                        0) Menù precedente
                                        """);
                                int sceltaCosaImpostare;
                                sceltaCosaImpostare = scanner.nextInt();
                                switch (sceltaCosaImpostare) {
                                    default:
                                        System.out.println("Input non valido");
                                    case 0:
                                        break;
                                    case 1:
                                        riga();
                                        System.out.println("Dimmi il nuovo titolo:");
                                        scanner.nextLine();
                                        canzoni.get(sceltaCanzoneMenoUno(sceltaSetCanzone)).setTitolo(scanner.nextLine());
                                        riga();
                                        break;
                                    case 2:
                                        riga();
                                        System.out.println("Dimmi il nuovo artista:");
                                        scanner.nextLine();
                                        canzoni.get(sceltaCanzoneMenoUno(sceltaSetCanzone)).setArtista(scanner.nextLine());
                                        riga();
                                        break;
                                    case 3:
                                        riga();
                                        System.out.println("Dimmi il nuovo testo:");
                                        scanner.nextLine();
                                        canzoni.get(sceltaCanzoneMenoUno(sceltaSetCanzone)).setTesto(scanner.nextLine());
                                        riga();
                                        break;
                                    case 4:
                                        riga();
                                        System.out.println("Dimmi la nuova durata:");
                                        scanner.nextLine();
                                        canzoni.get(sceltaCanzoneMenoUno(sceltaSetCanzone)).setDurata(scanner.nextInt());
                                        riga();
                                        break;
                                }
                                break;
                            case 2:
                                riga();
                                System.out.println("Quale canzone vuoi eliminare?");
                                for (int k = 0; k < canzoni.size(); k++) {
                                    String string = "\n";
                                    System.out.println(string += k + 1 + ")");
                                }
                                canzoni.remove(sceltaCanzoneMenoUno(scanner.nextInt()));
                                System.out.println("Canzone eliminata");
                                riga();
                                break;

                        }
                    } else {
                        System.out.println("Inserire canzoni e poi riprovare.");
                    }
                    break;
            }
        }
    }

    private boolean canzoniContains(int sceltaCanzone) {
        return sceltaCanzone < 0 || sceltaCanzone > canzoni.size() - 1;
    }

    private int sceltaCanzoneMenoUno(int sceltaCanzone) {
        return sceltaCanzone - 1;
    }
}
