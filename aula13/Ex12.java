package com.renan.cursojava.aula13;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira sua altura:");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("\nSeu peso ideal �: " + pesoIdeal);
		
	}

}
