package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InleidingDoorlopenCollectie {

	public static void main(String[] args) {
		List<String> woorden = new ArrayList<>();
		woorden.add("Eerste");
		woorden.add("Tweede");
		woorden.add("Derde");
		woorden.add("Eerste");
		woorden.add("Tweede");
		woorden.add("Derde");
		woorden.add("\n");
		
		
		// array = .length
		// lijst = .size
		
		for (int i = 0; i < woorden.size(); i++)
			System.out.println(woorden.get(i));
		
		// Effici�nter dan standard forlus omdat hier een iterable wordt ge�mplementeerd. 
		for (String elem : woorden) 
			System.out.println(elem);
		
		// Onderstaande is hetzelfde als enhanced for.
		// plaatst een pointer net voor het eerste element. 
		Iterator<String> it = woorden.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
		// enhanced for kan enkel lezen Onderstaande code compileert een fout
//		for (String elem : woorden)
//			if (elem.equals(elem))
//				woorden.remove(elem);
		
		// oplossing op bovenstaande fout
		while(it.hasNext()) {
			String s = it.next();
			if (s.equals("Derde"))
				it.remove();
		}
		
		// Overlopen --gebruik--> enhanced for
		// overlopen en verwijderen --gebruik--> Iterator (bij alles)
		// Overlopen + positie bepalen + toevoegen en verwijderen --gebruik--> ListIterator (enkel bij lijsten)
		
			
		// lamba's
		System.out.println("lambda's \n\n");
		
		woorden.forEach(elem -> System.out.println(elem));
		woorden.forEach(System.out::println);
		
		// linked list geschikt toevoegen en verwijderen.
		// arraylist is goed om elementen op te zoeken.
	}
}