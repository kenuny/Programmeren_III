package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _ArrayList {

	public static void main(String[] args) {

		System.out.println("Maak een lege ArrayList aan: ");
		List<String> kleurenlijst = new ArrayList<String>();
		System.out.println(kleurenlijst + "\n\n");

		System.out.println("Voeg 3 kleuren toe: ");
		kleurenlijst.add("Rood");
		kleurenlijst.add("Groen");
		kleurenlijst.add("Blauw");
		System.out.println(kleurenlijst + "\n\n");

		System.out.println("Sorteer de ArrayList: ");
		Collections.sort(kleurenlijst);
		System.out.println(kleurenlijst + "\n\n");

		System.out.println("Verwijder rood: ");
		kleurenlijst.remove(kleurenlijst.indexOf("Rood"));
		System.out.println(kleurenlijst + "\n\n");

		System.out.println("Controleer of de ArrayList Groen bevat: ");
		System.out.println(kleurenlijst.contains("Groen") + "\n\n");

		System.out.println("Toon het eerste en laatste element in de lijst");
		System.out.println(kleurenlijst.get(0) + " is de eerste kleur, en de laatste kleur is "
				+ kleurenlijst.get(kleurenlijst.size() - 1) + "\n\n");

	}

}
