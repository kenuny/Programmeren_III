// Deze klasse wordt gebruikt voor OefAlgoritme (eerste script in Kava 7)
package ui;

import java.util.Comparator;

public class BoekComparator implements Comparator<Boek>{

	@Override
	public int compare(Boek boek1, Boek boek2) {
		int boekCompare = boek1.getTitel().compareTo(boek2.getTitel());
		if(boekCompare != 0)
			return boekCompare;
		
		return Long.compare(boek2.getIsbn_nr(), boek1.getIsbn_nr());
		
	}
}
