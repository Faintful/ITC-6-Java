package fondamenti;

public class PositivoNegativo {
   /* Scrivere un programma che dato un valore intero visualizza
    un messaggio che indica se è un valore positivo o negativo

    INIZIO

    a = 9

    SE(a==0)
        SCRIVI "Valore nullo"
    SE(a > 0)
        SCRIVI "Positivo"
    ALTRIMENTI
        SCRIVI "Negativo"
    */
   public static void positivoNegativo(int a) {
       if (a == 0) {
           System.out.println("Valore nullo");
       } else if (a > 0) {
           System.out.println("Positivo");
       } else {
           System.out.println("Negativo");
       }
   }
   public static void main(String[] args) {
       positivoNegativo(0);
   }
}
