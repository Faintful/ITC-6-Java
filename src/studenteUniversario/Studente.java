package studenteUniversario;

import java.util.ArrayList;

public class Studente {

    private final String nome;
    private final String cognome;
    private final int matricola;

    private final ArrayList<Esame> libretto;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCognome: " + getCognome() + "\nMatricola: " + getMatricola();
    }

    public ArrayList<Esame> getLibretto() {
        return libretto;
    }

    public Studente(String nome, String cognome, int matricola, Esame... esami) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.libretto = new ArrayList<Esame>();
        for (int k = 0; k < esami.length; k++) {
            libretto.add(esami[k]);
        }
    }

}
