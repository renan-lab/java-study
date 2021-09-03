package com.renan.cursojava.aula20;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		
		int[][] matrizM = new int[10][10];
		
		Random numRandom = new Random();
		
		for (int i=0; i < matrizM.length; i++) {
			for (int j=0; j < matrizM[i].length; j++) {
				matrizM[i][j] = numRandom.nextInt(10);
			}
		}

		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;
		int maiorCol7 = Integer.MIN_VALUE;
		int menorCol7 = Integer.MAX_VALUE;
		
		for (int i=0; i < matrizM.length; i++) {
			for (int j=0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " | ");
			
				if (matrizM[5][j] > maiorLinha5) {
					maiorLinha5 = matrizM[5][j];
				} 
				if (matrizM[5][j] < menorLinha5){
					menorLinha5 = matrizM[5][j];
				}
				
				if (matrizM[i][7] > maiorCol7) {
					maiorCol7 = matrizM[i][7];
				}
				if (matrizM[i][7] < menorCol7) {
					menorCol7 = matrizM[i][7];
				}
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		System.out.println("Maior valor da linha 5: " + maiorLinha5 + "\n"
				+ "Menor valor da linha 5: " + menorLinha5 + "\n"
				+ "Maior valor da coluna 7: " + maiorCol7 + "\n"
				+ "Menor valor da coluna 7: " + menorCol7);
		
	}
}
