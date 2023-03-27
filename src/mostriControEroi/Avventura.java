package mostriControEroi;

import java.util.Scanner;

public class Avventura {

    Scanner in = new Scanner(System.in);

    public void combattimento(Personaggio eroe, Personaggio mostro) {
        while (eroe.isAlive() && mostro.isAlive()) {
            eroe.getClassePersonaggio().prompt();
            eroe.turno(scegli(), eroe, mostro);
            System.out.println(eroe.getNome() + " ha " + eroe.getPuntiVita() + " punti vita e " + eroe.getPuntiMana() + " punti mana");
            System.out.println(mostro.getNome() + " ha " + mostro.getPuntiVita() + " punti vita e " + mostro.getPuntiMana() + " punti mana");
            mostro.turno(Dado.roll(1, 2), mostro, eroe);
            System.out.println(eroe.getNome() + " ha " + eroe.getPuntiVita() + " punti vita e " + eroe.getPuntiMana() + " punti mana");
            System.out.println(mostro.getNome() + " ha " + mostro.getPuntiVita() + " punti vita e " + mostro.getPuntiMana() + " punti mana");
        }
    }

//    public void turno(int scelta, Personaggio tu, Personaggio avversario) {
//        switch (scelta) {
//            default -> System.out.println("Input non valido");
//            case 1 -> tu.agisci(tu.getClassePersonaggio().getAbilità().get(0), tu, avversario);
//            case 2 -> tu.agisci(tu.getClassePersonaggio().getAbilità().get(1), tu, avversario);
//            case 0 -> tu.agisci(new Fuggi(), tu, avversario);
//        }
//    }

    //Metodo che mi serve per dare l'opzione all'utente di scegliere cosa fare sul proprio turno
    public int scegli() {
        System.out.println("Scegli un opzione:");
        return in.nextInt();
    }

    public static void main(String[] args) {

        Personaggio p1 = new Personaggio("Van Helsing", new Mago(), 100, 100, 8, 10);
        Personaggio p2 = new Personaggio("Dracula", new Vampiro(), 120, 100, 8, 10);

        Avventura avventura = new Avventura();

        avventura.combattimento(p1, p2);

    }

}
