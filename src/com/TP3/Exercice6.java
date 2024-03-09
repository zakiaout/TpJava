package com.TP3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
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

		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += numbers[i];
		}

		double average = (double) sum / size;

		int[] numbers2 = new int[size];
		System.arraycopy(numbers, 0, numbers2, 0, size);

		Arrays.sort(numbers);

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		System.out.println("Original array:");
		printArray(numbers2);
		System.out.println("Sorted array:");
		printArray(numbers);
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
