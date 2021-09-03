package com.renan.cursojava.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i=0; i < numeros.length; i++) {
			
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
			} 
			catch (ArithmeticException exception) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0); //termina a execução e o finally não é executado
			} 
			catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("Posição do array inválida");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");
			}

		}
	
	}

}
