package mostriControEroi.abilities;

import mostriControEroi.Personaggio;

public class Equipaggia implements Abilità {

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        System.out.println(fonte.getNome() + " il/la " + fonte.getClassePersonaggio() + "/a sta equippaggiando un arma...");
    }

}
