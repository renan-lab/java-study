package com.renan.cursojava.aula35;

public class Calculadora {

	public static int fatorialNaoRecursivo(int num) {
		int total = 1;
		for (int i=num; i > 0; i--) {
			total *= i;
		}
		return total;
	}
	
	public static int fatorialRecursivo(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * fatorialRecursivo(num - 1);
	}
	
}
