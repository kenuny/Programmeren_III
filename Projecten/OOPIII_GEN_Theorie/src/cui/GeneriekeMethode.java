package cui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneriekeMethode {

	public static void main(String[] args) 
	{
		String[] kleuren = {"zwart","wit"};
		Integer[] getallen = {1,2,3};
		weergevenLijst("zwart wit", new ArrayList<String>(List.of(kleuren)));
		weergevenLijst("1 2 3", new ArrayList<Integer>(Arrays.asList(getallen)));
	}

	public static <E> void weergevenLijst(String oplossing, List<E> list) 
	//E is GEEN primitief datatype => type wrapper klasse gebruiken!
	//<E> type-parametersectie
	{
		System.out.printf("%s%n", oplossing);
		list.forEach(e -> System.out.printf("%s ", e));
		System.out.println("\n");
	}

}
