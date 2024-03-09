package com.tp2;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez le nombre de nombres entiers à calculer : ");
		int N = scanner.nextInt();

		// Utilisation de while
		calculerAvecWhile(N, scanner);

		// Utilisation de do-while
		calculerAvecDoWhile(N, scanner);

		// Utilisation de for
		calculerAvecFor(N, scanner);

		scanner.close();
	}

	public static void calculerAvecWhile(int N, Scanner scanner) {
		int somme = 0;
		int produit = 1;

		int count = 0;
		double moyenne = 0;

		System.out.println("Utilisation de la boucle While :");
		while (count < N) {
			System.out.print("Entrez un nombre entier : ");
			int nombre = scanner.nextInt();

			somme += nombre;
			produit *= nombre;
			moyenne = (moyenne * count + nombre) / (count + 1);
			count++;
		}

		afficherResultats(somme, produit, moyenne);
	}

	public static void calculerAvecDoWhile(int N, Scanner scanner) {
		int somme = 0;
		int produit = 1;

		int count = 0;
		double moyenne = 0;

		System.out.println("Utilisation de la boucle Do-While :");
		do {
			System.out.print("Entrez un nombre entier : ");
			int nombre = scanner.nextInt();

			somme += nombre;
			produit *= nombre;
			moyenne = (moyenne * count + nombre) / (count + 1);
			count++;
		} while (count < N);

		afficherResultats(somme, produit, moyenne);
	}

	public static void calculerAvecFor(int N, Scanner scanner) {
		int somme = 0;
		int produit = 1;

		double moyenne = 0;

		System.out.println("Utilisation de la boucle For :");
		for (int i = 0; i < N; i++) {
			System.out.print("Entrez un nombre entier : ");
			int nombre = scanner.nextInt();

			somme += nombre;
			produit *= nombre;
			moyenne = (moyenne * i + nombre) / (i + 1);
		}

		afficherResultats(somme, produit, moyenne);
	}

	public static void afficherResultats(int somme, int produit, double moyenne) {
		System.out.println("Somme : " + somme);
		System.out.println("Produit : " + produit);
		System.out.println("Moyenne : " + moyenne);
		System.out.println();
	}
}
