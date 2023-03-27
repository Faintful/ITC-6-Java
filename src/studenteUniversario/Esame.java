package studenteUniversario;

public class Esame {

    int voto;
    int CFU;
    String materia;
    Studente insegnante;

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getCFU() {
        return CFU;
    }

    public void setCFU(int CFU) {
        this.CFU = CFU;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Studente getInsegnante() {
        return insegnante;
    }

    public void setInsegnante(Studente insegnante) {
        this.insegnante = insegnante;
    }

    public Esame(String materia, int voto, int CFU, Studente insegnante) {
        this.materia = materia;
        this.voto = voto;
        this.CFU = CFU;
        this.insegnante = insegnante;
    }

    public Esame(String materia, int voto, int CFU) {
        this.materia = materia;
        this.voto = voto;
        this.CFU = CFU;
    }

    //TODOImplementare metodo toString() per il punto 2

    @Override
    public String toString() {
        return ("ESAME \n\n| Insegnante | \n" + insegnante + "\n\n| Materia | \n" + materia + "\n\n| Crediti Formativi | \n" + CFU + "\n\n| Voto | \n" + voto);
    }

    //TOD Metodo che verifichi che il CFU sia compreso tra 0 e 30 (return:bool)
    private boolean validoCFU() {
        return CFU >= 0 && CFU <= 30;
    }

    //TOD Metodo che verifichi che una materia si consideri superata se il CFU è compreso tra 18 e 30
    private boolean sufficienteCFU() {
        return CFU >= 18;
    }

}
