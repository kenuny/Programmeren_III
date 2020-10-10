package ui;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Deitel_Set_729 {

	public static void main(String[] args) {

		/*
		 * Set: is een collection van unieke elementen? (m.a.w. verwijdert duplciaten).
		 * - HashSet: sorteert elementen ongeordend in een hash table. 
		 * - TreeSet: sorteert elementen geordend in een tree table.
		 */

		String[] colors = { "red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray",
				"orange" };
		List<String> list = Arrays.asList(colors);
		System.out.println("List of colors without set: " + list + ".\n");

		Set<String> set = new HashSet<>(list);
		System.out.println("List of colors with set:    " + set + ".\n");

	}

}
