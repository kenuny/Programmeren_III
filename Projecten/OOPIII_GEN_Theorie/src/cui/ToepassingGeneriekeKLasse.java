package cui;

import domein.GeneriekeKlasse;
import domein.Student;

public class ToepassingGeneriekeKlasse {

	public static void main(String[] args) 
	{
		GeneriekeKlasse<String> genKlasse1 = new GeneriekeKlasse<>("Hallo");
		GeneriekeKlasse<Double> genKlasse2 = new GeneriekeKlasse<>(5.6);
		GeneriekeKlasse<Student> genKlasse3 = new GeneriekeKlasse<>(new Student(20132566,"Janssens","Wendy","Eke"));
		
		System.out.println(genKlasse1.getEersteAttribuut());
		System.out.println(genKlasse2.getEersteAttribuut());
		System.out.println(genKlasse3.getEersteAttribuut());
	}

}
