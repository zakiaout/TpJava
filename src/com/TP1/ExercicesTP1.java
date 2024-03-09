package com.TP1;

import java.util.Scanner;

public class ExercicesTP1 {

	public static void main(String[] args) {
		ExercicesTP1 tp = new ExercicesTP1();

		// Appeler les méthodes correspondant à chaque exercice
		tp.exercice1();
		tp.exercice2();
		tp.exercice3();
		tp.exercice4();
		tp.exercice5();
		tp.exercice6();
		tp.exercice7();
		tp.exercice8();
	}

	// Méthode pour le premier exercice
	public void exercice1() {
		System.out.println("Exercice 1 :");
		int a = 10;
		int b = 5;

		// Calculs
		int somme = a + b;
		int difference = a - b;
		int produit = a * b;
		double quotient = (double) a / b;

		// Affichage des résultats
		System.out.println("Somme : " + somme);
		System.out.println("Différence : " + difference);
		System.out.println("Produit : " + produit);
		System.out.println("Quotient : " + quotient);
	}

	// Méthode pour le deuxième exercice
	public void exercice2() {
		System.out.println("Exercice 2 :");

		// Création d'un objet Scanner
		Scanner scanner = new Scanner(System.in);

		// Demander à l'utilisateur le rayon du cercle
		System.out.print("Entrez le rayon du cercle : ");
		double rayon = scanner.nextDouble();

		// Calcul de la surface et du périmètre
		double surface = Math.PI * rayon * rayon;
		double perimetre = 2 * Math.PI * rayon;

		// Affichage des résultats
		System.out.println("Surface du cercle : " + surface);
		System.out.println("Périmètre du cercle : " + perimetre);
	}

	// Méthode pour le troisième exercice
	public void exercice3() {
		System.out.println("Exercice 3 :");
		// Création d'un objet Scanner pour la saisie
		Scanner scanner = new Scanner(System.in);

		// Saisie des entiers a et b
		System.out.print("Entrez la valeur de a : ");
		int a = scanner.nextInt();

		System.out.print("Entrez la valeur de b : ");
		int b = scanner.nextInt();

		// Affichage des entiers avant permutation
		System.out.println("Avant permutation :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Permutation des entiers
		int temp = a;
		a = b;
		b = temp;

		// Affichage des entiers après permutation
		System.out.println("\nAprès permutation :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	// Méthode pour le quatrième exercice
	public void exercice4() {
		System.out.println("Exercice 4 :");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez le réel x : ");
		double x = scanner.nextDouble();
		System.out.print("Entrez l'entier n : ");
		int n = scanner.nextInt();

		double resultat = Math.pow(x, n);
		System.out.println(x + " à la puissance " + n + " est : " + resultat);
		System.out.println();
	}

	// Méthode pour le cinquième exercice
	public void exercice5() {
		System.out.println("Exercice 5 :");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un nombre entier : ");
		int nombre = scanner.nextInt();

		int factorielle = 1;
		for (int i = 1; i <= nombre; i++) {
			factorielle *= i;
		}

		System.out.println("La factorielle de " + nombre + " est : " + factorielle);
		System.out.println();
	}

	public void exercice6() {
		System.out.println("Exercice 6 :");
		// Création d'un objet Scanner pour la saisie
		Scanner scanner = new Scanner(System.in);

		// Saisie des coefficients a et b
		System.out.print("Entrez la valeur de a : ");
		double a = scanner.nextDouble();

		System.out.print("Entrez la valeur de b : ");
		double b = scanner.nextDouble();

		// Vérification du coefficient a pour déterminer le nombre de solutions
		if (a == 0) {
			if (b == 0) {
				System.out.println("L'équation admet une infinité de solutions.");
			} else {
				System.out.println("L'équation n'a pas de solution.");
			}
		} else {
			// Calcul de la solution
			double solution = -b / a;
			System.out.println("L'équation admet une solution unique : x = " + solution);
		}
	}

	public void exercice7() {
		System.out.println("Exercice 7 :");
		// Création d'un objet Scanner pour la saisie
		Scanner scanner = new Scanner(System.in);

		// Saisie des coefficients a, b et c
		System.out.print("Entrez la valeur de a : ");
		double a = scanner.nextDouble();

		System.out.print("Entrez la valeur de b : ");
		double b = scanner.nextDouble();

		System.out.print("Entrez la valeur de c : ");
		double c = scanner.nextDouble();

		// Calcul du discriminant
		double discriminant = b * b - 4 * a * c;

		if (a == 0) {
			// Si a est égal à zéro, l'équation devient une équation du premier degré
			System.out.println("Ce n'est pas une équation du second degré.");
		} else if (discriminant > 0) {
			// Deux solutions réelles distinctes
			double racineDiscriminant = Math.sqrt(discriminant);
			double solution1 = (-b + racineDiscriminant) / (2 * a);
			double solution2 = (-b - racineDiscriminant) / (2 * a);
			System.out.println("L'équation admet deux solutions réelles distinctes :");
			System.out.println("x1 = " + solution1);
			System.out.println("x2 = " + solution2);
		} else if (discriminant == 0) {
			// Une solution réelle double
			double solution = -b / (2 * a);
			System.out.println("L'équation admet une solution réelle double : x = " + solution);
		} else {
			// Pas de solution réelle
			System.out.println("L'équation n'admet pas de solution réelle.");
		}

	}

	public void exercice8() {
		System.out.println("Exercice 8 :");
		// Création d'un objet Scanner pour la saisie
		Scanner scanner = new Scanner(System.in);

		// Saisie des deux entiers
		System.out.print("Entrez le premier entier : ");
		int entier1 = scanner.nextInt();

		System.out.print("Entrez le deuxième entier : ");
		int entier2 = scanner.nextInt();

		// Calcul du PGCD
		int pgcd = calculerPGCD(entier1, entier2);

		// Affichage du résultat
		System.out.println("Le PGCD de " + entier1 + " et " + entier2 + " est : " + pgcd);

		// Fermeture du scanner
		scanner.close();
	}

	// Fonction pour calculer le PGCD de deux entiers
	public static int calculerPGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
