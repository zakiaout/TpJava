package com.TP3;

import java.util.Scanner;

public class Exercice5 {

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

		reverseArrayInPlace(numbers);

		System.out.println("Reversed array:");
		printArray(numbers);
	}

	private static void reverseArrayInPlace(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
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
