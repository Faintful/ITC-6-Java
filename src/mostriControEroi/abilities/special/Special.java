package mostriControEroi.abilities.special;

import mostriControEroi.Personaggio;
import mostriControEroi.abilities.Attacca;

public abstract class Special extends Attacca {

//    Un attacco speciale non è altro che un attacco semplice che infligge più danni...
    @Override
    public double getDanni() {
        return 2;
    }

    public int getCostoMana() {
        return 20;
    }

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        //Un attacco speciale non è altro che un attacco semplice...
        super.esegui(fonte, bersaglio);
        //...E che consuma del mana.
        fonte.consumaMana(getCostoMana());
        System.out.println(fonte.getNome() + " perde " + getCostoMana() + " punti di mana!");
    }

}
