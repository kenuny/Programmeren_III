package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class CollectionOperaties {
    

	public static boolean verwijderOpLetter(Collection<String> c, char letter){ // boolean kan ook void zijn
		// JAVA 7:
		boolean changed = false;
		Iterator<String> it = c.iterator();
		
		while(it.hasNext()) {
			if (it.next().charAt(0) == letter) {
				it.remove();
				changed = true; // niet echt nodig
			}
		}
		
		// JAVA 8: 
		// return c.removeIf(e -> e.charAt(0) == letter);
		
		
		return false;
	}

    //methode verwijderSequence
    //-------------------------
	// Zoek het eerste voorkomen van kiwi, zoek het laatste voorkomen van kiwi
	// hetgeene ertussenstaat moet verwijdert worden --> hiervoor subist gebruiken (start, end).clear()
	
	public static boolean verwijderSequence(List<String> list, String limit) {
		int first = list.indexOf(limit);
		int last = list.lastIndexOf(limit);
		
		if (first == -1) {
			return false;
		} else {
			list.subList(first, last+1).clear();
			return true;
		}
	}
	
	// BINARY SEARCH
		// je krijgt een negatief getal terug maw het zit niet in de lijst vervolgns absolute waarde -1
		// Indien positief zit het al in de lijst.
	public static boolean addOrder(List<String> list, String keyFruitSoort) {
		int index = Collections.binarySearch(list, keyFruitSoort);
		if (index >= 0) {
			return false;
		}
		
		list.add(((index * -1)-1), keyFruitSoort);
		
		return true;
	}
	
}

public class OefFruit2_opgave {

    public static void main(String args[]) {
        String kist[][] = {{"appel", "peer", "citroen", "kiwi", "perzik"},
        {"banaan", "mango", "citroen", "kiwi", "zespri", "pruim"},
        {"peche", "lichi", "kriek", "kers", "papaya"}};

        
        String mand[];

        System.out.println(Arrays.deepToString(kist)); // om de array af te printen

        List<String> list = new ArrayList<>();
        
        // Java 7: enhanced-for
        // for (String[] eenKist : kist) {
		//	list.addAll(Arrays.asList(eenKist));
		//}
        
        // Java 8: overlopen d.m.v. stream
        // Arrays.stream(kist).forEach(eenKist -> list.addAll(Arrays.asList(eenKist)));
        
        // Java 8: manier 2
        // list = Arrays.stream(kist)
        //			 .flatMap(Arrays::stream)
        //			 .collect(Collectors.toList());
        
        
        mand = list.toArray(new String[list.size()]);
        Arrays.sort(mand);
        System.out.println(Arrays.toString(mand));
        
        CollectionOperaties.verwijderOpLetter(list, 'p');
        System.out.println("na verwijder letter ('p') :  " + list + "\n");

        CollectionOperaties.verwijderSequence(list, "kiwi");
        System.out.println("na verwijder sequence (kiwi) : " + list + "\n");

//Plaats het resultaat terug in een array mand en sorteer die oplopend.
//---------------------------------------------------------------------
        // in comment
//        mand = list.toArray(new String[list.size()]);
//        Arrays.sort(mand);

        

        System.out.println(list);

//Geef de inhoud van de array "mand" terug
//----------------------------------------
        System.out.println(Arrays.toString(mand));

        // JAVA 8:
         list.sort(null);
         CollectionOperaties.addOrder(list, "sapodilla");
        System.out.println(list);

    }
}
