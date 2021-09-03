package com.renan.cursojava.aula17;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois número inteiros:");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("Intervalo entre " + n1 + " e " + n2);
		
		for(int i=n1; i < n2; i++) {
			System.out.println(i);
		}
		
	}

}
