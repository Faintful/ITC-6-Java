package mostriControEroi.abilities;

import mostriControEroi.Personaggio;

public class Attacca implements Abilità {

    public double getDanni() {
        return 1;
    }

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        bersaglio.subisciDanni((int) (fonte.colpisci() * getDanni()));
        System.out.println(fonte.getNome() + " infligge " + fonte.getUltimoColpo() + " danni a " +bersaglio.getNome() + "!");
    }

}
