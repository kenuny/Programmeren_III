package ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deitel_BinarySearch_724 {

	public static void main(String[] args) {

		String[] colors = { "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" };
		List<String> list = Arrays.asList(colors);

		Collections.sort(list);
		System.out.println("Sorted list: " + list + "\n");

		printSearchResults(list, "black");
		printSearchResults(list, "red");
		printSearchResults(list, "pink");
		printSearchResults(list, "aqua");
		printSearchResults(list, "gray");
		printSearchResults(list, "teal");

	}

	private static void printSearchResults(List<String> list, String key) {

		System.out.printf("Searching for: %s%n", key);
		int result = Collections.binarySearch(list, key);

		if (result >= 0)
			System.out.printf("Found at index %d%n%n", result);
		else
			System.out.printf("Not Found (%d)%n%n", result);

	}

}
