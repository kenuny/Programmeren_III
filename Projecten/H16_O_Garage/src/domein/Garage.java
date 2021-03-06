package domein;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

import persistentie.PersistentieController;

public class Garage {

	private final File auto;
	private final File onderhoud;
	private Map<String, Auto> autoMap;
	private Map<String, List<Onderhoud>> autoOnderhoudMap;
	private List<Set<Auto>> overzichtLijstVanAutos;

	private final int AANTAL_OVERZICHTEN = 3;
	private int overzichtteller;

	public Garage(String bestandAuto, String bestandOnderhoud) {
		auto = new File(bestandAuto);
		onderhoud = new File(bestandOnderhoud);
		initGarage();
	}

	private void initGarage() {
		PersistentieController persistentieController = new PersistentieController(auto, onderhoud);

		// Set<Auto> inlezen: STAP 1
		Set<Auto> autoSet = new HashSet<>(persistentieController.geefAutos());
		System.out.println("-- STAP 1 --"); // Tijdelijk om te zien of bovenstaande code
		// werkt.
		autoSet.forEach(System.out::println); // Tijdelijk om te zien of bovenstaande
		// code werkt.

		// Maak map van auto's: volgens nummerplaat: STAP 2
		autoMap = omzettenNaarAutoMap(autoSet);
		System.out.println("\n\n-- STAP 2 --");
		autoMap.forEach((key, value) -> System.out.printf("%s %s%n", key, value)); // Tijdelijk om te zien of
																					// bovenstaande code werkt.

		// Onderhoud inlezen - stap3
		List<Onderhoud> onderhoudLijst = persistentieController.geefOnderhoudVanAutos();
		System.out.println("\n\nSTAP 3 : " + onderhoudLijst);
		onderhoudLijst.forEach(System.out::println); // Tijdelijk om te zien of bovenstaande code werkt.

		// lijst sorteren - stap4
		sorteren(onderhoudLijst);
		System.out.println("\n\n-- STAP 4 --");
		onderhoudLijst.forEach(System.out::println); // Tijdelijk om te zien of bovenstaande code werkt.

		// lijst samenvoegen - stap5
		aangrenzendePeriodenSamenvoegen(onderhoudLijst);
		System.out.println("\n\n-- STAP 5 --");
		onderhoudLijst.forEach(System.out::println);

		// Maak map van onderhoud: volgens nummerplaat - stap6
		autoOnderhoudMap = omzettenNaarOnderhoudMap(onderhoudLijst);
		System.out.println("\n\n-- STAP 6 --");
		autoOnderhoudMap.forEach((key, value) -> System.out.printf("%s%s\n", key, value));

		// Maak overzicht: set van auto's - stap7
		overzichtLijstVanAutos = maakOverzicht(autoOnderhoudMap);
		System.out.println("\n\nSTAP 7");
		overzichtLijstVanAutos.forEach(System.out::println);
	}

	// Maak map van auto's: volgens nummerplaat. STAP 2
	private Map<String, Auto> omzettenNaarAutoMap(Set<Auto> autoSet) {
		return autoSet.stream().collect(Collectors.toMap(Auto::getNummerplaat, Function.identity()));

		// Methode 2: return
		// autoSet.stream().collect(Collectors.toMap(Auto::getNummerplaat, auto ->
		// auto));
	}

	// lijst sorteren - STAP 4
	private void sorteren(List<Onderhoud> lijstOnderhoud) {
		lijstOnderhoud.sort(Comparator.comparing(Onderhoud::getNummerplaat).thenComparing(Onderhoud::getBegindatum));
	}

	// lijst samenvoegen - STAP 5
	private void aangrenzendePeriodenSamenvoegen(List<Onderhoud> lijstOnderhoud) {

		// java 7
		Iterator<Onderhoud> it = lijstOnderhoud.iterator();
		Onderhoud onderhoud = null;
		Onderhoud onderhoudNext = null;

		while (it.hasNext()) {
			onderhoud = onderhoudNext;
			onderhoudNext = it.next();

			if (onderhoud != null && onderhoud.getNummerplaat().equals(onderhoudNext.getNummerplaat())) {
				if (onderhoud.getEinddatum().plusDays(1).equals(onderhoudNext.getBegindatum())) {
					onderhoud.setEinddatum(onderhoudNext.getEinddatum());
					it.remove();
				}
			}

		}

		if (onderhoud.getEinddatum().plusDays(1).equals(onderhoudNext.getBegindatum())) {// samenvoegen:

		}

	}

	// Maak map van onderhoud: volgens nummerplaat - stap6
	private Map<String, List<Onderhoud>> omzettenNaarOnderhoudMap(List<Onderhoud> onderhoudLijst) {
		return onderhoudLijst.stream().collect(Collectors.groupingBy(Onderhoud::getNummerplaat));
	}

	// Hulpmethode - nodig voor stap 7
	private int sizeToCategorie(int size) {
		switch (size) {
		case 0:
			break;
		case 1:
			return 0;
		case 2:
		case 3:
			return 1;
		default:
			return 2;
		}
		return 0;
	}

	// Java 14 (werkt niet)
//	private int sizeToCategorie(int size) {
//		return switch(size) {
//			case 0, 1 -> 0;
//			case 2, 3 -> 1;
//			default -> 2;
//		};
//	}

	// Maak overzicht: set van auto's - stap7
	private List<Set<Auto>> maakOverzicht(Map<String, List<Onderhoud>> autoOnderhoudMap) {
		// Hint:
		// van Map<String, List<Onderhoud>>
		// naar Map<Integer, Set<Auto>> (hulpmethode gebruiken)
		// naar List<Set<Auto>>

//				return autoOnderhoudMap.entrySet().stream().collect(Collectors.groupingBy(entry -> sizeToCategorie(entry.getValue().size()), TreeMap::new, 
//						Collectors.mapping(entry -> autoMap.get(entry.getKey()), Collectors.toSet())));

//		return autoOnderhoudMap.entrySet()
//							   .stream()
//							   .collect(Collectors.groupingBy(entry -> sizeToCategorie(entry.get)) //
		return null;
	}

//Oefening DomeinController:
	public String autoMap_ToString() {
		String result = autoMap.values().stream().sorted(Comparator.comparing(Auto::getNummerplaat)).map(Auto::toString)
				.collect(Collectors.joining("\n"));
		return result;
	}

	public String autoOnderhoudMap_ToString() {
		String result = autoOnderhoudMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.map(e -> String.format("%s:%n%s", e.getKey(),
						e.getValue().stream().map(Onderhoud::toString).collect(Collectors.joining("\n"))))
				.collect(Collectors.joining("\n"));

		return result;

//		// Tweede manier:
//		 String res = autoOnderhoudMap.entrySet()
//		 .stream()
//		 .sorted(Comparator.comparing(Map.Entry::getKey)).sorted(x.)
	}

	public String overzicht_ToString() {
		overzichtteller = 1;
		String result = overzichtLijstVanAutos.stream()
				.map(setAuto -> String.format("%d%n%s", overzichtteller++,
						setAuto.stream().map(Auto::toString).collect(Collectors.joining("\n"))))
				.collect(Collectors.joining("\n"));
		return result;
	}

}
