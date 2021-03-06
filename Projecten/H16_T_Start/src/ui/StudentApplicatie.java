package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import domein.Student;

public class StudentApplicatie {

	public static void main(String[] args) {

		/*
		 * ArrayList: geschikt wanneer elementen vaak worden opgezocht of achteraan
		 * toegevoegd. LinkedList: geschikt wanneer elementen vaak worden tussengevoegd
		 * of verwijderd.
		 * 
		 * Grootte van een lijst: size(). Grootte van een array: length().
		 * 
		 * natuurlijke sortering: list.sort(null)
		 * 
		 */
		List<Student> lijstStudenten = new ArrayList<>();

		lijstStudenten.add(new Student(20132566, "Janssens", "Wendy", "Eke"));
		lijstStudenten.add(new Student(20132567, "Janssens", "Hans", "Oudenaarde"));
		lijstStudenten.add(new Student(20132563, "Janssens", "Jan", "Gent"));
		lijstStudenten.add(new Student(20132564, "Karels", "Matt", "Gent"));
		lijstStudenten.add(new Student(20132565, "Fransen", "Luc", "Gent"));

		System.out.println(lijstStudenten);

		System.out.println("");

		Collections.sort(lijstStudenten, new StudentSorterenVolgensNaamEnVoornaam());
		System.out.println("gesorteerd (comparator: naam): " + lijstStudenten);

		System.out.println("");

		Collections.sort(lijstStudenten);
		System.out.println("gesorteerd: (automatisch: key) " + lijstStudenten);

		lijstStudenten.sort(null);
	}
}