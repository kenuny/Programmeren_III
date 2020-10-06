package ui;

import java.util.*;

class Boek {
	private String titel;
	private long isbn_nr;

	public Boek(String titel, long isbn_nr) {
		this.titel = titel;
		this.isbn_nr = isbn_nr;
	}

	public String getTitel() {
		return titel;
	}

	public long getIsbn_nr() {
		return isbn_nr;
	}

	@Override
	public String toString() {
		return String.format("%s %d", titel, isbn_nr);
	}
}

public class OefAlgoritme {

	public OefAlgoritme() {
		List<Boek> boeken = new ArrayList<>();
		boeken.add(new Boek("How To Program", 1130927384L));
		boeken.add(new Boek("How To Program", 9830927384L));
		boeken.add(new Boek("JAVA", 1140927384L));
		boeken.add(new Boek("C++", 2200000000L));
		boeken.add(new Boek("C++", 8800000000L));

		// Sorteer de arrayList op titel in STIJGENDE volgorde. Bij gelijke titels
		// sorteren op isbn_nr in DALENDE volgorde.
		// ---------------------------------------------------------------

		System.out.println("gesorteerd : ");
		toonLijst(boeken);

		// Zet de arrayList om in omgekeerde volgorde (= 1 instructie)
		// ---------------------------------------------------------
		// java7

		System.out.println("omgekeerde volgorde : ");
		toonLijst(boeken);

		Integer getallen[] = { 6, 5, 9, 3 };
		// Toon het grootste element van de array getallen
		// -----------------------------------------------
		// java7

		// Toon het kleinste element van de array getallen
		// -----------------------------------------------
		// java7

	}

	public <E> void toonLijst(Collection<E> collection) {
		// java7
		for (E element : collection) {
			System.out.printf("%s%n", element);
		}

		System.out.println("\n");
	}

	public static void main(String args[]) {
		new OefAlgoritme();
	}

}// einde klasse OefAlgoritme_Opgave
