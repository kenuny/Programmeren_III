package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class InleidingDoorlopenCollectie_start {
	public static void main(String[] args) {
		List<String> woorden = new LinkedList<>();
		woorden.add("Eerste");
		woorden.add("Tweede");
		woorden.add("Derde");
		woorden.add("Eerste");
		woorden.add("Tweede");
		woorden.add("Derde");

//        for(int i = 0 ; i < woorden.size() ; i++)
//        	System.out.println(woorden.get(i));
//        for(String s : woorden)
//        	System.out.println(s); //werkt met iterator

//        Iterator<String> iterator = woorden.iterator();
//        while(iterator.hasNext())
//        {
//        	String woord = iterator.next();
//        	System.out.println(woord);
//        }

//        for(String s : woorden)
//        {
//        	if(s.equals("Derde"))
//        		woorden.remove(s);
//        }

//		Iterator<String> iterator = woorden.iterator();
//		while (iterator.hasNext()) {
//			String woord = iterator.next();
//			if(woord.equals("Derde"))
//				iterator.remove();
//		}
//		for(String s : woorden)
//        	System.out.println(s);

		ListIterator<String> iterator = woorden.listIterator();
		while (iterator.hasNext()) {
			String woord = iterator.next();
			if (woord.equals("Tweede"))
				iterator.add("Derde");
		}
		for (String s : woorden)
			System.out.println(s);

		ListIterator<String> iterator2 = woorden.listIterator(woorden.size());
		while (iterator2.hasPrevious()) {
			String woord = iterator2.previous();
			System.out.println(woord);
		}

	}

}
