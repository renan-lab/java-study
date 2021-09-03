package com.renan.cursojava.aula20;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		
		int[][] numAleatorios = new int[4][4];
		
		Random numeroRandom =  new Random();
		
		for (int i=0; i < numAleatorios.length; i++) {
			for (int j=0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j] = numeroRandom.nextInt(10);
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		
		for (int i=0; i < numAleatorios.length; i++) {
			for (int j=0; j < numAleatorios[i].length; j++) {
				if (numAleatorios[i][j] > maior) {
					maior = numAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		for (int i=0; i < numAleatorios.length; i++) {
			for (int j=0; j < numAleatorios[i].length; j++) {
				System.out.print(numAleatorios[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Maior valor: " + maior + "\n"
				+ "Linha: " + linha + "\n"
				+ "Coluna: " + col);

	}

}
