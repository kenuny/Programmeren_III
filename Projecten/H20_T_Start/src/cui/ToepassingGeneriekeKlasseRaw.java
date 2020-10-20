package cui;

import domein.GeneriekeKlasse;
import domein.GeneriekeKlasseMetUpperBound;
import domein.Student;

public class ToepassingGeneriekeKlasseRaw {

	public static void main(String[] args) 
	{
		GeneriekeKlasse<Student> student1 = new GeneriekeKlasse<>(new Student(20132566,"Janssens","Wendy","Eke"));

		System.out.println(student1.getEersteAttribuut());
		System.out.print(student1.getEersteAttribuut().getStamboeknr());
		
		GeneriekeKlasse<Student> student2 = new GeneriekeKlasse(new Student(20132566,"Janssens","Wendy","Eke"));

		System.out.println(student2.getEersteAttribuut());
		System.out.print(student2.getEersteAttribuut().getStamboeknr());
		
		GeneriekeKlasse student3 = new GeneriekeKlasse<Student>(new Student(20132566,"Janssens","Wendy","Eke"));

		System.out.println(student3.getEersteAttribuut());
		System.out.print(student3.getEersteAttribuut().getStamboeknr());
	}

}
