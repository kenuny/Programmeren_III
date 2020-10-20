package ui;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class KleineOefeningenList_Opgave {

	private static final String COLORS[] = { "red", "white", "blue" };

	private List<String> list;
	private List<String> list2;

	public KleineOefeningenList_Opgave() {

		/*
		 * Vul list op met de elementen van de array COLORS. Toon vervolgens het
		 * resultaat.
		 */
		list = new ArrayList<>(Arrays.asList(COLORS));
		weergevenLijst("Vult de list met de elementen van de array: ", list);

		/*
		 * Opvullen van de arrayList met de elementen van list d.m.v. addAll.
		 */

		list2 = new ArrayList<>();
		list2.addAll(list);

		/*
		 * Elementen van de lijst list omzetten naar hoofdletter. Elementen van de lijst
		 * list omzetten naar kleine letter.
		 */

		naarHoofdletterOmzetten(list);
		weergevenLijst("Plaatst alle elementen in hoofdletter: ", list);

		list = naarKleineLettersOmzetten(list);
		weergevenLijst("Plaatst alle elementen in kleine letter: ", list);

	}

	public <E> void weergevenLijst(String oplossing, List<E> list) {

		System.out.printf("%s%n[", oplossing);
		list.forEach(el -> System.out.printf("%s ", el));
		System.out.println("]\n");

	}

	public void naarHoofdletterOmzetten(List<String> list) {

		// Manier 1: ListIterator
		// Manier 2: Lambda
		// Manier 3: Reference method
		// list.replaceAll(String::toUpperCase);

		list.replaceAll(e -> e.toUpperCase());

	}

	public List<String> naarKleineLettersOmzetten(List<String> list) {

		list.replaceAll(w -> w.toLowerCase());
		return list;
		
	}

	public static void main(String args[]) {
		new KleineOefeningenList_Opgave();
	}

}