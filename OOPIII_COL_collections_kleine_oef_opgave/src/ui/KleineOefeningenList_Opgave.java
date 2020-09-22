package ui;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class KleineOefeningenList_Opgave {

	private static final String COLORS[] = { "red", "white", "blue" };

	private List<String> list;
	private List<String> list2;

	public KleineOefeningenList_Opgave() {

		// Array omgezet naar list en meegegeven.
		list = new ArrayList<>(Arrays.asList(COLORS));
		weergevenLijst("oplossing: red white blue ", list);

		// lege arraylist en opvullen via addAll
		list2 = new ArrayList<>();
		list2.addAll(list);

		naarHoofdletterOmzetten(list);
		weergevenLijst("oplossing: alle elementen van list in hoofdletters", list);

		list = naarKleineLettersOmzetten(list);
		weergevenLijst("oplossing: alle elementen van list in kleine letters", list);

	} // end constructor

	public <E> void weergevenLijst(String oplossing, List<E> list) {
		// Geef alle elementen van de List weer (laat een spatie tussen elk element).
		// Gebruik printf*/
		// List<String> veranderen door E typeparametersectie voor de teruggeefwaarde
		// plaatsen
		// --------------------------------------------------------------------------

		System.out.printf("%s%n%s", oplossing, "           ");

		for (E e : list)
			System.out.printf("%s", e);
		System.out.println("\n");

		// Initieel
		// public * void weerg...(String oplossing, List<*String> ..)
		// for(*String ..

		// of met lambda
		list.forEach(e -> System.out.printf("%s", e));

	}

	public void naarHoofdletterOmzetten(List<String> list) {
		// Alle strings van list worden omgezet naar hoofdletters
		// -------------------------------------------------------------
		
		// JAVA 7:
		ListIterator<String> iterator = list.listIterator();
		
		while (iterator.hasNext()) { 
			String woord = iterator.next();
			iterator.set(woord.toUpperCase());
		}

		// JAVA 8:
		// list.replaceAll(w -> w.toUpperCase());
		list.replaceAll(String::toUpperCase);
		
		
	}

	public List<String> naarKleineLettersOmzetten(List<String> list) {
		
		// JAVA 8:
		// stream overloopt elk element in list
		// map gaat dan elk element in kleine letter plaatsen
		// collector zorgt er dan voor dat al de elementen terug in de lijst zitten.
		
		return list.stream()
				   .map(w -> w.toLowerCase())
				   .collect(Collectors.toList());
	}

	public static void main(String args[]) {
		new KleineOefeningenList_Opgave();
	}

} // end class KleineOefeningenList_Opgave

// comments

//declareer list en list2 van type List. De collections zullen Strings bijhouden
// Cre�er arrayList list en vul op met { "red", "white", "blue" }  (= 1 instructie)
// Cre�er een tweede lege arrayList (list2)
// alle elementen van list kopieren naar een tweede arrayList list2 (= 1
// instructie)
////De strings van list worden omgezet naar kleine letters en worden
// als nieuwe List<String> teruggegeven.
// -------------------------------------------------------------
