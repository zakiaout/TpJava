package com.tp2;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Demander à l'utilisateur d'entrer un nombre
		System.out.print("Entrez un nombre : ");
		int nombre = scanner.nextInt();

		// Tester si le nombre est premier
		if (estPremier(nombre)) {
			System.out.println(nombre + " est un nombre premier.");
		} else {
			System.out.println(nombre + " n'est pas un nombre premier.");
		}

		scanner.close();
	}

	// Méthode pour tester si un nombre est premier
	public static boolean estPremier(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
