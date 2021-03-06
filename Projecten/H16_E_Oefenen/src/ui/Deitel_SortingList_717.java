package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deitel_SortingList_717 {

	public static void main(String[] args) {

		/*
		 * Een lijst sorteren door middel van Collections.sort(lijst). -Ascending-
		 */

		String[] suits = { "Hearths", "Diamonds", "Clubs", "Spades" };

		List<String> lijst = new ArrayList<>();
		lijst = Arrays.asList(suits);

		System.out.println("Collections.sort(lijst)");
		System.out.println("-----------------------");

		System.out.printf("%nOngesorteerde lijst: %s%n", lijst);

		Collections.sort(lijst);
		System.out.printf("Gesorteerde lijst: %s%n%n", lijst);

		/*
		 * Een lijst sorteren door middel van een comparable.
		 */

		String[] suits2 = { "Hearths", "Diamonds", "Clubs", "Spades" };

		List<String> lijst2 = Arrays.asList(suits2);

		System.out.println("\n\nCollections.sort(lijst, comperator (= collections.reverseOrder())");
		System.out.println("-----------------------------------------------------------------\n");

		System.out.printf("Ongesorteerde lijst: %s", lijst2);

		Collections.sort(lijst2, Collections.reverseOrder());
		System.out.printf("%nGesorteerde lijst: %s%n", lijst2);

	}
}
