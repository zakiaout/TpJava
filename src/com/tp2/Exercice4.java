package com.tp2;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of lines (N): ");
		int numberOfLines = scanner.nextInt();

		printStarTriangle(numberOfLines);
	}

	/**
	 * Prints a triangle of N lines formed by stars.
	 *
	 * @param numberOfLines the number of lines in the triangle
	 */
	private static void printStarTriangle(int numberOfLines) {
		for (int i = 1; i <= numberOfLines; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
