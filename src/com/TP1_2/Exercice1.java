package com.TP1_2;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie
        Scanner scanner = new Scanner(System.in);

        // Saisie de l'entier positif
        System.out.print("Entrez un entier positif : ");
        int nombre = scanner.nextInt();

        // Vérification que le nombre est positif
        if (nombre <= 0) {
            System.out.println("Le nombre doit être strictement positif.");
        } else {
            // Affichage des diviseurs, du nombre de diviseurs et de leur somme
            afficherDiviseurs(nombre);
        }

        // Fermeture du scanner
        scanner.close();
    }

    // Fonction pour afficher les diviseurs, le nombre de diviseurs et leur somme
    public static void afficherDiviseurs(int n) {
        int nombreDiviseurs = 0;
        int sommeDiviseurs = 0;

        System.out.print("Les diviseurs de " + n + " sont : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                nombreDiviseurs++;
                sommeDiviseurs += i;
            }
        }
        System.out.println();
        System.out.println("Le nombre de diviseurs est : " + nombreDiviseurs);
        System.out.println("La somme des diviseurs est : " + sommeDiviseurs);
    }
}

