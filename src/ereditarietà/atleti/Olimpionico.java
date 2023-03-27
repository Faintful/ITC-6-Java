package ereditarietà.atleti;

import ereditarietà.atleti.medaglie.Argento;
import ereditarietà.atleti.medaglie.Bronzo;
import ereditarietà.atleti.medaglie.Medaglia;
import ereditarietà.atleti.medaglie.Oro;

import java.util.ArrayList;

public class Olimpionico extends Professionista {

    String nazionalità;

    ArrayList<Medaglia> medaglie;
    private final int punti;

    public int getPunti() {
        return punti;
    }

    public Olimpionico(String nome, String specialità, int tesseraIscrizione, String nazionalità, ArrayList<Medaglia> medaglie) {
        super(nome, specialità, tesseraIscrizione);
        this.nazionalità = nazionalità;
        this.medaglie = medaglie;
        this.punti = sommaPunti();
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    @Override
    public String toString() {
        return "Olimpionico | Nome: " + nome +" | Specialità: " + specialità + " | Tessera Iscrizione: " + tesseraIscrizione + " | Nazionalità: " + nazionalità
                + " | Medaglie Bronzo: " + getBronzo().size()
                + " | Medaglie Argento: " + getArgento().size()
                + " | Medaglie Oro: " + getOro().size();
    }

    public ArrayList<Medaglia> getMedaglie() {
        return medaglie;
    }

    public void setMedaglie(ArrayList<Medaglia> medaglie) {
        this.medaglie = medaglie;
    }

    public ArrayList<Medaglia> getBronzo() {
        ArrayList<Medaglia> bronzo = new ArrayList<>();
        for (Medaglia k : medaglie) {
            if (k instanceof Bronzo) {
                bronzo.add(k);
            }
        }
        return bronzo;
    }

    public ArrayList<Medaglia> getArgento() {
        ArrayList<Medaglia> argento = new ArrayList<>();
        for (Medaglia k : medaglie) {
            if (k instanceof Argento) {
                argento.add(k);
            }
        }
        return argento;
    }

    public ArrayList<Medaglia> getOro() {
        ArrayList<Medaglia> oro = new ArrayList<>();
        for (Medaglia k : medaglie) {
            if (k instanceof Oro) {
                oro.add(k);
            }
        }
        return oro;
    }

    private int sommaPunti() {
        int punti = 0;
        for (Medaglia k : medaglie) {
            punti += k.getPunti();
        }
        return punti;
    }

}
