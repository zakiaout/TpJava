package com.TP1_2;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Saisie du poids en kg
		System.out.print("Entrez votre poids en kg : ");
		double poids = scanner.nextDouble();

		// Saisie de la taille en mètres
		System.out.print("Entrez votre taille en mètres : ");
		double taille = scanner.nextDouble();

		// Saisie du sexe
		System.out.print("Entrez votre sexe (F pour femme, H pour homme) : ");
		char sexe = scanner.next().charAt(0);

		// Calcul de l'IMC
		double imc = poids / (taille * taille);

		// Affichage de l'IMC
		System.out.println("Votre IMC est : " + imc);

		// Vérification de l'état de poids
		System.out.println("État de poids : ");
		if (sexe == 'F' || sexe == 'f') {
			verifierIMCFemme(imc);
		} else if (sexe == 'H' || sexe == 'h') {
			verifierIMCHomme(imc);
		} else {
			System.out.println("Sexe non valide.");
		}

		scanner.close();
	}

	public static void verifierIMCFemme(double imc) {
		if (imc < 19) {
			System.out.println("Maigreur");
		} else if (imc >= 19 && imc <= 24) {
			System.out.println("Poids normal");
		} else if (imc >= 24 && imc <= 30) {
			System.out.println("Surcharge pondérale");
		} else if (imc >= 30 && imc <= 40) {
			System.out.println("Adiposité");
		} else {
			System.out.println("Obésité");
		}
	}

	public static void verifierIMCHomme(double imc) {
		if (imc < 20) {
			System.out.println("Maigreur");
		} else if (imc >= 20 && imc <= 25) {
			System.out.println("Poids normal");
		} else if (imc >= 25 && imc <= 30) {
			System.out.println("Surcharge pondérale");
		} else if (imc >= 30 && imc <= 40) {
			System.out.println("Adiposité");
		} else {
			System.out.println("Obésité");
		}
	}
}
