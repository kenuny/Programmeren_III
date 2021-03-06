package ui;

import java.util.*;

public class OefFruit1_opgave {

	public static void main(String args[]) {
		String[] x_array = { "appel", "peer", "citroen", "kiwi" };
		String[] y_array = { "banaan", "mango", "citroen", "kiwi", "zespri" };

		// Maak van de arrays x_array en y_array een statische lijst.
		Collection<String> x_statischeLijst = Arrays.asList(x_array);
		Collection<String> y_statischeLijst = Arrays.asList(y_array);

		// Maak van de statische lijst een dynamische lijst.
		List<String> x_dynamischeLijst = new ArrayList<>(x_statischeLijst);
		List<String> y_dynamischeLijst = new ArrayList<>(y_statischeLijst);

		// Maak de output [banaan, mango, zespri].
		// Door elk element dat in x_dynamischeLijst zit wordt verwijdert uit
		// y_dynamischeLijst
		y_dynamischeLijst.removeAll(x_statischeLijst);
		System.out.printf("In y_dynamischeLijst zonder x_dynamischeLijst zit: %s%n%n", y_dynamischeLijst);

		// Maak de output [appel, peer].
		// Door elk element dat in y_dynamischeLijst zit wordt verwijdert uit
		// x_dynamischeLijst
		x_dynamischeLijst.removeAll(y_statischeLijst);
		System.out.printf("In x_dynamischeLijst zonder y_dynamischeLijst zit: %s%n%n", x_dynamischeLijst);

		// Maak een nieuwe dynamische lijst die de gemeenschappelijke
		// objecten in x_dynamischeLijst en y_dynamischeLijst zitten.
		List<String> gemeenschappelijkeObjecten = new ArrayList<>(x_statischeLijst);
		gemeenschappelijkeObjecten.retainAll(y_statischeLijst);
		System.out.printf("x_dynamischeLijst en y_dynamischeLijst hebben gemeenschappelijk: %s%n%n",
				gemeenschappelijkeObjecten);

		/*
		 * Bewerkingen: Arrays.asList(array1) -> Zet een array om in een statische
		 * lijst. lijst1.removeAll(lijst2) -> verwijdert alle elementen in lijst1 die in
		 * lijst2 zitten. lijst1.retainAll(lijst2) -> verwijdert alle elementen in
		 * lijst1 die niet in lijst2 zitten. List<String> lijst__dynamisch = new
		 * ArrayList<>(lijst__statisch) -> maakt van een statische lijst een dynamische
		 * lijst.
		 * 
		 * Verschil statische lijst en dynamische lijst: Op een statische lijst kunnen
		 * enkel statische bewerkingen gedaan worden zoals System.out.print() en size().
		 * Maar op een statische lijst kan geen bewerking zoals remove() of contains().
		 * Op een dynamische lijst zijn zowel statische als dynamische bewerkingen
		 * mogelijk. (Werk steeds met dynamische lijsten).
		 */

	}
}
