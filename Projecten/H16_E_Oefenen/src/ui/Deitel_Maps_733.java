package ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Deitel_Maps_733 {

	public static void main(String[] args) {

		/*
		 * Map:
		 * 
		 * Een map associŽert keys met values. Elke key in moet uniek zijn, de value kan
		 * een duplicaat zijn. - Als alle keys en alle values uniek zijn --> one-to-one
		 * map - Als alle keys uniek zijn en values niet --> many-to-one map - HashMap:
		 * Slaagt elementen op in een hash table. - TreeMap: Slaagt elementen op in een
		 * tree.
		 * 
		 */

		Map<String, Integer> myMap = new HashMap();

		createMap(myMap);
		displayMap(myMap);

	}

	private static void createMap(Map<String, Integer> map) {

		/*
		 * Vraagt aan de gebruiker een input en steekt deze in een tokenizer. De tokens
		 * worden gesplit op basis van een spatie.
		 * 
		 * Vervolgens gaat men elke token overlopen. - Als de token nog niet bestaat
		 * wordt deze toegevoegd. - Als de token al bestaat verhoogt de teller met 1.
		 * 
		 * Het woord is de key. De teller/woord is de value.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();

		String[] tokens = input.split(" ");

		for (String token : tokens) {
			String word = token.toLowerCase();

			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}
	}

	private static void displayMap(Map<String, Integer> map) {

		/*
		 * Maakt een TreeMap aan en steekt alle keys van de HashMap in de TreeMap. De
		 * TreeMap zorgt ervoor dat de sleutels op natuurlijke ordening worden
		 * weergegeven en tot slot worden de keys van de treemap geprint en de values
		 * van de hashmap.
		 */
		Set<String> keys = map.keySet();

		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		System.out.printf("%nMap contains%nKey\t\tValue%n");

		for (String key : sortedKeys) {
			System.out.printf("%-10s%10s%n", key, map.get(key));
		}

		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());

	}
}
