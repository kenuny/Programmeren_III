package cui;

import domein.GeneriekeKlasseMetUpperBound;

public class ToepassingGeneriekeKlasseMetUpperBound {

	public static void main(String[] args) 
	{
		//GeneriekeKlasseMetUpperBound<String> genKlasse1 = new GeneriekeKlasseMetUpperBound<>("Hallo");
		GeneriekeKlasseMetUpperBound<Double> genKlasse2 = new GeneriekeKlasseMetUpperBound<>(5.6);
		//GeneriekeKlasseMetUpperBound<Student> genKlasse3 = new GeneriekeKlasseMetUpperBound<>(new Student(20132566,"Janssens","Wendy","Eke"));

		//System.out.println(genKlasse1.getEersteAttribuut());
		System.out.println(genKlasse2.getEersteAttribuut());
		//System.out.println(genKlasse3.getEersteAttribuut());
	}

}
