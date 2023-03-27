package struttureDati;

import java.util.ArrayList;

public class Colori {
	
	/*
	 * ArrayList
	 * 		è una classe del pacchetto java.util
	 * 
	 * 		permette di definire strutture dati
	 * 		>> COLLEZIONI di dati 
	 * 
	 * 		mette a disposizione metodi per gestire gli 
	 * 		elementi contenuti nell'array
	 * 
	 * 		Per poter accedere alle funzionalità devo prima
	 * 		creare l'oggetto 
	 * 
	 * 			Tipo<Tipo_Elem> nome = new Tipo<Tipo_Elem>()
	 * 
	 * 		ArrayList<String> colori = new ArrayList<>();
	 * 
	 * 			colori è un oggetto di tipo ArrayList in grado
	 * 			di contenere stringhe
	 * 
	 * 				ATTENZIONE
	 * 					ArrayList può contenere solo oggetti!
	 * 					in alcuni casi dovrò appoggiarmi alle classi
	 * 					wrapper
	 * 						se volessi dei numeri:
	 * 							ArrayList<Integer> numeri...
	 * 							ArrayList<Double> numeri...
	 * 							
	 * 		un ArrayList può nascere vuoto, non devo conoscere il numero
	 * 		di elementi >> struttura dinamica
	 * 		>>> posso aggiungere ed eliminare elementi in qualunque 
	 * 			momento
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> colori = new ArrayList<>();
		
		/*
		 * + add(Element) : void
		 * 		metodo che aggiunge in coda all'array l'elemento
		 * 		specificato come parametro 
		 */
		
		colori.add("Rosso");
		colori.add("Verde");
		colori.add("Blu");
		colori.add("Giallo");
		
		// visualizzare il contenuto dell'array
		System.out.println(colori);
		
		// visualizzare il numero di elementi contenuti nell'array
		// + size() : int 
		
		System.out.println(colori.size());
		
		colori.add("Lilla");
		colori.add("Giallo");		
		
		System.out.println(colori.size());
		
		
		/*
		 * + get(int) : Element
		 * 		metodo che restituisce l'elemento nella posizione
		 * 		indicata come parametro
		 */
		
		// visualizzare il primo colore inserito
		System.out.println(colori.get(0));
		
		// visualizzare l'ultimo colore inserito
		System.out.println(colori.get(colori.size() - 1));
		
		// visualizzo tutti 
		System.out.println(colori + "\n");
		
		// Visualizzare tutti gli elementi, uno per riga
		for(int i = 0; i < colori.size(); i++)
			System.out.println(colori.get(i));

		// cancellare l'elemento in posizione 1
		/* 
		 * + remove(int) : Element
		 * 		metodo che rimuove l'elemento della posizione richiesta
		 * 		col parametro. Restituisce l'elemento cancellato 
		 */
		
		colori.remove(1);
		
		System.out.println(colori);
		
		colori.add("Nero");
		colori.add("Bianco");
		
		System.out.println(colori);
		
		/*
		 * + remove(Element) : boolean
		 * 		metodo che rimuove la prima occorrenza dell'elemento
		 * 		segnalato come parametro. Restituisce true quando 
		 * 		l'operazione va a buon fine, false altrimenti
		 */
		
		colori.remove("Giallo");
		
		System.out.println(colori);
		
		/*
		 * + isEmpty() : boolean 
		 * 		metodo che restituisce true quando l'array è vuoto
		 * 		false altrimenti
		 * 		
		 */
		
		System.out.println(colori.isEmpty());	// false
		
		/*
		 * 	+ contains(Element) : boolean
		 * 		metodo che restituisce true quando l'array contiene
		 * 		il valore indicato come parametro, false altrimenti
		 * 
		 */
		
		System.out.println(colori.contains("Lilla"));

		System.out.println(colori.contains("Rosa"));
		
		if(colori.contains("verde"))
			System.out.println("Il verde ci sta!!");
		else
			System.out.println("Il verde non ci sta!!");
		
		/*
		 * Cercare il verde e se c'è dire quale posizione 
		 * occupa
		 * 
		 * + indexOf(Element) : int
		 * 		metodo che cerca l'elemento segnalato come parametro
		 * 		e restituisce la posizione occupata dall'elemento 
		 * 		quando trovato, -1 in caso non esista
		 * 
		 */
		
		System.out.println(colori);
		
		// Posizione del Verde
		System.out.println(colori.indexOf("Verde"));
		
		// Posizione del Bianco
		
		int posizione = colori.indexOf("Bianco");
		
		if(posizione == -1)
			System.out.println("Il colore non ci sta");
		else
			System.out.println("Il colore sta in posizione " + posizione);
		

		/*
		 * + clear() : void
		 * 		metodo che svuota l'array 
		 */
		colori.clear();
		System.out.println(colori);


		
		
	}

}
