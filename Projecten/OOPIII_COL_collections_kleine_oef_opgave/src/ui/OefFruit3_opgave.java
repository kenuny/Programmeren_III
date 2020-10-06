package ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OefFruit3_opgave {

	public static void main(String args[]) {
		String kist[][] = { { "appel", "peer", "citroen", "kiwi", "perzik" },
				{ "banaan", "mango", "citroen", "kiwi", "zespri", "pruim" },
				{ "peche", "lichi", "kriek", "kers", "papaya" } };

		List<String> list;

		// list = new ArrayList<>();
		// java7
		/*
		 * for (String[] eenKist : kist) { list.addAll(Arrays.asList(eenKist)); }
		 */
		// Arrays.stream(kist).forEach(eenkist -> list.addAll(Arrays.asList(eenkist)));
		list = Arrays.stream(kist).flatMap(Arrays::stream).collect(Collectors.toList());

		/*
		 * Berg de fruit list van vorige oefeningen in een boom op zodat dubbels
		 * ge�limineerd worden. Er moet ook de mogelijkheid zijn de bijhorende prijs
		 * (decimale waarde) bij te houden.
		 */
		// ------------------------------------------------------------
		/*
		 * Doorloop de boom in lexicaal oplopende volgorde en vraag telkens de
		 * bijhorende prijs, die je mee in de boom opbergt.
		 */
		// ------------------------------------------------------------
		/*
		 * Druk vervolgens de volledige lijst in twee kolommen (naam : prijs) in
		 * lexicaal oplopende volgorde af op het scherm.
		 */
		// ------------------------------------------------------------
		Map<String, Double> fruit = new TreeMap<>();

		Scanner in = new Scanner(System.in);
		/*
		 * for (String eenFruit : list) { fruit.put(eenFruit, null); }
		 */
		list.forEach(eenFruit -> fruit.put(eenFruit, null));

		/*
		 * for (Map.Entry<String, Double> eenEntry : fruit.entrySet()) {
		 * System.out.printf("Prijs van %s : ", eenEntry.getKey()); double prijs =
		 * in.nextDouble(); eenEntry.setValue(prijs); }
		 */
		fruit.entrySet().forEach(eenEntry -> {
			System.out.printf("Prijs van %s : ", eenEntry.getKey());
			double prijs = in.nextDouble();
			eenEntry.setValue(prijs);
		});

		fruit.forEach((naam, prijs) -> System.out.println(naam + "\t" + prijs));
		/*
		 * for (Map.Entry<String, Double> eenEntry : fruit.entrySet()) {
		 * System.out.println(eenEntry.getKey() + "\t" + eenEntry.getValue()); }
		 */

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