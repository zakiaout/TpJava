package com.tp2;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the base (X): ");
		int base = scanner.nextInt();

		System.out.print("Enter the exponent (N): ");
		int exponent = scanner.nextInt();

		long result = calculatePower(base, exponent);

		System.out.println("Result: " + result);
	}

	/**
	 * Calculates the power of a number using successive multiplications.
	 *
	 * @param base     the base number
	 * @param exponent the exponent
	 * @return the result of X^N
	 */
	private static long calculatePower(int base, int exponent) {
		long power = 1;
		for (int i = 1; i <= exponent; i++) {
			power *= base;
		}
		return power;
	}
}
