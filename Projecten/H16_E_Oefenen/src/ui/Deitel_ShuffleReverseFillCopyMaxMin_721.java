package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deitel_ShuffleReverseFillCopyMaxMin_721 {

	public static void main(String[] args) {

		/*
		 * Shuffle lijst: Door gebruik te maken van een statische methode van de klasse
		 * Collections. Collections.shuffle(list).
		 */

		String[] colors = { "White", "Yellow", "Blue", "Green", "Black" };
		List<String> kleurenlijst = Arrays.asList(colors);
		System.out.printf("Originele lijst: %s%n%n", kleurenlijst);

		Collections.sort(kleurenlijst);
		System.out.printf("Gesorteerde kleurenlijst: %s%n%n", kleurenlijst);

		Collections.shuffle(kleurenlijst);
		System.out.printf("Geshuffelde kleurenlijst: %s%n%n", kleurenlijst);

		/*
		 * Reverse lijst: Door gebruik te maken van een statische methode van de klasse
		 * Collections. Collections.reverse(list).
		 */

		Character[] letters = { 'P', 'C', 'M' };
		List<Character> characterlijst = Arrays.asList(letters);

		System.out.printf("De characterlijst bevat: %s%n%n", characterlijst);

		Collections.reverse(characterlijst);
		System.out.println("De characterlijst omdraaien: " + characterlijst);

		/*
		 * Copy lijst.
		 */

		Character[] lettersCopy = new Character[letters.length];
		List<Character> copyList = Arrays.asList(lettersCopy);

		Collections.copy(copyList, characterlijst);

		System.out.println("\nKopi�ren van een lijst: " + copyList);

		/*
		 * Fill lijst.
		 */

		Collections.fill(copyList, 'E');
		System.out.println("\nLijst opvullen: " + copyList);

		/*
		 * Maximum en minimum referentie.
		 * 
		 * Bij Strings - Minimum retourneert de eerste waarde op alfabet. (aa bb cc -->
		 * retourneert aa) (bb aa cc --> retourneert aa). - Maximum retourneert de
		 * laatste waarde op alfabet. (aa bb cc --> retourneert cc) (bb aa cc -->
		 * retourneert cc).
		 * 
		 * Bij integers / doubles / ... - Minimum retourneert de kleinste waarde. (0.5
		 * 0.8 1.1 --> retourneert 0.5) (1.1 0.5 0.8 --> retourneert 0.5). - Maximum
		 * retourneert de grootste waarde. (0.5 0.8 1.1 --> retourneert 1.1) (1.1 0.5
		 * 0.8 --> retourneert 1.1).
		 */

		String minimumString = Collections.min(kleurenlijst); // retourneert kleinste of eerste (bij String).
		String maximumString = Collections.max(kleurenlijst); // retourneer
		Collections.sort(kleurenlijst);
		System.out.printf("%nMiniumum: %s%nMinimum: %s.%nGesorteerd: %s%n%n", minimumString, maximumString,
				kleurenlijst);

		int[] getallen = { 1, 9, 2, 7, 6, 3, 5, 4 };
		List<Integer> lijstIntegere = new ArrayList<>();

		for (int getal : getallen) {
			lijstIntegere.add(getal);
		}

		System.out.println(lijstIntegere);

		int miniumInt = Collections.min(lijstIntegere);
		int maximumInt = Collections.max(lijstIntegere);
		System.out.printf("%nMiniumum: %d%nMinimum: %d%n%n", miniumInt, maximumInt);

	}

}
