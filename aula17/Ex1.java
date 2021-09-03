package com.renan.cursojava.aula17;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean valido;
		
		do {
			
			System.out.println("Digite uma nota entre 0 e 10");
			int nota = scan.nextInt();
			
			if (nota >= 0 && nota <= 10) {
				valido = true;
			} else {
				valido = false;
				System.out.println("Valor inválido!");
			}
			
		} while (valido == false);

	}

}
