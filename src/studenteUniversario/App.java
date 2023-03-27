package studenteUniversario;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    Scanner in = new Scanner(System.in);
    private final ArrayList<Studente> studenti = new ArrayList<>();
    private final ArrayList<Studente> docenti = new ArrayList<>();

    private boolean acceso = true;

    private Studente user;

    public App(ArrayList<Studente> studenti, ArrayList<Studente> docenti) {
        this.studenti.addAll(studenti);
        this.docenti.addAll(docenti);
    }

    public void setUser(Studente user) {
        this.user = user;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public Studente logIn() {

        String nome;
        String cognome;
        int matricola;

        do {
            System.out.println("Dimmi nome:");
            in.nextLine();
            nome = in.nextLine();
            System.out.println("Dimmi cognome:");
            cognome = in.nextLine();
            System.out.println("Dimmi matricola:");
            matricola = in.nextInt();
        } while (!studenteEsistente(verification(nome, cognome, matricola)));

        return verification(nome, cognome, matricola);
    }

    private Studente verification(String nome, String cognome, int matricola) {
        for (Studente k : studenti) {
            if (studenteInDatabaseDomanda(nome, cognome, matricola, k)) {
                return k;
            } else {
                return null;
            }
        }
        return null;
    }

    private boolean studenteEsistente(Studente studente) {
        return studenti.contains(studente);
    }

    private boolean studenteInDatabaseDomanda(String nome, String cognome, int matricola, Studente k) {
        return k.getNome().equals(nome) &&
                k.getCognome().equals(cognome) &&
                k.getMatricola() == matricola;
    }

    public void menuPrincipale() {

        System.out.println("""
                                
                                
                1) Aggiungere un esame alla propria carriera
                2) Visualizzare l’elenco dei propri esami
                3) Visualizzare la media dei propri voti
                4) Visualizzare il nome della materia in cui è stato conseguito il voto più alto
                5) Verificare se si può richiedere la tesi (l’accesso alla richiesta di tesi dipende dal conseguimento di almeno 150 cfu)
                6) Visualizzare l’elenco dei docenti a cui poter chiedere la tesi (il docente deve essere titolare di una materia in cui è stato ottenuto un voto superiore a 25)
                                
                0) Chiudere applicazione
                                
                """);
        switch (in.nextInt()) {
            default:
                System.out.println("Input non valido");
                break;
            case 0:
                setAcceso(false);
                break;
            case 1:
                user.getLibretto().add(aggiungiEsame());
                break;
            case 2:
                System.out.println(user.getLibretto());
                break;
            case 3:
                System.out.println("La media dei tuoi voti è:" + mediaPonderataVoti());
                break;
            case 4:
                System.out.println(votoPiùAlto());
                break;
            case 5:
                if (richiestaTesi()) {
                    System.out.println("Si");
                } else {
                    System.out.println("No");
                }
                break;
            case 6:
                System.out.println("I seguenti docenti sono idonei alla richiesta della tesi:");
                ArrayList<Studente> docentiIdonei = docenteIdoneo();
                if (docentiIdonei.isEmpty()) {
                    System.out.println("Non ci sono docenti idonei");
                } else {
                    System.out.println(docentiIdonei);
                }
                break;
        }
    }

    private Esame aggiungiEsame() {
        System.out.println("Dimmi nome insegnante:");
        String nomeInsegnante = in.nextLine();
        System.out.println("Dimmi cognome insegnante:");
        String cognomeInsegnante = in.nextLine();
        System.out.println("Dimmi matricola insegnante:");
        int matricolaInsegnante = in.nextInt();
        System.out.println("Dimmi materia:");
        String materia = in.nextLine();
        System.out.println("Dimmi crediti formativi:");
        int CFU = in.nextInt();
        System.out.println("Dimmi voto:");
        int voto = in.nextInt();
        return new Esame(materia, 30, 7, verification(nomeInsegnante, cognomeInsegnante, matricolaInsegnante));
    }

    private double mediaPonderataVoti() {
        int sommaProdotti = 0;
        int sommaPesi = 0;
        for (Esame k : user.getLibretto()) {
            sommaProdotti += (k.getVoto() * k.getCFU());
            sommaPesi += (k.getCFU());
        }
        return ((double)sommaProdotti / sommaPesi);
    }

    private String votoPiùAlto() {

        ArrayList<Esame> materie = new ArrayList<>();
        int max = 0;

        for (int k = 0; k < user.getLibretto().size(); k++) {
            if (user.getLibretto().get(k).getVoto() > max) {
                max = user.getLibretto().get(k).getVoto();
            }
        }

        for (int k = 0; k < user.getLibretto().size(); k++) {
            if (user.getLibretto().get(k).getVoto() == max) {
                materie.add(user.getLibretto().get(k));
            }
        }

        if (materie.size() >= 2) {
            String stringaDiMaterie = "";
            for (int k = 0; k < materie.size(); k++) {
                if (k < (materie.size() - 2)) {
                    stringaDiMaterie += materie.get(k).getMateria() + ", ";
                }
            }
            return "Le materie con il voto più alto sono: " + stringaDiMaterie + '.';

        } else if (materie.size() == 1) {
            return "La materia con il voto più alto è: " + materie.get(0).getMateria() + '.';
        } else {
            return "Il libretto è vuoto";
        }
    }

    private boolean richiestaTesi() {
        int sommaCFU = 0;
        for (Esame k : user.getLibretto()) {
            sommaCFU += k.getCFU();
        }
        return sommaCFU >= 150;
    }

    //TODO: Implementare metodo per visualizzare i docenti a cui si possono richiedere la tesi. return:boolean (docente ha voto più di 25?) (punto 6)
    private ArrayList<Studente> docenteIdoneo() {
        ArrayList<Studente> docentiIdonei = new ArrayList<>();
        for (Studente k : docenti) {
            for (Esame e : k.getLibretto()) {
                if (e.getVoto() > 25) {
                    docentiIdonei.add(k);
                }
            }
        }
        return docentiIdonei;
    }

}
