package com.renan.cursojava.aula48;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i=0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ArithmeticException exception) {
				System.out.println("Erro ao dividir por zero");
			} catch (Throwable exception) { //exce??o gen?rica
				System.out.println("Ocorreu um erro");
			}
		}

	}

}
