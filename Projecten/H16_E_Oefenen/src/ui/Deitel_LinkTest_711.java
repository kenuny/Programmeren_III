package ui;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Deitel_LinkTest_711 {

	public static void main(String[] args) {

		/*-----------------Voeg colors toe aan list1 en list2----------------*/
		String[] colors1 = { "black", "yellow", "green", "blue", "violet", "silver" };
		LinkedList<String> list1 = new LinkedList<>();

		for (String color : colors1) {
			list1.add(color);
		}

		String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
		List<String> list2 = new LinkedList<>();

		for (String color : colors2) {
			list2.add(color);
		}

		/*------------Concatenatie van twee lijsten naar ��n lijst-----------*/
		list1.addAll(list2); // Plakt list2 achter list1.
		// list2 = null;
		printList(list1);

		/*---------Plaatst elk element van de collection in uppercase--------*/
		convertToUpperCaseString(list1);
		printList(list1);

		/*------Deleting element 4, 5 and 6 en print normal and reverse------*/
		removeItems(list1, 4, 7);
		printList(list1);
		printListReverse(list1);

		/*-----------------Extra om te oefenen op LinkedList-----------------*/
		List<String> list1a = new LinkedList<>();
		list1a.add("|List1a e1|");
		list1a.add("|List1a e2|");

		list1.addFirst("|FIRST|"); // add op eerste plaats.
		list1.addLast("|LAST|"); // add op laatste plaats.
		list1.add(1, "|IND: 1|"); // add op index 1.
		list1.addAll(2, list1a); // add op index 2 de collection list2
		printList(list1); // printlist

	}

	private static void convertToUpperCaseString(List<String> list) {
		ListIterator<String> it = list.listIterator();

		while (it.hasNext())
			it.set(it.next().toUpperCase());
	}

	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}

	private static void printList(List<String> list) {
		System.out.printf("List: %n");

		for (String elem : list) {
			System.out.printf("%s ", elem);
		}

		System.out.println("\n");
	}

	private static void printListReverse(List<String> list) {
		System.out.printf("List: %n");

		// size zorgt ervoor dat de pointer weet waar te starten.
		ListIterator<String> it = list.listIterator(list.size());

		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}

		System.out.println("\n");
	}
}
