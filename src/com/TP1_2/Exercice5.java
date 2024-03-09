package com.TP1_2;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] butsJoueurs = new int[22]; // Initialisation du tableau pour stocker les buts de chaque joueur

		// Entrée du nombre de buts pour chaque joueur
		for (int i = 0; i < 22; i++) {
			System.out.print("Entrez le nombre de buts pour le joueur " + (i + 1) + ": ");
			butsJoueurs[i] = scanner.nextInt();
		}

		// Affichage du numéro du buteur de l'équipe
		int meilleurButeur = trouverMeilleurButeur(butsJoueurs);
		System.out.println("Le meilleur buteur de l'équipe est le joueur n°" + (meilleurButeur + 1));

		// Calcul du nombre total de buts inscrits par l'équipe
		int totalButs = calculerTotalButs(butsJoueurs);
		System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalButs);

		// Calcul du nombre de joueurs n'ayant pas marqué de buts
		int joueursSansButs = compterJoueursSansButs(butsJoueurs);
		System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansButs);

		// Mise à jour des buts du joueur n°9
		butsJoueurs[8] += 2;
		System.out.println("Le joueur n°9 a inscrit 2 buts. Mise à jour effectuée.");

		scanner.close();
	}

	// Méthode pour trouver le meilleur buteur
	public static int trouverMeilleurButeur(int[] butsJoueurs) {
		int meilleurButeur = 0;
		for (int i = 1; i < butsJoueurs.length; i++) {
			if (butsJoueurs[i] > butsJoueurs[meilleurButeur]) {
				meilleurButeur = i;
			}
		}
		return meilleurButeur;
	}

	// Méthode pour calculer le nombre total de buts
	public static int calculerTotalButs(int[] butsJoueurs) {
		int totalButs = 0;
		for (int buts : butsJoueurs) {
			totalButs += buts;
		}
		return totalButs;
	}

	// Méthode pour compter le nombre de joueurs n'ayant pas marqué de buts
	public static int compterJoueursSansButs(int[] butsJoueurs) {
		int joueursSansButs = 0;
		for (int buts : butsJoueurs) {
			if (buts == 0) {
				joueursSansButs++;
			}
		}
		return joueursSansButs;
	}
}
