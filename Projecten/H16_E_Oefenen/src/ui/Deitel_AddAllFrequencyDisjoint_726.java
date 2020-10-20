package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deitel_AddAllFrequencyDisjoint_726 {

	public static void main(String[] args) {

		String[] colors = { "red", "white", "yellow", "blue" };
		List<String> list1 = Arrays.asList(colors);

		List<String> list2 = new ArrayList<>();
		list2.add("black");
		list2.add("red");
		list2.add("green");

		System.out.printf("Before addAll, list2 contains: %s%n", list2);
		Collections.addAll(list2, colors);
		System.out.printf(" After addAll, list2 contains: %s%n%n", list2);

		
		/*
		 * Frequency retourneert het aantal keer dat een element in de lijst voortkomt.
		 */

		int frequency = Collections.frequency(list2, "red");
		System.out.printf("Frequency of red in list2: %d%n%n", frequency);

		/*
		 * Disjoint retourneert true indien beide lijsten geen elementen
		 * gemeenschappelijk hebben.
		 */
		boolean disjoint = Collections.disjoint(list1, list2);
		System.out.printf("List1 and list2 %s elements in common", disjoint == true ? "haven't" : "have");

	}
}
