package mostriControEroi;

import mostriControEroi.abilities.Abilità;

import java.util.ArrayList;

public class Personaggio {

    private String nome;

    public String getNome() {
        return nome;
    }

    public int getPuntiMana() {
        return puntiMana;
    }

    public ArrayList<Integer> getCombatLog() {
        return combatLog;
    }

    public Classe getClassePersonaggio() {
        return classePersonaggio;
    }

    public Personaggio(String nome, Classe classePersonaggio, int puntiVita, int puntiMana, int minDanni, int maxDanni) {
        this.nome = nome;
        this.classePersonaggio = classePersonaggio;
        this.puntiVita = (int) (puntiVita * classePersonaggio.getMoltiplicatorePV());
        this.puntiMana = (int) (puntiMana * classePersonaggio.getMoltiplicatorePM());
        this.minDanni = (int) (minDanni * classePersonaggio.getMoltiplicatoreDanniMin());
        this.maxDanni = (int) (maxDanni * classePersonaggio.getMoltiplicatoreDanniMax());
        combatLog = new ArrayList<>();
    }

    private int puntiVita;

    private int puntiMana;

    private int minDanni;

    private int maxDanni;

    private ArrayList<Integer> combatLog;

    Classe classePersonaggio;

    public Personaggio(Classe classePersonaggio) {
        this.classePersonaggio = classePersonaggio;
    }

    public void agisci(Abilità abilità, Personaggio fonte, Personaggio bersaglio) {
        this.classePersonaggio.lancia(abilità, fonte, bersaglio);
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiMana(int puntiMana) {
        this.puntiMana = puntiMana;
    }

    public int getUltimoColpo() {
        return combatLog.get(combatLog.size()-1);
    }

    public void consumaMana(int puntiMana) {
        setPuntiMana(getPuntiMana() - puntiMana);
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    private int registraDanni(int danni) {
        combatLog.add(danni);
        return danni;
    }

    public int colpisci() {
        return registraDanni(Dado.roll(minDanni, maxDanni));
    }

    public boolean isAlive() {
        return this.puntiVita > 0;
    }

    public boolean haMana() {
        return this.puntiMana > 0;
    }

    public void subisciDanni(int danni) {
        setPuntiVita(this.getPuntiVita() - danni);
    }

    public void turno(int scelta, Personaggio tu, Personaggio avversario) {
//        this.getClassePersonaggio().prompt();
        this.getClassePersonaggio().turno(scelta, tu, avversario);
    }

}
