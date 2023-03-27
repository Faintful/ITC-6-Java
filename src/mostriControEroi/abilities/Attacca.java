package mostriControEroi.abilities;

import mostriControEroi.Personaggio;

public class Attacca implements Abilità {

    public int getDanni() {
        return 5;
    }

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        bersaglio.subisciDanni(fonte.colpisci());
        System.out.println(fonte.getNome() + " il/la " + fonte.getClassePersonaggio() + "/a colpisce " + bersaglio.getNome() +
                " il/la " + bersaglio.getClassePersonaggio() + "/a per " + fonte.getUltimoColpo() + "!");
    }

}
