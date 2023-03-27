package mostriControEroi.abilities.special;

import mostriControEroi.Personaggio;

public class Incantesimo extends Special {

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        System.out.println(fonte.getNome() + " il/la " + fonte.getClassePersonaggio() + "/a lancia un incantesimo a " + bersaglio.getNome() + "!");
        super.esegui(fonte, bersaglio);
    }

}
