package ui;

import domein.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentApplicatieMap {
	public static void main(String[] args) {
		List<Student> lijstStudenten = new ArrayList<>();

		lijstStudenten.add(new Student(20132566, "Janssens", "Wendy", "Eke"));
		lijstStudenten.add(new Student(20132567, "Janssens", "Hans", "Oudenaarde"));
		lijstStudenten.add(new Student(20132563, "Janssens", "Jan", "Gent"));
		lijstStudenten.add(new Student(20132564, "Karels", "Matt", "Gent"));
		lijstStudenten.add(new Student(20132565, "Fransen", "Luc", "Gent"));

		Map<Long, Student> map1 = new HashMap<>();
		// zelf
		for (Student stud : lijstStudenten) {
			map1.put(stud.getStamboeknr(), stud);
		}
		// via streams
		Map<Long, Student> map22 = lijstStudenten.stream()
				.collect(Collectors.toMap(Student::getStamboeknr, Function.identity()));
		// via streams - TreeMap
		Map<Long, Student> map3 = lijstStudenten.stream().collect(Collectors.toMap(Student::getStamboeknr,
				Function.identity(), (oldStudent, newStudent) -> oldStudent, TreeMap::new));
		System.out.println(map3.keySet());

		System.out.println(map1.get(Long.valueOf(20132565)));

		System.out.println(map1.keySet());

		System.out.println(map1.values());

		for (Map.Entry<Long, Student> entry : map1.entrySet()) {
			System.out.printf("%n%d - %s", entry.getKey(), entry.getValue());
		}

		// studenten per woonplaats
		Map<String, List<Student>> map2 = new TreeMap<>();
		String huidigeKey;
		for (Student stud : lijstStudenten) {
			huidigeKey = stud.getWoonplaats();
			if (!map2.containsKey(huidigeKey)) {
				map2.put(huidigeKey, new ArrayList<>());
			}
			map2.get(huidigeKey).add(stud);
		}

		System.out.println("Per woonplaats:");
		for (Map.Entry<String, List<Student>> entry : map2.entrySet()) {
			System.out.printf("%n%s - %s", entry.getKey(), entry.getValue());
		}

		// via streams
		Map<String, List<Student>> map4 = lijstStudenten.stream()
				.collect(Collectors.groupingBy(Student::getWoonplaats, TreeMap::new, Collectors.toList()));
		map4.forEach((key, val) -> System.out.printf("%n%s - %s", key, val));

	}
}
