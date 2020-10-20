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
		// Java 7:
		// Collections.sort(boeken, new BoekComparator());
		
		// Java 8:
		//boeken.sort((boek1, boek2) -> {
		// 	int boekCompare = boek1.getTitel().compareTo(boek2.getTitel());
		//	if (boekCompare != 0) {
		//		return boekCompare;
		//	}
		//	
		//	return Long.compare(boek2.getIsbn_nr(), boek1.getIsbn_nr());
		//	
		//});
		
		// !!WERKT NIET!! Betere oplossing in Java 8:
//		boeken.sort(
//				Comparator.comparing(Boek::getTitel)
//						  .thenComparing(Comparator.comparing(Boek::getIsbn_nr.reversed()));

		boeken.sort(Comparator.comparing(Boek::getTitel).thenComparing(Comparator.comparing(Boek::getIsbn_nr).reversed()));
		
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
		// System.out.printf("max = %d (oplossing = 3)%n", Collections.max(Arrays.asList(getallen)));
		
		// java 8: beiden geven hetzelfde resultaat in dit geval is stream langer.
		System.out.printf("max = %d (oplossing = 3)%n", Arrays.stream(getallen).max(Integer::compare).get());
		
		
		// Toon het kleinste element van de array getallen
		// -----------------------------------------------
		// java7
		// System.out.printf("max = %d (oplossing = 3)%n", Arrays.stream(getallen).min(Integer::compare).get());

		// Java 8: geeft zelfde resultaat als 7
		System.out.printf("max = %d (oplossing = 3)%n", Arrays.stream(getallen).min(Integer::compare).get());

	}

	public <E> void toonLijst(Collection<E> collection) {
		// java7
		//for (E element : collection) {
		//	System.out.printf("%s%n", element);
		//}

		//System.out.println("\n");
		
		// Java 8
		collection.forEach(element -> System.out.printf("%s%n", element));
	}

	public static void main(String args[]) {
		new OefAlgoritme();
	}

}// einde klasse OefAlgoritme_Opgave
