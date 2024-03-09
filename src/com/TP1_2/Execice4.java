package com.TP1_2;

import java.util.Scanner;

public class Execice4 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux entiers n et m
        System.out.print("Entrez le premier entier n : ");
        int n = scanner.nextInt();

        System.out.print("Entrez le deuxième entier m : ");
        int m = scanner.nextInt();

        // Vérification si les deux entiers sont amis
        if (sontAmis(n, m)) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        }

        // Fermeture du scanner
        scanner.close();
    }

    // Fonction pour vérifier si deux nombres sont amis
    public static boolean sontAmis(int n, int m) {
        return (sommeDiviseurs(n) == m && sommeDiviseurs(m) == n);
    }

    // Fonction pour calculer la somme des diviseurs d'un nombre
    public static int sommeDiviseurs(int nombre) {
        int somme = 0;
        for (int i = 1; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }
        return somme;
    }
}

