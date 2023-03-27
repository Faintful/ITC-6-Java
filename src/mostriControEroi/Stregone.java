package mostriControEroi;

import mostriControEroi.abilities.Abilità;
import mostriControEroi.abilities.Attacca;
import mostriControEroi.abilities.special.Bevi;
import mostriControEroi.abilities.special.Incantesimo;

public class Stregone extends Classe {

    public Stregone() {
        super();
        this.abilitàList.add(new Attacca());
        this.abilitàList.add(new Incantesimo());
    }

    @Override
    public void lancia(Abilità abilità, Personaggio fonte, Personaggio bersaglio) {
        abilità.esegui(fonte, bersaglio);
    }

    @Override
    public double getMoltiplicatorePV() {
        return 1.0;
    }

    @Override
    public double getMoltiplicatorePM() {
        return 1.5;
    }

    @Override
    public String toString() {
        return "Stregone";
    }

    @Override
    public double getMoltiplicatoreDanniMin() {
        return 1;
    }

    @Override
    public double getMoltiplicatoreDanniMax() {
        return 1;
    }

    @Override
    public void prompt() {
        System.out.println("ciao");
//        System.out.println("""
//                Cosa vuoi fare?
//
//                1) Attacco semplice
//                2) Lancia magia
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
