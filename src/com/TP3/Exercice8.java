package com.TP3;

import java.util.Scanner;

public class Exercice8 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter the size of the array:");
	        int size = scanner.nextInt();
	        while (size < 1 || size > 50) {
	            System.out.println("Invalid size. Please enter a size between 1 and 50.");
	            size = scanner.nextInt();
	        }

	        int[] numbers = new int[size];
	        System.out.println("Please enter " + size + " integers for the array:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        int largestGap = 0;
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = i + 1; j < size; j++) {
	                int gap = Math.abs(numbers[i] - numbers[j]);
	                if (gap > largestGap) {
	                    largestGap = gap;
	                }
	            }
	        }

	        System.out.println("Largest gap = " + largestGap);
	    }
	}
