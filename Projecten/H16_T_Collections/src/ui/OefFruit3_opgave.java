package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OefFruit3_opgave {

	public static void main(String args[]) {
		String kist[][] = { { "appel", "peer", "citroen", "kiwi", "perzik" },
				{ "banaan", "mango", "citroen", "kiwi", "zespri", "pruim" },
				{ "peche", "lichi", "kriek", "kers", "papaya" } };

		List<String> list = new ArrayList<>();

		/*
		 * Plaatst elk element van de 2D array in de lijst. Manier 1: enhanced-for
		 * Manier 2: stream.forEach() Manier 3: stream.flatMap()
		 */

		// Manier 1
		for (String[] eenKist : kist) {
			list.addAll(Arrays.asList(eenKist));
		}

		// Manier 2:
		// Arrays.stream(kist).forEach(eenkist -> list.addAll(Arrays.asList(eenkist)));

		// Manier 3:
		// list =
		// Arrays.stream(kist).flatMap(Arrays::stream).collect(Collectors.toList());

		System.out.println(list);

		/*
		 * Maakt een TreeMap (geen duplicaten map) aan. Plaatst elk fruit als key in de
		 * map en geeft als value null.
		 * 
		 * Manier 1: enhanced for Manier 2: Lambda
		 */
		Scanner scan = new Scanner(System.in);
		Map<String, Double> fruit = new TreeMap<>();

		// Manier 1:
		for (String eenFruit : list) {
			fruit.put(eenFruit, null);
		}

		// Manier 2:
		// list.forEach(eenFruit -> fruit.put(eenFruit, null));

		/*
		 * Vraagt per key aan de gebruiker de prijs. De prijs wordt vervolgens
		 * opgeslagen als value.
		 * 
		 * output vervolgens de map.
		 */

		for (Map.Entry<String, Double> eenEntry : fruit.entrySet()) {
			System.out.printf("Prijs van %s: ", eenEntry.getKey());
			double prijs = scan.nextDouble();
			eenEntry.setValue(prijs);
		}

		System.out.println();

		// Door middel van Lambda
		// fruit.entrySet().forEach(eenEntry -> {
		// System.out.printf("Prijs van %s : ", eenEntry.getKey());
		// double prijs = scan.nextDouble();
		// eenEntry.setValue(prijs);
		// });

		System.out.printf("%-15s%s%n", "Fruitsoort", "Prijs in €");

		fruit.forEach((fruitsoort, prijs) -> System.out.printf("%-15s%s%n", fruitsoort, prijs));

	}

	public static boolean addOrdered(List<String> list, String key) {
		boolean changed = false;
		int index = Collections.binarySearch(list, key);
		if (index < 0) {
			list.add(index * -1 - 1, key);
			changed = true;
		}
		return changed;
	}

}

///*
// * for (Map.Entry<String, Double> eenEntry : fruit.entrySet()) {
// * System.out.println(eenEntry.getKey() + "\t" + eenEntry.getValue()); }
// */
//fruit.forEach((naam, prijs) -> System.out.println(naam + "\t" + prijs));