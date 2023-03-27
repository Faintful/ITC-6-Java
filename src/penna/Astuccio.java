package penna;

import java.util.ArrayList;
import java.util.Scanner;

public class Astuccio {

    ArrayList<Penna> contenuti = new ArrayList<>();

    Scanner scanner;

    public Astuccio(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        String string = "\n";
        for (Penna k: contenuti) {
            string += k;
        }
        return string;
    }

    public void aggiungiPenna() {
        contenuti.add(new Penna());
            System.out.println("Dimmi il colore della penna");
            scanner.nextLine(); //Metto questo altrimenti esplode
            contenuti.get(contenuti.size()-1).setColore(scanner.nextLine());
            System.out.println("Dimmi la marca della penna");
            contenuti.get(contenuti.size()-1).setMarca(scanner.nextLine());
            System.out.println("Dimmi il livello di inchiostro della penna");
            contenuti.get(contenuti.size()-1).setInchiostro(scanner.nextInt());
    }

    public void visualizzaPenneQuasiVuote() {
        for (Penna k : contenuti) {
            if (k.getInchiostro() < 4) {
                System.out.println("Penna all'indice " + contenuti.indexOf(k) + " ha meno di 4 tacche.");
            } else {
                System.out.println("Non hai penne quasi vuote.");
            }
        }
    }

    public void togliPenneVuote() {
        for (int k = 0; k < contenuti.size(); k++) {
            if (contenuti.get(k).getInchiostro() == 0) {
                contenuti.remove(k);
                k--;
            }
        }
    }

    public void svuotaAstuccio() {
        contenuti.clear();
    }

    public Penna scegliPenna() {
        System.out.println("Quale penna vuoi usare?");
        for (int k = 0; k < contenuti.size(); k++) {
            String stringa = "\n";
            stringa += (k+1) + ")" + " " + contenuti.get(k);
            System.out.print(stringa);
        }
        int scelta;
        scelta = scanner.nextInt() - 1;
        return contenuti.get(scelta);
    }

    public int quantiTrattini() {
        System.out.println("Quanti trattini vuoi scrivere?");
        return scanner.nextInt();
    }

    public void scriviConPennaScelta(Penna p, int trattini) {
        p.scrivi(trattini);
    }

}
