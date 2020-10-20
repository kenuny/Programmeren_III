package testen;

import domein.MyQueue;
import exceptions.EmptyListException;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueueGeneriek {

	private MyQueue<String> woordenQueue;

	@BeforeEach
	public void before() {
		woordenQueue = new MyQueue<>("woordenQueue");
	}

	@Test
	public void queueLeeg() {
		Assertions.assertTrue(woordenQueue.isEmpty());
	}

	@Test
	public void woordenToevoegen() {
		woordenQueue.offer("lekker");
		woordenQueue.offer("zijn");
		woordenQueue.offer("wafels");
		Assertions.assertFalse(woordenQueue.isEmpty());
	}

	@Test
	public void woordenDoorElkaarToevoegenVerwijderen() {
		woordenQueue.offer("lekker");
		woordenQueue.offer("zijn");

		Assertions.assertEquals("lekker", woordenQueue.poll());
		woordenQueue.offer("wafels");

		Assertions.assertEquals("zijn", woordenQueue.poll());
		Assertions.assertEquals("wafels", woordenQueue.poll());
		Assertions.assertTrue(woordenQueue.isEmpty());
	}

	@Test
	public void woordenVerwijderen() {
		woordenQueue.offer("wafels");
		woordenQueue.offer("zijn");
		woordenQueue.offer("lekker");
		Assertions.assertFalse(woordenQueue.isEmpty());
		Assertions.assertEquals("wafels", woordenQueue.poll());
		Assertions.assertEquals("zijn", woordenQueue.poll());
		Assertions.assertEquals("lekker", woordenQueue.poll());
		Assertions.assertTrue(woordenQueue.isEmpty());
	}

	@Test
	public void legeQueueElementVerwijderen() {
		Assertions.assertThrows(EmptyListException.class, () -> {
			woordenQueue.poll();
		});
	}

	@Test
	public void toonQueue() {
		woordenQueue.offer("wafels");
		woordenQueue.offer("zijn");
		woordenQueue.offer("lekker");
		String zin = woordenQueue.toString().replaceAll("\\s+", " ").trim();
		Assertions.assertEquals("The woordenQueue is: wafels zijn lekker", zin);
	}

	@Test
	public void toonLegeQueue() {
		String zin = woordenQueue.toString().replaceAll("\\s+", " ").trim();
		Assertions.assertEquals("woordenQueue is empty", zin);
	}
}
