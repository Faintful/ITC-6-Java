package struttureDati;

import java.util.ArrayList;
import java.util.Scanner;

public class ColoriMetodi {

	/*
	 * Scrivere un programma che permette di manipolare una lista
	 * di stringhe - nomi di colori.
	 * 
	 * Il programma permette all'utente di scegliere una o più opzioni,
	 * quante volte vuole e nell'ordine che preferisce:
	 * 
	 * 1) per inserire un nuovo colore
	 * 2) visualizzare tutti i colori 
	 * 3) cancellare un colore preesistente
	 * 4) modificare un colore preesistente
	 * 5) visualizzare un messaggio che indica se la lista contiene 
	 * 	  un colore scelto dall'utente
	 * 6) visualizzare un messaggio che indica il numero di caratteri
	 * 	  di un colore scelto dall'utente se presente in lista, un 
	 * 	  messaggio che indica l'assenza del colore altrimenti 
	 */

	
	// DICHIARO VARIABILI DI CLASSE accessibili da tutto il file

	private static Scanner in;
	private static ArrayList<String> colori;
	
	// ----------------------------------------------------------
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		colori = new ArrayList<>();
		
		riga();
		System.out.println("\tCOLORI METODI");
		riga();
		
		// ----------------------------------------------------
		
		int scelta = 0;
		
		do {
			
			System.out.println("Scegli un'opzione:");
			System.out.print("1) per inserire un nuovo colore\n"
					+ "2) visualizzare tutti i colori \n"
					+ "3) cancellare un colore preesistente\n"
					+ "4) modificare un colore preesistente\n"
					+ "5) visualizzare un messaggio che indica se la lista contiene un colore scelto dall'utente\n"
					+ "6) visualizzare un messaggio che indica il numero di caratteri di un colore scelto dall'utente se presente in lista, un messaggio che indica l'assenza del colore altrimenti "
					+ "0) uscire dal programma\n> ");
			
			
			scelta = leggiIntero();
			
			riga();
			
			switch(scelta) {
			
				case 1: inserisciColore(); break;
				case 2: visualizzaColori(); break;
				case 3: cancellaColore(); break;
				case 4: modificaColore(); break;
				case 5: coloreEsistente(); break;
				case 6: numeroCaratteriColore(); break;
				
				case 0: System.out.println("Arrivedorci!"); break;
				
				default: System.out.println("Scelta errata");
			
			}
			
			riga();
			
		}while(scelta != 0);

		// ---------------------------------------------------- 
		
		in.close();
		
	}

	/**
	 * Metodo che recupera il valore digitato, chiude correttamente
	 * la lettura del numerico
	 * @return il valore letto
	 */
	private static int leggiIntero() {
		int scelta;
		scelta = in.nextInt();
		in.nextLine();
		return scelta;
	}

	/**
	 * Metodo che chiede all'utente di inserire il nome di un
	 * colore e lo salva all'interno della lista
	 */
	private static void inserisciColore() {

		System.out.print("Dimmi colore\n> ");
		String colore = in.nextLine();
		
		colori.add(colore);
		
	}

	/**
	 * Metodo che visualizza tutti gli elementi della listMetodo che.a,
	 * uno per riga indicando la posizione occupata dall'elemento
	 * 
	 * 0) Nero
	 * 1) Giallo
	 */
	private static void visualizzaColori() {

		if(colori.isEmpty())
			System.out.println("Lista vuota");
		else
			for(int i = 0; i < colori.size(); i++)
				System.out.println(i + ") " + colori.get(i));
		
		/*
		 * Per ogni elemento della lista 
		 * 		scrivi
		 * 
		 * Per ogni String all'intero di colori 
		 * 		scrivi
		 * 
		 * PER(String c : colori)
		 * 		SCRIVI c
		 */
		
//		int i = 0;
//		
//		for(String c : colori)
//			System.out.println(i++ + ") " + c);
		
		
	}

	/**
	 * .. 
	 */
	private static void cancellaColore() {

		if(colori.isEmpty())
			System.out.println("Lista vuota");
		else {
			
//			System.out.print("Dimmi colore da cancellare\n> ");
//			String c = in.nextLine();
//			
//			colori.remove(c);
			
			visualizzaColori();
			
			System.out.print("Dimmi posizione colore da cancellare\n> ");
			int pos = leggiIntero();
			
			colori.remove(pos);
			
			visualizzaColori();
			
		}
		
	}

	private static void modificaColore() {
		// TODO Auto-generated method stub
		
	}

	private static void coloreEsistente() {
		if (colori.contains(in.nextLine())) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
	}

	private static void numeroCaratteriColore() {
		String c = in.nextLine();
		if (colori.contains(c)) {
			System.out.println("La lunghezza della stringa è " + c.length());
		} else {
			System.out.println("Colore non presente");
		}
	}

	/**
	 * Metodo che visualizza una serie di trattini a video
	 */
	private static void riga() {
		
		System.out.println("----------------------------------------");
		
	}

	
}
