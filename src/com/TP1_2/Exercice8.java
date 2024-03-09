package com.TP1_2;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Saisie de l'âge
		System.out.print("Entrez l'âge de l'habitant : ");
		int age = scanner.nextInt();

		// Saisie du sexe
		System.out.print("Entrez le sexe de l'habitant (M pour homme, F pour femme) : ");
		char sexe = scanner.next().charAt(0);

		// Vérification si l'habitant est imposable
		boolean estImposable = false;

		if (sexe == 'M' || sexe == 'm') {
			// Les hommes de plus de 20 ans paient l'impôt
			if (age > 20) {
				estImposable = true;
			}
		} else if (sexe == 'F' || sexe == 'f') {
			// Les femmes paient l'impôt si elles ont entre 18 et 35 ans
			if (age >= 18 && age <= 35) {
				estImposable = true;
			}
		} else {
			System.out.println("Sexe non valide.");
			// Si le sexe n'est pas valide, l'habitant est considéré non imposable
		}

		// Affichage du statut de l'habitant
		if (estImposable) {
			System.out.println("L'habitant est imposable.");
		} else {
			System.out.println("L'habitant n'est pas imposable.");
		}

		scanner.close();
	}
}
