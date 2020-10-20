package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OefenenVoorTheorie {

	public static void main(String[] args) {


		String[] kleuren = { "wit", "blauw", "groen", "rood", "geel" };
		String[] specialeKleuren = { "zwart", "blauw", "purper", "chilirood", "geel" };
	
		List<String> kleurenlijst = new ArrayList<>(Arrays.asList(kleuren));
		List<String> specialeKleurenLijst = new ArrayList<>(Arrays.asList(specialeKleuren));

		System.out.println(specialeKleurenLijst);
		Collections.addAll(specialeKleurenLijst, kleuren);
		System.out.println(specialeKleurenLijst);
		
		int x = Collections.frequency(specialeKleurenLijst, "blauw");
		System.out.println(x);
		
		boolean a = Collections.disjoint(specialeKleurenLijst, kleurenlijst);
		System.out.println(a);
		System.out.println(specialeKleurenLijst);


		
		
		
	}
}
