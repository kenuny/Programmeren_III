package ui;

import java.util.PriorityQueue;
import java.util.Queue;

public class Deitel_PriorityQueue_728 {

	public static void main(String[] args) {

		/*
		 * priorityQueue --> werkt volgens natuurlijke ordening voorbeeld ziekenhuis -->
		 * hoogste prioriteit krijgt voorang niet FIFO!
		 * 
		 * - offer: is toevoegen - poll: is verwijderen - peek: toont bovenste element
		 * 
		 * offer 1: | | | | | | | | | 1 | -- offer 2: | | | | | | | | 1 | 2 | poll: | |
		 * | | | | | | 1 | 2 | -- 1 verwijdert -- | | | | | | | | | 2 | peek: | | | | |
		 * | | | 1 | 2 | --> peek() = 1
		 * 
		 */

		Queue<Double> queue = new PriorityQueue<>();

		queue.offer(3.2);
		queue.offer(5.4);
		queue.offer(9.8);

		System.out.println("Polling from queue: ");

		while (queue.size() > 0) {
			System.out.printf("%.1f%n", queue.peek());
			queue.poll();
		}

	}

}
