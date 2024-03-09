package com.TP3;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size;
		do {
			System.out.println("Please enter a size for the array between 10 and 50:");
			size = scanner.nextInt();
		} while (size < 10 || size > 50);

		// Declare and initialize an array of integers with the entered size
		int[] numbers = new int[size];

		// Fill the array with user input
		System.out.println("Please enter " + size + " elements for the array:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Display the initial array
		System.out.println("Initial array:");
		printArray(numbers);

		// Remove occurrences of 5 and shift elements left
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 5) {
				numbers[count] = numbers[i];
				count++;
			}
		}

		// Resize the array to remove unused elements
		int[] newNumbers = new int[count];
		System.arraycopy(numbers, 0, newNumbers, 0, count);
		numbers = newNumbers;

		// Display the resulting array
		System.out.println("Array with occurrences of 5 removed:");
		printArray(numbers);
	}

	// Method to print the elements of an array
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("numbers[" + i + "] = " + array[i]);
		}
	}
}
