/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.Auteur;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Docent
 */
public class DoorlopenEntrySetMetIterator {

	public static void main(String args[]) {
		Map<Integer, Auteur> auteurs = new HashMap<>();

		auteurs.put(1234, new Auteur("Chevallier", "Robert"));
		auteurs.put(876, new Auteur("Gosling", "James"));
		auteurs.put(5648, new Auteur("Chapman", "Steve"));

		Iterator<Map.Entry<Integer, Auteur>> iter = auteurs.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Auteur> entry = iter.next();
			if (entry.getKey() > 5000)
				iter.remove();
		}

		System.out.println("\nNa verwijdering:");
		for (Map.Entry<Integer, Auteur> eenEntry : auteurs.entrySet()) {
			Auteur auteur = eenEntry.getValue();
			System.out.println(eenEntry.getKey() + "\t" + auteur);
		}

	}
}
