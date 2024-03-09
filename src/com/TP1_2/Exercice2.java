package com.TP1_2;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// Création d'un objet Scanner pour la saisie
		Scanner scanner = new Scanner(System.in);

		// Saisie de l'heure
		System.out.print("Entrez l'heure : ");
		int heure = scanner.nextInt();

		// Saisie des minutes
		System.out.print("Entrez les minutes : ");
		int minutes = scanner.nextInt();

		// Calcul de l'heure suivante
		minutes++; // Ajout d'une minute

		// Si les minutes dépassent 59, on ajuste l'heure et les minutes
		if (minutes == 60) {
			heure++;
			minutes = 0;
		}

		// Si l'heure dépasse 23, on revient à 0
		if (heure == 24) {
			heure = 0;
		}

		// Affichage de l'heure suivante
		System.out.println("Dans une minute, il sera " + heure + " heure(s) " + minutes + " minute(s).");

		// Fermeture du scanner
		scanner.close();
	}
}
