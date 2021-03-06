package domein;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import persistentie.PersistentieController;

public class BierWinkel {

	private final List<Bier> bieren;
	private PersistentieController pc = new PersistentieController();

	public BierWinkel() {
		bieren = pc.inlezenBieren("bieren.txt");
	}

	public List<Bier> getBieren() {
		return bieren;
	}

	public long geefAantalBierenMetMinAlcoholPercentage(double percentage) {
		/*
		 * stream maken van de lijst bieren. met de filter de waarden filteren die je
		 * wilt count telt het aantal elementen die er zijn en geeft deze terug.
		 */
		return bieren.stream().filter(bier -> bier.getAlcoholgehalte() >= percentage).count();
	}

	public List<Bier> geefAlleBierenMetMinAlcoholPercentage(double percentage) {
		return bieren.stream().filter(bier -> bier.getAlcoholgehalte() >= percentage).collect(Collectors.toList());
	}

	public List<String> geefNamenBieren() {
		return bieren.stream().map(Bier::getNaam).collect(Collectors.toList());
	}

	// Bier met hoogst aantal graden
//	public double geefBierMetHoogsteAlcoholPercentage() {
//		return bieren.stream().mapToDouble(Bier::getAlcoholgehalte).max().getAsDouble();
//	}

	public Bier geefBierMetHoogsteAlcoholPercentage() {
		return bieren.stream().max(Comparator.comparing(Bier::getAlcoholgehalte)).get();
	}

	// Bier met laagst aantal graden
	public Bier geefBierMetLaagsteAlcoholPercentage() {
		return bieren.stream().min(Comparator.comparing(Bier::getAlcoholgehalte)).get();
	}

	/*
	 * Zorg ervoor dat het resultaat gesorteerd wordt op alcoholgehalte van hoog
	 * naar laag, en bij gelijk aantal graden op naam (alfabetisch).
	 */
	public List<Bier> geefGeordendOpAlcoholGehalteEnNaam() {

		/*
		 * Op bieren een stream plaatsen en vervolgens sorteren via sorted() daar de
		 * comparator meegeven dat het eerst op alcoholgehalte moet sorteren en
		 * vervolgens op de naam van het bier. Tot slot collecten als list en dat wordt
		 * geretourneerd.
		 */
		return bieren.stream()
				.sorted(Comparator.comparing(Bier::getAlcoholgehalte).reversed().thenComparing(Bier::getNaam))
				.collect(Collectors.toList());
	}

	// Alle brouwerijen
	public List<String> geefAlleNamenBrouwerijen() {
		// Brouwerijen kunnen meerdere keren voorkomen -> distinct om de duplicaten
		// eruit te halen.
		return bieren.stream().map(Bier::getBrouwerij).distinct().collect(Collectors.toList());
	}

	// Alle brouwerijen die het woord "van" bevatten
	public List<String> geefAlleNamenBrouwerijenMetWoord(String woord) {
		return bieren.stream().filter(bier -> bier.getBrouwerij().contains(woord)).map(Bier::getBrouwerij).distinct()
				.collect(Collectors.toList());
	}

	public Map<String, List<Bier>> opzettenOverzichtBierenPerSoort() {
		/* Overzich per soort (vb: blond, donker, onbekend, geuze, tripel. */
		/* Beiden geven het zelfde resultaat. */

		// HashMap - niet gesorteerd -
		// return bieren.stream().collect(Collectors.groupingBy(Bier::getSoort,
		// Collectors.toList()));
		// return bieren.stream().collect(Collectors.groupingBy(Bier::getSoort));

		// TreeMap - gesorteerd -
		return bieren.stream().collect(Collectors.groupingBy(Bier::getSoort, TreeMap::new, Collectors.toList()));

	}

	public Map<String, Long> opzettenAantalBierenPerSoort() {
		/* Tellen hoeveel bieren er zijn per soort. */

		// HashMap of TreeMap maakt niet uit
		// HashMap:
		return bieren.stream().collect(Collectors.groupingBy(Bier::getSoort, TreeMap::new, Collectors.counting()));

		// TreeMap
		// return bieren.stream().collect(Collectors.groupingBy(Bier::getSoort,
		// Collectors.counting()));
	}

	public Map<String, Bier> opzettenOverzichtBierPerNaam() {

		// d.m.v. HashMap
		return bieren.stream().collect(Collectors.toMap(Bier::getNaam, Function.identity()));
	}

}
