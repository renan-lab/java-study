package com.renan.cursojava.aula19;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int qtdPar = 0;
		
		for (int i=0; i < a.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			a[i] = scan.nextInt();
			
			if (a[i] % 2 == 0) {
				qtdPar++;
			}
			
		}
		
		System.out.println("Quantidade de números pares no vetor: " + qtdPar);

	}

}
