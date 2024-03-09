package com.TP1_2;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		// Création d'un objet Scanner pour la saisie
		Scanner scanner = new Scanner(System.in);

		// Saisie de l'entier n
		System.out.print("Entrez un entier positif supérieur à 1 : ");
		int n = scanner.nextInt();

		// Vérification que l'entier est supérieur à 1
		if (n <= 1) {
			System.out.println("L'entier doit être supérieur à 1.");
		} else {
			// Vérification si l'entier est parfait
			if (estNombreParfait(n)) {
				System.out.println(n + " est un nombre parfait.");
			} else {
				System.out.println(n + " n'est pas un nombre parfait.");
			}
		}

		// Fermeture du scanner
		scanner.close();
	}

	// Fonction pour vérifier si un nombre est parfait
	public static boolean estNombreParfait(int nombre) {
		int sommeDiviseurs = 0;
		// On parcourt tous les diviseurs possibles de 1 à nombre/2 inclusivement
		for (int i = 1; i <= nombre / 2; i++) {
			if (nombre % i == 0) {
				sommeDiviseurs += i;
			}
		}
		// Si la somme des diviseurs est égale au nombre, il est parfait
		return sommeDiviseurs == nombre;
	}
}
