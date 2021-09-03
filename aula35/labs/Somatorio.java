package com.renan.cursojava.aula35.labs;

public class Somatorio {

	public static int realizarSomatorio(int num) {
		
		if (num == 0) {
			return 0;
		}
		
		return num + realizarSomatorio(num - 1);
	}
	
}
