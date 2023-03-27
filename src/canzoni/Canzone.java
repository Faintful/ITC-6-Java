package canzoni;

public class Canzone {

    String titolo;
    String testo;
    String artista;

    int durata;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + "\nArtista: " + artista + "\nDurata: " + durata + "\n Testo: " + testo;
    }

    public Canzone(String titolo, String testo, String artista, int durata) {
        this.titolo = titolo;
        this.testo = testo;
        this.artista = artista;
        this.durata = durata;
    }

}
