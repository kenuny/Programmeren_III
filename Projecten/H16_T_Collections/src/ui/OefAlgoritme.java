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

		/*
		 * Sorteert de arrayList op titel in STIJGENDE volgorde. Bij gelijke titels
		 * sorteren op isbn_nr in DALENDE volgorde.
		 */
		boeken.sort(
				Comparator.comparing(Boek::getTitel).thenComparing(Comparator.comparing(Boek::getIsbn_nr).reversed()));

		System.out.println("Gesorteerd: ");
		toonLijst(boeken);
		System.out.println();

		/*
		 * Toont de geordende lijst boeken in omgekeerde volgorde.
		 */
		System.out.println("Omgekeerde volgorde : ");
		Collections.reverse(boeken);
		toonLijst(boeken);
		System.out.println();

		/*
		 * Toont het grootste element van de array getallen. Toont het kleinste element
		 * van de array getallen.
		 */
		Integer getallen[] = { 6, 5, 9, 3 };
		System.out.printf("De minimum waarde is %d.%n", Collections.min(Arrays.asList(getallen)));
		System.out.printf("De maximum waarde is %d.%n", Collections.max(Arrays.asList(getallen)));

		// Java 8:
		System.out.println("De minimum waarde met Java 8:  " + Arrays.stream(getallen).min(Integer::compare).get());
		System.out.println("De maximum waarde met Java 8:  " + Arrays.stream(getallen).max(Integer::compare).get());

	}

	public <E> void toonLijst(Collection<E> collection) {
		// Toont elk element van de meegegeven collection.
		collection.forEach(e -> System.out.printf("%s%n", e));
	}

	public static void main(String args[]) {
		new OefAlgoritme();
	}

}
