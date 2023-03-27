package mostriControEroi;

import mostriControEroi.abilities.Abilità;
import mostriControEroi.abilities.Attacca;
import mostriControEroi.abilities.Fuggi;
import mostriControEroi.abilities.special.Incantesimo;

public class Mago extends Classe {

    public Mago() {
        super();
        this.abilitàList.add(new Attacca());
        this.abilitàList.add(new Incantesimo());
        this.abilitàList.add(new Fuggi());
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
        return "Mago";
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
        System.out.println("""
                Cosa vuoi fare?
                
                1) Attacco semplice
                2) Lancia incantesimo
                
                0) Fuggi
                """);
    }

    @Override
    public void turno(int scelta, Personaggio tu, Personaggio avversario) {
        switch (scelta) {
            default -> System.out.println("Input non valido");
            case 1 -> tu.agisci(tu.getClassePersonaggio().getAbilità().get(0), tu, avversario);
            case 2 -> tu.agisci(tu.getClassePersonaggio().getAbilità().get(1), tu, avversario);
            case 0 -> tu.agisci(tu.getClassePersonaggio().getAbilità().get(2), tu, avversario);
        }
    }

}
