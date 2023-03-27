package mostriControEroi.abilities;

import mostriControEroi.Personaggio;

public class Fuggi implements Abilità {

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        System.out.println(fonte.getNome() + " il/la " + fonte.getClassePersonaggio() + "/a sta tentando la fugga!");
        if (fonte.roll(1, 100) > 70) {
            System.out.println("Fugga riuscita! Sei salvo/a... Per ora");
            System.exit(0);
        } else {
            fonte.subisciDanni(bersaglio.colpisci());;
            System.out.println("Oops! Fugga non riuscita. " + bersaglio.getNome() + " colpisce " + fonte.getNome() + " per " + bersaglio.getUltimoColpo() + "!");
        }
    }

}
