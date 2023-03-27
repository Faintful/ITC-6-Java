package ereditarietà.atleti;

public class Atleta {

    String nome;
    String specialità;

    @Override
    public String toString() {
        return "Atleta | Nome: " + nome +" | Specialità: " + specialità;
    }

    public Atleta(String nome, String specialità) {
        this.nome = nome;
        this.specialità = specialità;
    }

}
