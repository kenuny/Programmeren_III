package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import domein.Student;

public class StudentApplicatieMap {
	public static void main(String[] args) {
		List<Student> lijstStudenten = new ArrayList<>();

		lijstStudenten.add(new Student(20132566, "Janssens", "Wendy", "Eke"));
		lijstStudenten.add(new Student(20132567, "Janssens", "Hans", "Oudenaarde"));
		lijstStudenten.add(new Student(20132563, "Janssens", "Jan", "Gent"));
		lijstStudenten.add(new Student(20132564, "Karels", "Matt", "Gent"));
		lijstStudenten.add(new Student(20132565, "Fransen", "Luc", "Gent"));

		System.out.println("lijst van studenten: \n" + lijstStudenten + "\n");

		/*
		 * Elementen van de ArrayList in een HashMap plaatsen.
		 */

		Map<Long, Student> map1 = new HashMap<>();

		for (Student st : lijstStudenten) {
			map1.put(st.getStamboeknr(), st);
		}

		Map<Long, Student> map2 = lijstStudenten.stream()
				.collect(Collectors.toMap(Student::getStamboeknr, Function.identity()));

		/*
		 * 1. Waarde uit de map halen. 2. Alle sleutels uit de map halen. 3. Alle values
		 * uit de map halen. 4. Alle KVP's uit de map halen.
		 */

		// 1:
		System.out.println("waarde: " + map1.get(Long.valueOf(20132566)) + "\n");

		// 2:
		System.out.println("sleutels: " + map1.keySet() + "\n");

		// 3:
		System.out.println("waarden: " + map1.values() + "\n");

		// 4:
		for (Map.Entry<Long, Student> entry : map1.entrySet()) {

			// entry.setValue(new Student(20131245, "De Smet", "Elias", "Gent"));
			// System.out.printf("%n%d - %s", entry.getKey(), entry.getValue());
		}

		/*
		 * Overzicht per woonplaats
		 * 
		 * Wanneer je het woordje per zie kan je gebruik maken van groupingBy.
		 * groupingBy komt zeker op het examen. 1: HashMap 2: TreeMap
		 */

		// 1: HashMap
		Map<String, List<Student>> map4 = lijstStudenten.stream()
				.collect(Collectors.groupingBy(Student::getWoonplaats));

		System.out.println("Overzicht Per Woonplaats: HashMap()\n" + map4 + "\n");

		// 2: TreeMap
		Map<String, List<Student>> map5 = lijstStudenten.stream()
				.collect(Collectors.groupingBy(Student::getWoonplaats, TreeMap::new, Collectors.toList()));

		System.out.println("Overzicht Per Woonplaats: TreeMap()\n" + map5 + "\n");

	}

}
