package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class CollectionOperaties {

	public static void verwijderOpLetter(Collection<String> collection, char letter) { // boolean kan ook void zijn

		/*
		 * 
		 * De iterator doorloop de collection. Bij elk object wordt de eerste karakter
		 * vergeleken met de opgegeven letter. Zijn beide gelijk wordt het woord
		 * verwijdert ui de collection.
		 * 
		 */
		// Implementatie in JAVA 7:
		Iterator<String> it = collection.iterator();

		while (it.hasNext()) {
			if (it.next().charAt(0) == letter) {
				it.remove();
			}
		}

		// Implementatie in JAVA 8:
		// c.removeIf(e -> e.charAt(0) == letter);

	}

	public static void verwijderSequence(List<String> list, String limit) {

		/*
		 * Er wordt een string meegegeven (VB: kiwi), dan wordt er gezocht in de list
		 * waar de string het eerst voorkoomt en waar de string het laatst voorkomt.
		 * Alles wat tussen het eerste en het laatste woord staat wordt verwijdert.
		 * 
		 */
		int indexStart = list.indexOf(limit);
		int indexEinde = list.lastIndexOf(limit);

		if (indexStart != -1 && indexEinde != -1) {
			list.subList(indexStart, indexEinde + 1).clear();
		}

	}

	public static void addOrder(List<String> list, String keyFruitSoort) {

		/*
		 * Zoek door middel van binarySearch of de fruitsoort als is toegevoegd aan de
		 * list. Indien de binarySearch een negatieve waarde teruggeeft zit de
		 * fruitsoort er nog niet in. Indien de positieve waarde wordt teruggeven zit de
		 * fruitsoort er in. De waarde zowel negatief als positief is de absolute
		 * indexwaarde.
		 * 
		 * In deze opdracht indien de fruitsoort er nog niet inzit dan wordt ze
		 * toegevoegd aan de list.
		 */
		int index = Collections.binarySearch(list, keyFruitSoort);

		if (index < 0)
			list.add(((index * -1) - 1), keyFruitSoort);

//		int index = Collections.binarySearch(list, keyFruitSoort);
//		if (index != -1) {
//			list.add(((index * -1) - 1), keyFruitSoort);
//		} else {
//			list.add("bestaat al");
//		}
	}

}

public class OefFruit2_opgave {

	public static void main(String args[]) {

		/*
		 * kist: Maakt een 2D array aan met fruitsoorten. list: Maakt een lege
		 * dynamische lijst aan.
		 * 
		 * Print: 2D array met deepToString() -> Static methode van de klasse Arrays.
		 */
		String kist[][] = { { "appel", "peer", "citroen", "kiwi", "perzik" },
				{ "banaan", "mango", "citroen", "kiwi", "zespri", "pruim" },
				{ "peche", "lichi", "kriek", "kers", "papaya" } };
		List<String> list = new ArrayList<>();

		System.out.println("2D array printen d.m.v. deepToString(): ");
		System.out.println(Arrays.deepToString(kist));
		System.out.println("\n");

		/*
		 * Overloopt de 2D array met een enhanced for. Elke kist (totaal van 3 kisten)
		 * bevat meerdere friutsoorten. De kisten met hun fruit worden geconcateneerd
		 * aan de dynamische list.
		 * 
		 * Manier 1: Volgens Java 7 standaarden. (Overlopen d.m.v. enhanced for). Manier
		 * 2: Volgens Java 8 standaarden. (Overlopen d.m.v. stream). Manier 3: Volgens
		 * Java 8 standaarden. (Overlopen d.m.v. stream pipeline).
		 * 
		 */
		// Manier 1
		for (String[] eenKist : kist)
			list.addAll(Arrays.asList(eenKist));

		// Manier 2
		// Arrays.stream(kist).forEach(eenKist -> list.addAll(Arrays.asList(eenKist)));

		// Manier 3
		// list =
		// Arrays.stream(kist).flatMap(Arrays::stream).collect(Collectors.toList());

		System.out.println("list printen na concatenatie van elke kist: ");
		System.out.println(list);
		System.out.println("\n");

		/*
		 * list wordt van dynamische lijst omgezet naar een array en meegegeven aan 1D
		 * array mand. Vervolgens wordt de 1D array gesorteerd.
		 */

		String[] mand = list.toArray(new String[list.size()]);
		Arrays.sort(mand);
		System.out.println("Print de mand uit, waarvan de list is omgezet in een array: ");
		System.out.println(Arrays.toString(mand));
		System.out.println();

		/*
		 * De void methode verwijderletter van de klasse CollectionOperaties wordt
		 * opgeropen. De methode moet geen list teruggeven. Operaties van het type list
		 * worden automatisch uitgevoerd.
		 * 
		 * verwijderOpLetter(lijst, letter) -> Verwijdert elk object in de list dat
		 * begint met de opgegeven letter. verwijderSequence(lijst, woord) -> Verwijdert
		 * elk object in de list dat zich tussen het eerste en laatste woord bevindt.
		 */

		CollectionOperaties.verwijderOpLetter(list, 'p');
		System.out.println("na verwijder letter ('p'):  ");
		System.out.println(list);
		System.out.println();

		CollectionOperaties.verwijderSequence(list, "kiwi");
		System.out.println("na verwijder sequence (kiwi): ");
		System.out.println(list);
		System.out.println();

		/*
		 * Plaatst de huidige list na bewerking van kiwi sequence in een array en
		 * sorteert deze array oplopen.
		 */

		mand = list.toArray(new String[list.size()]);
		Arrays.sort(mand);

		System.out.println("Plaatst overblijvende list van verwijderSequence in array: ");
		System.out.println(Arrays.toString(mand));
		System.out.println();

		/*
		 * De methode addOrder voegt een element toe aan de list als het er nog niet op
		 * staat.
		 * 
		 * In het geval van sapodilla geeft de binarySearch -6 terug. Vermenigvuldig dit
		 * met -1 en je krijgt de absolute waarde trek er nog een -1 af omdat het
		 * zero-based is. Dat is de locatie dat de fruitsoort moet worden toegevoegd in
		 * een gesorteerde list.
		 */

		list.sort(null);
		CollectionOperaties.addOrder(list, "sapodilla");
		System.out.println(list);

	}
}
