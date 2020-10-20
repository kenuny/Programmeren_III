package ui;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Deitel_UsingToArray_715 {

	public static void main(String[] args) {
		
		/*
		 * Maakt een array en linkedlist aan. 
		 * Array wordt doorgegeven aan de linkedlist. Arrays.asList(array).
		 * Vervolgens elementen toevoegen aan de lijst.
		 * Lijst terug omzetten naar array en printen.
		 * 
		 */

		String[] colors = { "black", "blue", "yellow" };
		LinkedList<String> kleurenlijst = new LinkedList<>(Arrays.asList(colors));
		
		kleurenlijst.addLast("red");
		kleurenlijst.add("pink");
		kleurenlijst.add(3, "green");
		kleurenlijst.addFirst("cyan");
		
		colors = kleurenlijst.toArray(new String[kleurenlijst.size()]);
	
		System.out.println("Kleuren toegevoegd aan linkedList en vervolgens omgezet naar array: ");
		
		System.out.println(Arrays.toString(colors));
	
	}
}
