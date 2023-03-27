package penna;

public class Penna {

    public String colore;
    private String marca;
    protected int inchiostro;

    public Penna(String colore, String marca, int inchiostro) {
        this.colore = colore;
        this.marca = marca;
        this.inchiostro = inchiostro;
    }

    public Penna() {

    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setInchiostro(int inchiostro) {
        this.inchiostro = inchiostro;
    }


    public String getColore() {
        return colore;
    }

    public String getMarca() {
        return marca;
    }

    public int getInchiostro() {
        return inchiostro;
    }

    @Override
    public String toString() {
        return getColore() + " || " + getMarca() + " || " + getInchiostro() + "\n";
    }

    public void scrivi(int trattini) {
            String riga = "";
            for (int k = 0; k < trattini; k++) {
                if (inchiostro > 0) {
                    riga += "-";
                    inchiostro--;
                } else {
                    break;
            }
        }
        System.out.println(riga);
        if (inchiostro == 0) {
            System.out.println("Hai finito l'inchiostro di questa penna");
        }
    }
}
