package penna;

public class Schermo {

    Astuccio astuccio;

    public Schermo(Astuccio astuccio) {
        this.astuccio = astuccio;
    }

    public void inizio() {
        boolean falsoVero = true;
        while (falsoVero) {
            System.out.println("""

            1) Inserire una penna nell’astuccio
            2) Visualizzare tutte le penne nell’astuccio
            3) Visualizzare una serie di trattini generati da una penna scelta dall’utente
            4) Visualizzare quali penne hanno meno di quattro tacche di inchiostro
            5) Eliminare dall’astuccio le penne senza inchiostro
            6) Svuotare l’astuccio

            0) Uscire dal programma
            """);
            int scelta = astuccio.scanner.nextInt();
            switch (scelta) {
                default:
                    riga();
                    System.out.println("Input non valido");
                    riga();
                    break;
                case 0:
                    riga();
                    System.out.println("Chiusura astuccio");
                    falsoVero = false;
                    riga();
                    break;
                case 1:
                    riga();
                    astuccio.aggiungiPenna();
                    riga();
                    break;
                case 2:
                    riga();
                    System.out.println("Ecco tutte le penne che hai:");
                    System.out.println(astuccio);
                    riga();
                    break;
                case 3:
                    riga();
                    astuccio.scriviConPennaScelta(astuccio.scegliPenna(), astuccio.quantiTrattini());
                    riga();
                    break;
                case 4:
                    riga();
                    astuccio.visualizzaPenneQuasiVuote();
                    riga();
                    break;
                case 5:
                    riga();
                    astuccio.togliPenneVuote();
                    riga();
                    break;
                case 6:
                    riga();
                    astuccio.svuotaAstuccio();
                    riga();
                    break;
            }
        }
    }

    private void riga() {
        System.out.println("----------------------------------------------------------");
    }

}
