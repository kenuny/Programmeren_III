package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class InleidingDoorlopenCollectie_start {
	public static void main(String[] args) {
		List<String> woorden = new ArrayList<>();
		woorden.add("Eerste");
		woorden.add("Tweede");
		woorden.add("Derde");
		woorden.add("Eerste");
		woorden.add("Tweede");
		woorden.add("Derde");
		woorden.add("\n");

		/*
		 * Verschillende manieren om een collectie te doorlopen
		 * 
		 * Manier 1: for-lus Manier 2: enhanced-for : maakt gebruik van iterator Manier
		 * 3: iterator : exact hetzelfde als een enhanced-for Manier 4: ListIterator
		 * Manier 5: Lambda Manier 6: Reference method
		 * 
		 * Enhanced for : kan objecten lezen en werkt niet-geïndexeerd. Iterator : kan
		 * objecten lezen en verwijderen en werkt niet-geïndexeerd. ListIterator : kan
		 * lijsten lezen, verwijderen en aanpassen en werkt geïndexeerd.
		 * 
		 */

		// Manier 1:
		System.out.println("Manier 1: For-lus");
		System.out.println("-----------------");

		for (int i = 0; i < woorden.size(); i++)
			System.out.println(woorden.get(i));

		// Manier 2:
		System.out.println("Manier 2: Enhanced-for");
		System.out.println("----------------------");
		for (String elem : woorden)
			System.out.println(elem);

		// Manier 3:
		System.out.println("Manier 3: Iterator");
		System.out.println("------------------");
		Iterator<String> it = woorden.iterator();

		while (it.hasNext())
			System.out.println(it.next());

		// Manier 4:
		System.out.println("Manier 4: ListIterator + index(5)");
		System.out.println("---------------------------------");
		ListIterator<String> lijstIterator = woorden.listIterator();
		ListIterator<String> lijstIteratorIndex = woorden.listIterator(5);
		System.out.println("Indexing: " + lijstIteratorIndex.next() + "\n"); // geïndexeerde toegang

		while (lijstIterator.hasNext()) {
			String woord = lijstIterator.next();
			System.out.println(woord);
		}

		// Manier 5:
		System.out.println("Manier 5: Lambda");
		System.out.println("----------------");
		woorden.forEach(elem -> System.out.println(elem));

		// Manier 6:
		System.out.println("Manier 6: Method reference");
		System.out.println("--------------------------");
		woorden.forEach(System.out::println);

	}
}