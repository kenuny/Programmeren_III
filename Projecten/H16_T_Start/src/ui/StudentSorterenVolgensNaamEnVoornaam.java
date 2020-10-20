package ui;

import java.util.Comparator;

import domein.Student;

public class StudentSorterenVolgensNaamEnVoornaam implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int res = o1.getNaam().compareTo(o2.getNaam());

		if (res == 0) {
			res = o1.getVoornaam().compareTo(o2.getVoornaam());
		}

		return res;

	}
}

// negatief --> negatief o2 heeft een grotere ascii code
// positief --> positief o1 is groter dan o2 in ascii code
