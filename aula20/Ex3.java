package com.renan.cursojava.aula20;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizM = new int[3][3];
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for (int i=0; i < matrizM.length; i++) {
			for (int j=0; j < matrizM[i].length; j++) {
				System.out.println("Digite um número inteiro na linha " + i + ", coluna " + j + ":");
				matrizM[i][j] = scan.nextInt();
				
				if (matrizM[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}
		
		System.out.println();
		
		for (int i=0; i < matrizM.length; i++) {
			for (int j=0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println();
		
		System.out.println("Quantidade de números pares: " + qtdPares + "\n"
				+ "Quantidade de números ímpares: " + qtdImpares);
		
	}
}
