package ui;

import java.util.*;
import java.util.stream.Collectors;

public class OefLinkedList_opgave {

	public OefLinkedList_opgave() {

		Integer getallen[] = { 4, 3, 9, 7 };

		List<Integer> arrayList = new ArrayList<>(Arrays.asList(getallen));
		List<Integer> lijstInteger = new LinkedList<>(arrayList);

		weergevenLijst("oplossing: 4 3 9 7", lijstInteger);

		metEenVerhogen(lijstInteger);
		weergevenLijst("oplossing: 5 4 10 8", lijstInteger);

		lijstInteger = metEenVerhogen_java8(lijstInteger);
		weergevenLijst("oplossing: 6 5 11 9", lijstInteger);

		String woorden[] = { "aaa", "bbb", "ccc" };

		List<String> lijstString = new LinkedList<>(Arrays.asList(woorden));

		weergevenLijst("oplossing: aaa bbb ccc", lijstString);

		weergevenLijstOmgekeerdeVolgorde("oplossing: ccc bbb aaa", lijstString);

	}

	public void metEenVerhogen(List<Integer> lijst) // ------------
	{
		// Alle elementen van de lijst met 1 verhogen (wijzigen).
		// JAVA 7:
		
		// ListIterator<Integer> it = lijst.listIterator();
		//
		// while (it.hasNext()) {
		//	int getal = it.next();
		//	it.set(getal + 1);
		// }

		// JAVA 8:
		lijst.replaceAll(g -> g+1);
	}

	public List<Integer> metEenVerhogen_java8(List<Integer> lijst) {
		// Elementen worden met één verhoogd en lijst wordt teruggegeven.

		// JAVA 8:
		return lijst.stream().map(e -> e + 1).collect(Collectors.toList());
	}

	// generieke methode:
	public <E> void weergevenLijst(String oplossing, Collection<E> lijst) {
		System.out.printf("%s%n%s", oplossing, "           ");

		for (E e : lijst)
			System.out.printf("%s", e);

		// JAVA 8:
		// lijst.forEach(e -> System.out::printf);

		System.out.println();
	}

	// generieke methode:
	public <E> void weergevenLijstOmgekeerdeVolgorde(String oplossing, List<E> lijst) {

		System.out.printf("%s%n%s", oplossing, "           ");
		// JAVA 7:
		ListIterator<E> it = lijst.listIterator(lijst.size()); // plaatst pointer op einde.

		while (it.hasPrevious())
			System.out.printf("%s", it.previous());
		System.out.println();

		System.out.println("java 8 lijst omgekeerde volgorde: ");
		System.out.printf("%s%n%s", oplossing, "           ");

		// JAVA8:
		new LinkedList<>(lijst).descendingIterator().forEachRemaining(e -> System.out.printf("%s", e));

		System.out.println();
	}

	public static void main(String args[]) {
		new OefLinkedList_opgave();
	}
}
