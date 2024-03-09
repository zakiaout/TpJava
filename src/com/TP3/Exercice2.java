package com.TP3;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// Prompt the user to declare an array of 10 elements
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 10 elements for the array:");
		int[] numbers = new int[10];
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
