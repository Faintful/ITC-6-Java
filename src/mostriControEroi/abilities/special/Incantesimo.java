package mostriControEroi.abilities.special;

import mostriControEroi.Personaggio;

public class Incantesimo extends Special {

    @Override
    public double getDanni() {
        return 3;
    }

    @Override
    public int getCostoMana() {
        return 50;
    }

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        System.out.println(fonte.getNome() + " lancia un incantesimo a " + bersaglio.getNome() + "!");
        super.esegui(fonte, bersaglio);
    }

}
