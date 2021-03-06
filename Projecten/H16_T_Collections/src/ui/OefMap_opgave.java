package ui;

import java.util.*;

class Auteur {

	private String naam, voornaam;

	public Auteur(String naam, String voornaam) {
		setNaam(naam);
		setVoornaam(voornaam);
	}

	public String getNaam() {
		return naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	@Override
	public String toString() {
		return String.format("%s %s", naam, voornaam);
	}
}

public class OefMap_opgave {

	public OefMap_opgave() {

		/*
		 * Maken van een HashMap met de naam auteurs.
		 */

		Map<Integer, Auteur> auteurs = new HashMap<>();

		/*
		 * Twee KVP's in de HashMap plaatsen - Key: Integer (is uniek) - Value: Auteur
		 * (niet uniek)
		 */

		auteurs.put(9876, new Auteur("Gosling", "James"));
		auteurs.put(5648, new Auteur("Chapman", "Steve"));

		/*
		 * Naam wijzigen Om een value te wijzigen roep je het op met de key. vervolgens
		 * gebruik je de setter om het aan te passen.
		 */

		auteurs.get(5648).setVoornaam("John");

		/*
		 * Zoeken of een bepaalde key bestaat.
		 */
		if (auteurs.containsKey(1234))
			System.out.println("auteursID 1234 komt voor\n");
		else
			System.out.println("auteursID 1234 komt niet voor\n");

		/*
		 * Toon de naam en de voornaam van een auteur Toon vervolgens alle auteurs.
		 */

		Auteur auteur = auteurs.get(5648);
		if (auteur != null)
			System.out.println(auteur + "\n");

		toonAlleAuteurs(auteurs);

		/*
		 * Alle auteurs tonen in oplopende volgeorde. TreeSet maakt gebruik van
		 * natuurlijke sorteren i.p.v. Hashmap willekeurig.
		 */

		Map<Integer, Auteur> treeMap = new TreeMap<>(auteurs);
		toonAlleAuteurs(treeMap);

	}

	public void toonAlleSleutels(Map<Integer, Auteur> map) {

		map.keySet().forEach(eenAuteursID -> System.out.println(eenAuteursID));
		System.out.println();

	}

	public void toonAlleAuteurs(Map<Integer, Auteur> map) {

		map.forEach((id, auteur) -> System.out.printf("%d\t%s%n", id, auteur));
		System.out.println();

	}

	public static void main(String args[]) {
		new OefMap_opgave();
	}
}
