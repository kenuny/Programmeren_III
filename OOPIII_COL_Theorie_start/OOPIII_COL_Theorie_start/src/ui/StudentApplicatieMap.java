package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import domein.Student;

public class StudentApplicatieMap {
	public static void main(String[] args) {
		List<Student> lijstStudenten = new ArrayList<>();

		lijstStudenten.add(new Student(20132566, "Janssens", "Wendy", "Eke"));
		lijstStudenten.add(new Student(20132567, "Janssens", "Hans", "Oudenaarde"));
		lijstStudenten.add(new Student(20132563, "Janssens", "Jan", "Gent"));
		lijstStudenten.add(new Student(20132564, "Karels", "Matt", "Gent"));
		lijstStudenten.add(new Student(20132565, "Fransen", "Luc", "Gent"));

		System.out.println(lijstStudenten);

		// per stamboeknr de student
		// HashMap sleutels zijn niet gesorteerd
		// Via put() plaats je koppels in de map.
		Map<Long, Student> map1 = new HashMap<>();

		for (Student st : lijstStudenten) {
			map1.put(st.getStamboeknr(), st);
		}

		// System.out.println(map1);

		// Een waarde uit de map halen via get()
		System.out.println(map1.get(Long.valueOf(20132566)));

		// geeft enkel de sleutels terug (uniek)
		System.out.println("sleutels: " + map1.keySet());

		// geeft enkel de waarden terug
		System.out.println("waarden: " + map1.values());

		// geeft de verzameling van kopels terug.
		System.out.println("\n\n");
		for (Map.Entry<Long, Student> entry : map1.entrySet()) {

			// entry.setValue(new Student(20131245, "De Smet", "Elias", "Gent"));
			// System.out.printf("%n%d - %s", entry.getKey(), entry.getValue());
		}

		// Overzicht per woonplaats
		Map<String, List<Student>> map2 = new TreeMap<>();

		String huidigeKey = "";
		for (Student s : lijstStudenten) {
			huidigeKey = s.getWoonplaats();

			// Enkel de eerste keer moet er een nieuwe ArrayList aangemaakt worden.
			if (!map2.containsKey(huidigeKey)) {
				map2.put(huidigeKey, new ArrayList<>());
			}

			map2.get(huidigeKey).add(s);
		}

		for (Map.Entry<String, List<Student>> entry : map2.entrySet()) {

			System.out.printf("%n%s - %s", entry.getKey(), entry.getValue());
		}

	}
}
