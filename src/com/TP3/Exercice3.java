package com.TP3;

import java.util.Scanner;

public class Exercice3 {

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

		// Display the elements of the array
		System.out.println("Elements of the array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
	}
}