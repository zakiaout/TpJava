package com.tp2;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of terms (N): ");
		int numberOfTerms = scanner.nextInt();

		double sum = calculateSum(numberOfTerms);

		System.out.println("Sum of the first " + numberOfTerms + " terms: " + sum);
	}

	/**
	 * Calculates the sum of the first N terms of the harmonic series.
	 *
	 * @param numberOfTerms the number of terms to calculate the sum for
	 * @return the sum of the first N terms of the harmonic series
	 */
	private static double calculateSum(int numberOfTerms) {
		double sum = 0.0;
		for (int i = 1; i <= numberOfTerms; i++) {
			sum += 1.0 / i;
		}
		return sum;
	}
}
