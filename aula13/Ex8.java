package com.renan.cursojava.aula13;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quanto voc� ganha por hora trabalhada e a quantidade total de horas trabalhadas no m�s");
		double vlrHora = scan.nextDouble();
		double qtdHora = scan.nextDouble();
		
		System.out.println("\nO sal�rio total do m�s �: " + (vlrHora * qtdHora));
		
	}

}
