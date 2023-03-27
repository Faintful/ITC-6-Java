package mostriControEroi.abilities.special;

import mostriControEroi.Personaggio;

public class Bevi extends Special {

    @Override
    public double getDanni() {
        return 1.5;
    }

    @Override
    public int getCostoMana() {
        return 40;
    }

    @Override
    public void esegui(Personaggio fonte, Personaggio bersaglio) {
        System.out.println(fonte.getNome() + " beve il sangue di " + bersaglio.getNome() + "!" );
        super.esegui(fonte, bersaglio);
        fonte.setPuntiVita((int) (fonte.getPuntiVita() + (fonte.getUltimoColpo() * 0.20)));
        System.out.println(fonte.getNome() + " si rigenera per " + ((int)(fonte.getUltimoColpo() * 0.20)) + "!");
    }

}
