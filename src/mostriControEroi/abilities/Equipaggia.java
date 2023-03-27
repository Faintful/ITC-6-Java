package mostriControEroi.abilities;

import mostriControEroi.Personaggio;

public class Equipaggia implements Abilità {

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        System.out.println(fonte.getNome() + " sta equipaggiando un arma...");
    }

}
