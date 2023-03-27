package ereditarietà.atleti;

public class Professionista extends Atleta {

    int tesseraIscrizione;

    public Professionista(String nome, String specialità, int tesseraIscrizione) {
        super(nome, specialità);
        this.tesseraIscrizione = tesseraIscrizione;
    }

    @Override
    public String toString() {
        return "Professionista | Nome: " + nome +" | Specialità: " + specialità + " | Tessera Iscrizione: " + tesseraIscrizione;
    }
}
