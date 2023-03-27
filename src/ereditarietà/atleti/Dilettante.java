package ereditarietà.atleti;

public class Dilettante extends Atleta{

    int gareVinte;

    public Dilettante(String nome, String specialità, int gareVinte) {
        super(nome, specialità);
        this.gareVinte = gareVinte;
    }

    public void setGareVinte(int gareVinte) {
        this.gareVinte = gareVinte;
    }

    @Override
    public String toString() {
        return "Dilettante | Nome: " + nome +" | Specialità: " + specialità + " | Gare Vinte: " + gareVinte;
    }
}
