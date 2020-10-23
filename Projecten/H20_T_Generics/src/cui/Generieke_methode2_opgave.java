package cui;

import java.util.*;

abstract class Dier {
}

interface Huisdier {
}

class Hond extends Dier implements Huisdier {
}

class Kat extends Dier implements Huisdier {
}

//Gevraagd:
//schrijf een klasse die een set van Kat, Hond of Huisdier kan bevatten
// Extends Huisdier laat alle klassen toe die de interface Huisdier implementeren.
class VerzamelingHuisdier<E extends Huisdier> {

// attribuut "huisdieren" = set van Kat, Hond of Huisdier
// -------------------------------------------------------
	// Als je diamond operator vergeet dan ben je de link kwijt naar je generieke
	// klasse
	private Set<E> huisdieren = new HashSet<>();

// getHuisdieren
// -------------------
	public Set<E> getHuisdieren() {
		return Collections.unmodifiableSet(huisdieren);
	} // Om elementen uit het domein door te geven naar de presentatielaag.

// methode add: een dier toevoegen in de set
// ------------------------------------------
	// In een generieke klasse moet er geen typeparametersectie voor de void.
	public void add(E dier) {
		huisdieren.add(dier);
	}

}

class Tools { // niet generieke klasse!
//methode bevatHuisdier met twee argumenten: een huisdier en een set van Kat, Hond of Huisdier.
//Geeft true terug indien het huisdier in de set voorkomt, anders false.

//schrijf de static methode bevatHuisdier d.m.v. wildcards
//--------------------------------------------------------
	public static boolean bevatHuisdier(Huisdier huisdier, Set<? extends Huisdier> setHuisdieren) {
		
		return setHuisdieren.contains(huisdier);
	}
	
//schrijf de static methode bevatHuisdier2 d.m.v. generieke methode
//------------------------------------------------------------------
	public static <E extends Huisdier> boolean bevatHuisdier2(E huisdier, Set<E> setHuisdieren) {
		
		return setHuisdieren.contains(huisdier);
	}
}

public class Generieke_methode2_opgave {

	public static void main(String args[]) {
		Kat kat = new Kat();
		Hond hond = new Hond();
		Huisdier huisdier = new Hond();

		VerzamelingHuisdier<Kat> katten = new VerzamelingHuisdier<>();
		katten.add(kat);
		VerzamelingHuisdier<Hond> honden = new VerzamelingHuisdier<>();

		VerzamelingHuisdier<Huisdier> huisdieren = new VerzamelingHuisdier<>();
		huisdieren.add(huisdier);

		boolean komtVoor = Tools.bevatHuisdier(kat, katten.getHuisdieren());
		System.out.println("correct = true;  " + komtVoor);
		komtVoor = Tools.bevatHuisdier(hond, honden.getHuisdieren());
		System.out.println("correct = false;  " + komtVoor);
		komtVoor = Tools.bevatHuisdier(huisdier, huisdieren.getHuisdieren());
		System.out.println("correct = true;  " + komtVoor);
		// compileerfout: komtVoor = Tools.bevatHuisdier(kat, new HashSet<Dier>());

		komtVoor = Tools.bevatHuisdier2(kat, katten.getHuisdieren());
		System.out.println("correct = true;  " + komtVoor);
		komtVoor = Tools.bevatHuisdier2(hond, honden.getHuisdieren());
		System.out.println("correct = false;  " + komtVoor);
		komtVoor = Tools.bevatHuisdier2(huisdier, huisdieren.getHuisdieren());
		System.out.println("correct = true;  " + komtVoor);
	}

}
