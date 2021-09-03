package com.renan.cursojava.aula13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2 números inteiros e 1 número real:");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		double n3 = scan.nextDouble();
		
		System.out.println("\nProduto do dobro do primeiro com metade do segundo: " + ((n1 * 2) * (n2 / 2)) + "\n"
				+ "Soma do triplo do primeiro com o terceiro: " + ((n1 * 3) + n3) + "\n"
				+ "O terceiro elevado ao cubo: " + (n3 * n3 * n3));
		
	}

}
