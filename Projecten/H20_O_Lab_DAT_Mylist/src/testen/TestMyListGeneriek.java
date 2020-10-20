package testen;

import domein.MyList;
import exceptions.EmptyListException;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMyListGeneriek {

	private MyList<String> woordenLijst;

	@BeforeEach
	public void before() {
		woordenLijst = new MyList<>("woordenlijst");
	}

	@Test
	public void lijstLeeg() {
		Assertions.assertTrue(woordenLijst.isEmpty());

	}

	@Test
	public void woordenVooraanToevoegen() {
		woordenLijst.insertAtFront("lekker");
		woordenLijst.insertAtFront("zijn");
		woordenLijst.insertAtFront("wafels");

		Assertions.assertFalse(woordenLijst.isEmpty());
	}

	@Test
	public void woordToevoegenVerwijderen() {
		woordenLijst.insertAtFront("wafels");
		Assertions.assertEquals("wafels", woordenLijst.removeFromFront());
		Assertions.assertTrue(woordenLijst.isEmpty());

		woordenLijst.insertAtBack("zijn");
		Assertions.assertEquals("zijn", woordenLijst.removeFromFront());
		Assertions.assertTrue(woordenLijst.isEmpty());

		woordenLijst.insertAtBack("zeer");
		Assertions.assertEquals("zeer", woordenLijst.removeFromFront());
		Assertions.assertTrue(woordenLijst.isEmpty());

		woordenLijst.insertAtFront("lekker");
		Assertions.assertEquals("lekker", woordenLijst.removeFromFront());
		Assertions.assertTrue(woordenLijst.isEmpty());
	}

	@Test
	public void woordenAchteraanToevoegen() {
		woordenLijst.insertAtBack("wafels");
		woordenLijst.insertAtBack("zijn");
		woordenLijst.insertAtBack("lekker");

		Assertions.assertFalse(woordenLijst.isEmpty());
	}

	@Test
	public void woordenDoorElkaarToevoegenVerwijderen() {
		woordenLijst.insertAtFront("zijn");
		woordenLijst.insertAtBack("zeer");
		woordenLijst.insertAtBack("lekker");
		woordenLijst.insertAtFront("wafels");

		Assertions.assertFalse(woordenLijst.isEmpty());

		Assertions.assertEquals("wafels", woordenLijst.removeFromFront());
		Assertions.assertEquals("zijn", woordenLijst.removeFromFront());

		woordenLijst.insertAtBack("einde");

		Assertions.assertEquals("zeer", woordenLijst.removeFromFront());
		Assertions.assertEquals("lekker", woordenLijst.removeFromFront());

		woordenLijst.insertAtFront("begin");

		Assertions.assertEquals("begin", woordenLijst.removeFromFront());
		Assertions.assertEquals("einde", woordenLijst.removeFromFront());

		Assertions.assertTrue(woordenLijst.isEmpty());
	}

	@Test
	public void woordenVerwijderen() {
		woordenLijst.insertAtFront("lekker");
		woordenLijst.insertAtFront("zijn");
		woordenLijst.insertAtFront("wafels");
		Assertions.assertFalse(woordenLijst.isEmpty());
		Assertions.assertEquals("wafels", woordenLijst.removeFromFront());
		Assertions.assertEquals("zijn", woordenLijst.removeFromFront());
		Assertions.assertEquals("lekker", woordenLijst.removeFromFront());
		Assertions.assertTrue(woordenLijst.isEmpty());
	}

	@Test
	public void legeLijstElementVerwijderen() {
		Assertions.assertThrows(EmptyListException.class, () -> {
			woordenLijst.removeFromFront();
		});
	}

	@Test
	public void toonLijst() {
		woordenLijst.insertAtFront("lekker");
		woordenLijst.insertAtFront("zijn");
		woordenLijst.insertAtFront("wafels");
		String zin = woordenLijst.toString().replaceAll("\\s+", " ").trim();
		Assertions.assertEquals("The woordenlijst is: wafels zijn lekker", zin);
	}

	@Test
	public void toonLegeLijst() {
		String zin = woordenLijst.toString().replaceAll("\\s+", " ").trim();
		Assertions.assertEquals("woordenlijst is empty", zin);
	}

}
