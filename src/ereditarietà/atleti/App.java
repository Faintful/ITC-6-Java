package ereditarietà.atleti;

import ereditarietà.atleti.medaglie.Argento;
import ereditarietà.atleti.medaglie.Bronzo;
import ereditarietà.atleti.medaglie.Medaglia;
import ereditarietà.atleti.medaglie.Oro;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    Scanner in = new Scanner(System.in);
    ArrayList<Atleta> atleti = new ArrayList<>();

    boolean onOff = true;

    public void inizio() {
        System.out.println("""
                1) Aggiungere un atleta all'elenco
                2) Visualizzare l’elenco degli atleti nell’ordine in cui sono stati inseriti
                3) Visualizzare l’elenco dei soli olimpionici
                4) Visualizzare il totale delle medaglie d’oro vinte da atleti di una nazionalità scelta dall’utente
                5) Visualizzare un messaggio che indica se due atleti scelti dall’utente hanno lo stesso punteggio
                6) Visualizzare un messaggio che indica qual è l’olimpionico migliore tra due atleti scelti dall’utente
                
                0) Uscire
                """);
        switch (in.nextInt()) {
            case 0:
                System.out.println("Chiusura...");
                onOff = false;
                break;
            default:
                System.out.println("Input non valido");
                break;
            case 1:
                System.out.println("Scegli tipologia atleta da aggiungere:");
                System.out.println("""
                        1) Generico
                        2) Dilettante
                        3) Professionista
                        4) Olimpionico
                        
                        0) Menù precedente
                        """);
                switch (in.nextInt()) {
                    case 0:
                        break;
                    default:
                        System.out.println("Input non valido");
                        break;
                    case 1:
                        atleti.add(chiediAtleta());
                        break;
                    case 2:
                        atleti.add(chiediDilettante());
                        break;
                    case 3:
                        atleti.add(chiediProfessionista());
                        break;
                    case 4:
                        atleti.add(chiediOlimpionico());
                        break;
                }
                break;
            case 2:
                visualizzareElencoAtleti();
                break;
            case 3:
                int j = 1;
                for (Atleta k : atleti) {
                    if (k instanceof Olimpionico) {
                        System.out.println(j + ") " + k);
                        j++;
                    }
                }
                break;
            case 4:
                System.out.println("Dimmi nazionalità");
                String nazionalità = in.nextLine();
                int oro = 0;
                for (Atleta k : atleti) {
                    if (k instanceof Olimpionico && ((Olimpionico) k).getNazionalità().equals(nazionalità)) {
                        oro += ((Olimpionico) k).getOro().size();
                    }
                }
                System.out.println("Totale medaglie d'oro per atleti olimpionici provenienti dal " + nazionalità + ": " + oro);
                break;
            case 5:
                System.out.println("Scegli due atleti:");
                visualizzareElencoAtleti();
                if (((Olimpionico) (atleti.get(in.nextInt() - 1))).getPunti() == ((Olimpionico) (atleti.get(in.nextInt() - 1))).getPunti()) {
                    System.out.println("I punti degli atleti sono uguali");
                } else {
                    System.out.println("Non sono iguali");
                }
                break;
            case 6:
                System.out.println("Scegli due atleti:");
                visualizzareElencoAtleti();

                int opt1 = in.nextInt() - 1;
                int opt2 = in.nextInt() - 1;


                if (((Olimpionico) (atleti.get(opt1))).getPunti() < ((Olimpionico) (atleti.get(opt2))).getPunti()) {
                    System.out.println("Il primo atleta è migliore rispetto all'altro");
                } else {
                    System.out.println("Il secondo atleta è migliore rispetto all'altro");
                }
        }
    }

    private void visualizzareElencoAtleti() {
        int m = 1;
        for (Atleta k : atleti) {
            System.out.println(m + ") " + k);
            m++;
        }
    }

    public boolean isOnOff() {
        return onOff;
    }

    private Atleta chiediAtleta() {
        System.out.println("Dimmi nome:");
        in.nextLine();
        String nome = in.nextLine();
        System.out.println("Dimmi specialità:");
        String specialità = in.nextLine();
        return new Atleta(nome, specialità);
    }

    private Dilettante chiediDilettante() {
        System.out.println("Dimmi nome:");
        in.nextLine();
        String nome = in.nextLine();
        System.out.println("Dimmi specialità:");
        String specialità = in.nextLine();
        System.out.println("Dimmi gare vinte:");
        int gareVinte = in.nextInt();
        return new Dilettante(nome, specialità, gareVinte);
    }

    private Professionista chiediProfessionista() {
        System.out.println("Dimmi nome:");
        in.nextLine();
        String nome = in.nextLine();
        System.out.println("Dimmi specialità:");
        String specialità = in.nextLine();
        System.out.println("Dimmi tessera iscrizione:");
        int tesseraIscrizione = in.nextInt();
        return new Professionista(nome, specialità, tesseraIscrizione);
    }

//    private Professionista inserisciProfessionista(String nome, String specialità, int tesseraIscrizione) {
//        return new Professionista(nome, specialità, tesseraIscrizione);
//    }

    private Olimpionico chiediOlimpionico() {
        System.out.println("Dimmi nome:");
        in.nextLine();
        String nome = in.nextLine();
        System.out.println("Dimmi specialità:");
        String specialità = in.nextLine();
        System.out.println("Dimmi tessera iscrizione:");
        int tesseraIscrizione = in.nextInt();
        System.out.println("Dimmi nazionalità:");
        String nazionalità = in.nextLine();
        in.nextLine();
        return new Olimpionico(nome, specialità, tesseraIscrizione, nazionalità, chiediMedaglie());
    }

    private ArrayList<Medaglia> chiediMedaglie() {
        ArrayList<Medaglia> temp = new ArrayList<>();
        boolean loop = true;
        while (loop) {
        System.out.println("Scegli medaglie da inserire:");
        System.out.println("""
                1) Bronzo
                2) Argento
                3) Oro
                
                0) Fine
                """);

            switch (in.nextInt()) {
                default:
                    System.out.println("Input non valido");
                    break;
                case 0:
                    loop = false;
                    break;
                case 1:
                    System.out.println("Aggiunta medaglia bronzo");
                    temp.add(new Bronzo());
                    break;
                case 2:
                    System.out.println("Aggiunta medaglia argento");
                    temp.add(new Argento());
                    break;
                case 3:
                    System.out.println("Aggiunta medaglia oro");
                    temp.add(new Oro());
                    break;
            }
        }
        return temp;
    }

}
