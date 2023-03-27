package mostriControEroi;

import mostriControEroi.abilities.Abilità;

import java.util.ArrayList;

public abstract class Classe {

    ArrayList<Abilità> abilitàList;

    public Classe() {
        this.abilitàList = new ArrayList<>();
    }

    public abstract void lancia(Abilità abilità, Personaggio fonte, Personaggio bersaglio);

    public abstract double getMoltiplicatorePV();

    public abstract double getMoltiplicatorePM();

    public abstract double getMoltiplicatoreDanniMin();

    public abstract double getMoltiplicatoreDanniMax();

    //TODO: Abilità possibili per ogni classe
    public ArrayList<Abilità> getAbilità() {
        return abilitàList;
    }

    public abstract void turno(int scelta, Personaggio tu, Personaggio avversario);

    public abstract void prompt();

}
