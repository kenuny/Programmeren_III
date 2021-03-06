package ui;

import java.util.Arrays;

public class Deitel_ArrayManipulations_351 {

	public static void main(String[] args) {

		boodschap("Declareert een array van doubles: doubleArray:");
		double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		printArrayD(doubleArray);

		boodschap("Sorteerd de Array:  ");
		Arrays.sort(doubleArray);
		printArrayD(doubleArray);

		boodschap("Declareert een array van 10 elementen groot en vult elk element met de waarde 7:");
		int[] filledInArray = new int[10];
		Arrays.fill(filledInArray, 1);
		Arrays.fill(filledInArray, 7); // Overschrijft elk element met de waarde 7
		printArrayI(filledInArray);

		/*
		 * Twee manieren om een copy te maken van een array:
		 * 
		 * Manier1: Met behulp van de Klasse Arrays. Methode:
		 * Arrays.copyOf(teKopi�renArray, aantalElementenKopi�ren)
		 * 
		 * Manier2: Met behulp van de Klasse System. Methode:
		 * System.arraycopy(toKopi�renArray, startpositie kopi�ren, naarKopi�renArray,
		 * startpositie plakken, aantalElementenKopi�ren)
		 */

		boodschap("\nKopieren van een array: ");
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length); // Manier 1
		int[] intArrayCopy2 = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy2, 0, intArray.length); // Manier 2
		printArrayI(intArray);
		printArrayI(intArrayCopy);
		printArrayI(intArrayCopy2);

		boodschap("\nVergelijken van twee array objecten: ");
		boolean gelijkA = Arrays.equals(intArray, intArrayCopy);
		boolean gelijkB = Arrays.equals(intArray, filledInArray);
		System.out.println("Zijn intArray en intArrayCopy gelijk? ---> " + gelijkA);
		System.out.println("Zijn intArray en filledInArray gelijk? --> " + gelijkB);

		/*
		 * BinarySearch(array, element) Returns positieve waarde -> Element bestaat,
		 * absolute waarde geef positie weer. Returns negatieve waarde -> Element
		 * bestaat niet, absolute waarde geef |absoluut| waar de waarde moet toegevoegd
		 * worden.
		 */

		boodschap("\nZoeken naar element met de waarde 5 in intArray: ");
		int bs = Arrays.binarySearch(intArray, 5);
		System.out.println("Heeft intArray element 5? --> " + bs);
	}

	private static void printArrayD(double[] array) {
		System.out.println(Arrays.toString(array) + "\n");
	}

	private static void printArrayI(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	private static void boodschap(String boodschap) {
		System.out.print(boodschap + "\n");
	}
}
