package domein;

import java.util.List;

import java.io.File;

import persistentie.PersistentieController;

public class DomeinController {

	private PersistentieController pc = new PersistentieController();

	public void persisteerBierGegevensAlsObject(String tekstFileNaam, String objectFileNaam) {
		List<Bier> listBier = pc.leesBieren(new File(tekstFileNaam));
		
		
		MyListIterable<Bier> myList = new MyListIterable<>();
		listBier.forEach(bier -> myList.insertAtBack(bier));
		
		pc.persisteerObject(myList, new File(objectFileNaam));
	}

}
