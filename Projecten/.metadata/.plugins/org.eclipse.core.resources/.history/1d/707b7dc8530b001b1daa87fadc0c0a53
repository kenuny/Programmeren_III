package ui;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Deitel_FactoryMethods_737 {

	public static void main(String[] args) {

		/*
		 * Factory methods zijn methodes die ervoor zorgen dat je gemakkelijk een
		 * collection kan aanmaken die declaratie niet wijzigbaar is.
		 */

		List<String> colorsList = List.of("red", "orange", "yellow", "green", "blue", "indigo", "violet");
		display(colorsList, "colorList");
		
		Set<String> colorsSet = Set.of("red", "orange", "yellow", "green", "blue", "indigo", "violet");
		display(colorsSet, "colorSet");
		
		// methode 1
		Map<String, Integer> dayMap = Map.of("Monday", 1, "Tuesday", 2, "Wednesday", 3, "Thursday", 4, "Friday", 5, "Saturday", 6, "Sunday", 7 );
		System.out.printf("dayMap: %s%n%n", dayMap);
		
		// methode 2
		Map<String, Integer> monthMap = Map.ofEntries(
				Map.entry("January", 31), 
				Map.entry("february", 28), 
				Map.entry("March", 31),
				Map.entry("April", 30),
				Map.entry("May", 31), 
				Map.entry("June", 30), 
				Map.entry("July", 31),
				Map.entry("August", 31),
				Map.entry("September", 30),
				Map.entry("October", 31),
				Map.entry("November", 30),
				Map.entry("December", 31)
		);
		
		System.out.printf("MonthMap: %s%n%n", monthMap.keySet());
		
				
		
	}
	
	private static <E> void display(Collection<E> c, String name) {
		System.out.printf("%s: %s%n%n", name, c);
	}


}
