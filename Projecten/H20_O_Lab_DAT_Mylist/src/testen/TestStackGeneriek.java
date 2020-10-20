package testen;

import domein.MyStack;
import exceptions.EmptyListException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStackGeneriek {

	private MyStack<String> woordenStack;

	@BeforeEach
	public void before() {
		woordenStack = new MyStack<>("woordenStack");
	}

	@Test
	public void stackLeeg() {
		Assertions.assertTrue(woordenStack.isEmpty());
	}

	@Test
	public void woordenToevoegen() {
		woordenStack.push("lekker");
		woordenStack.push("zijn");
		woordenStack.push("wafels");
		Assertions.assertFalse(woordenStack.isEmpty());
	}

	@Test
	public void woordenDoorElkaarToevoegenVerwijderen() {
		woordenStack.push("lekker");
		woordenStack.push("zijn");

		Assertions.assertEquals("zijn", woordenStack.pop());
		woordenStack.push("wafels");

		Assertions.assertEquals("wafels", woordenStack.pop());
		Assertions.assertEquals("lekker", woordenStack.pop());
		Assertions.assertTrue(woordenStack.isEmpty());
	}

	@Test
	public void woordenVerwijderen() {
		woordenStack.push("lekker");
		woordenStack.push("zijn");
		woordenStack.push("wafels");
		Assertions.assertFalse(woordenStack.isEmpty());
		Assertions.assertEquals("wafels", woordenStack.pop());
		Assertions.assertEquals("zijn", woordenStack.pop());
		Assertions.assertEquals("lekker", woordenStack.pop());
		Assertions.assertTrue(woordenStack.isEmpty());
	}

	@Test
	public void legeStackElementVerwijderen() {
		Assertions.assertThrows(EmptyListException.class, () -> {
			woordenStack.pop();
		});
	}

	@Test
	public void toonStack() {
		woordenStack.push("lekker");
		woordenStack.push("zijn");
		woordenStack.push("wafels");
		String zin = woordenStack.toString().replaceAll("\\s+", " ").trim();
		Assertions.assertEquals("The woordenStack is: wafels zijn lekker", zin);
	}

	@Test
	public void toonLegeStack() {
		String zin = woordenStack.toString().replaceAll("\\s+", " ").trim();
		Assertions.assertEquals("woordenStack is empty", zin);
	}
}
