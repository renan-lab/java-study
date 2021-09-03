package com.renan.cursojava.aula17;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número para gerar sua tabuada:");
		int n = scan.nextInt();
		
		System.out.println("Tabuada do " + n + ":");
		for (int i=1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
		
	}

}
