package com.TP3;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of the array (maximum 50):");
		int size = scanner.nextInt();
		while (size < 1 || size > 50) {
			System.out.println("Invalid size. Please enter a size between 1 and 50.");
			size = scanner.nextInt();
		}

		int[] numbers = new int[size];
		System.out.println("Please enter " + size + " integers for the array:");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println("Original array:");
		printArray(numbers);

		int positiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < size; i++) {
			if (numbers[i] > 0) {
				positiveCount++;
			} else if (numbers[i] < 0) {
				negativeCount++;
			}
		}

		int[] positiveNumbers = new int[positiveCount];
		int[] negativeNumbers = new int[negativeCount];

		positiveCount = 0;
		negativeCount = 0;
		for (int i = 0; i < size; i++) {
			if (numbers[i] > 0) {
				positiveNumbers[positiveCount] = numbers[i];
				positiveCount++;
			} else if (numbers[i] < 0) {
				negativeNumbers[negativeCount] = numbers[i];
				negativeCount++;
			}
		}

		System.out.println("Positive numbers:");
		printArray(positiveNumbers);

		System.out.println("Negative numbers:");
		printArray(negativeNumbers);
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println("]");
	}
}