package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OefenenVoorTheorie {

	public static void main(String[] args) {

		String[] kleuren = { "wit", "blauw", "groen", "rood", "geel" };
//		String[] specialeKleuren = { "zwart", "blauw", "purper", "chilirood", "geel" };
//		
//		List<String> kleurenlijst = new ArrayList<>(Arrays.asList(kleuren));
//		List<String> specialeKleurenLijst = new ArrayList<>(Arrays.asList(specialeKleuren));
//
//		
//		
//		System.out.println(kleurenlijst);

		LinkedList<String> ll = new LinkedList<>(Arrays.asList(kleuren));

		LinkedList<String> llCopy = new LinkedList<>();

		llCopy = (LinkedList) ll.clone();

		System.out.println(llCopy + "a");

	}
}
