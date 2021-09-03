package com.renan.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("Não é maior de idade.");
		}
		*/
		
		System.out.println("Digite o preço do produto:");
		double vlr = scan.nextDouble();
		
		if (vlr <= 10) {
			System.out.println("Barato. Pode comprar.");
		} else if (vlr > 10 && vlr < 15) {
			System.out.println("Pode pedir desconto.");
		} else if (vlr >= 15 && vlr < 17) {
			System.out.println("Pesquise mais.");
		} else {
			System.out.println("Muito caro.");
		}
		
	}

}
