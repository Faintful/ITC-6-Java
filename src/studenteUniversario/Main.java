package studenteUniversario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //docenti
        ArrayList<Studente> docenti = new ArrayList<>();

        Studente d1 = new Studente("Bruno", "Scialpi", 82718, new Esame("Matematica", 20, 6));

        docenti.add(d1);

        //esami

        //studenti
        ArrayList<Studente> studenti = new ArrayList<>();

        Studente s1 = new Studente("Mario", "Rossi", 42069, new Esame("Matematica", 20, 6, d1));
        Studente s2 = new Studente("Alessia", "Dandolo", 42482);

        studenti.add(s1);
        studenti.add(s2);

        App app = new App(studenti, docenti);

        app.setUser(app.logIn());

        while (app.isAcceso()) {
            app.menuPrincipale();
        }

    }
}
