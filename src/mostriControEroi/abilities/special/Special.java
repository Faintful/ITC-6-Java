package mostriControEroi.abilities.special;

import mostriControEroi.Personaggio;
import mostriControEroi.abilities.Attacca;

public abstract class Special extends Attacca {

    @Override
    public int getDanni() {
        return 20;
    }

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        //Un attacco speciale non è altro che un attacco semplice...
        super.esegui(fonte, bersaglio);
        //...Che infligge più danni...
        //TODO: Far che l'attacco speciale infligga più danni rispetto all'attacco semplice
        //...E che consuma del mana.
        fonte.consumaMana(20);
        System.out.println(fonte.getNome() + " perde " + 20 + " punti di mana!");
    }

}
