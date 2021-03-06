package ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Deitel_CollectionTest_709 {

	public static void main(String[] args) {

		/*------Cre�ert array en dynamische lijst met elementen vd array-----*/

		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> list = new ArrayList<>();

		for (String color : colors)
			list.add(color);

		String[] removeColors = { "RED", "WHITE", "BLUE" };
		List<String> removeList = new ArrayList<>();

		for (String color : removeColors)
			removeList.add(color);

		/*-------------Verwijdert removeColers uit de list colors------------*/

		System.out.printf("ArrayList: %n");

		for (String color : list)
			System.out.printf("%s ", color);

		removeColors(list, removeList);

		System.out.printf("%n%nArrayList after remove: %n");

		for (String color : list)
			System.out.printf("%s ", color);

	}

	private static void removeColors(Collection<String> collection, Collection<String> collectionRemove) {

		Iterator<String> it = collection.iterator();

		while (it.hasNext())
			if (collectionRemove.contains(it.next()))
				it.remove();

	}

	/*
	 * Werking Iterator
	 * 
	 * while (it.hasNext()) -> Zolang er nog een object in de collection zit.
	 * it.next() -> is het huidige element waar de pointer naar wijst.
	 */

}
