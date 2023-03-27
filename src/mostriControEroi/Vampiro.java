package mostriControEroi;

import mostriControEroi.abilities.Abilità;
import mostriControEroi.abilities.Attacca;
import mostriControEroi.abilities.special.Bevi;

import java.util.ArrayList;

public class Vampiro extends Classe {

    public Vampiro() {
        super();
        this.abilitàList.add(new Attacca());
        this.abilitàList.add(new Bevi());
    }

    @Override
    public void lancia(Abilità abilità, Personaggio fonte, Personaggio bersaglio) {
        abilità.esegui(fonte, bersaglio);
    }

    @Override
    public double getMoltiplicatorePV() {
        return 0.75;
    }

    @Override
    public double getMoltiplicatorePM() {
        return 0.75;
    }

    @Override
    public String toString() {
        return "Vampiro";
    }

    @Override
    public double getMoltiplicatoreDanniMin() {
        return 0.5;
    }

    @Override
    public double getMoltiplicatoreDanniMax() {
        return 0.5;
    }

    @Override
    public void prompt() {
        System.out.println("ciao");
//        System.out.println("""
//                Cosa vuoi fare?
//
//                1) Attacco semplice
//                2) Bevi sangue
//
//                """);
    }

    @Override
    public void turno(int scelta, Personaggio tu, Personaggio avversario) {
        switch (scelta) {
            case 1 -> tu.agisci(tu.getClassePersonaggio().getAbilità().get(0), tu, avversario);
            case 2 -> tu.agisci(tu.getClassePersonaggio().getAbilità().get(1), tu, avversario);
        }
    }

}
