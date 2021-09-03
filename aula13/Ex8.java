package com.renan.cursojava.aula13;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quanto você ganha por hora trabalhada e a quantidade total de horas trabalhadas no mês");
		double vlrHora = scan.nextDouble();
		double qtdHora = scan.nextDouble();
		
		System.out.println("\nO salário total do mês é: " + (vlrHora * qtdHora));
		
	}

}
