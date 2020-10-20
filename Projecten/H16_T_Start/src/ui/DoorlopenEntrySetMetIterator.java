package ui;

import domein.Auteur;
import java.util.HashMap;
import java.util.Map;

public class DoorlopenEntrySetMetIterator {

	public static void main(String args[]) {

		Map<Integer, Auteur> auteurs = new HashMap<>();

		auteurs.put(1234, new Auteur("Chevallier", "Robert"));
		auteurs.put(876, new Auteur("Gosling", "James"));
		auteurs.put(5648, new Auteur("Chapman", "Steve"));

		for (int key : auteurs.keySet())
			System.out.printf("%s\t%s%n", key, auteurs.get(key));

	}
}

/*
 * map.put() : element toevoegen aan de map. -> Tussen haakjes plaats je de
 * elementen die moeten worden toegevoegd. map.keySet() : toont alle keys van de
 * map. -> Tussen haakjes blijft leeg. map.get() : Om de value van één key op te
 * halen. -> Tussen haakjes plaats je de key.
 */