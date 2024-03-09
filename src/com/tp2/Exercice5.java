package com.tp2;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Demander à l'utilisateur d'entrer la valeur de n
		System.out.print("Entrez la valeur de n : ");
		int n = scanner.nextInt();

		// Calcul de n! avec la boucle while
		long factorielleWhile = calculerFactorielleWhile(n);

		// Calcul de n! avec la boucle for
		long factorielleFor = calculerFactorielleFor(n);

		// Affichage des résultats
		System.out.println("n! avec while : " + factorielleWhile);
		System.out.println("n! avec for : " + factorielleFor);

		scanner.close();
	}

	// Méthode pour calculer n! avec une boucle while
	public static long calculerFactorielleWhile(int n) {
		long resultat = 1;
		int i = 1;
		while (i <= n) {
			resultat *= i;
			i++;
		}
		return resultat;
	}

	// Méthode pour calculer n! avec une boucle for
	public static long calculerFactorielleFor(int n) {
		long resultat = 1;
		for (int i = 1; i <= n; i++) {
			resultat *= i;
		}
		return resultat;
	}
}
