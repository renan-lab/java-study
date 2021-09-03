package com.renan.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		String primeiroTexto = "Esta é";
		String segundoTexto = " uma String concatenada.";
		String terceiroTexto = primeiroTexto + segundoTexto;
		System.out.println(terceiroTexto);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		resultado += 1;
		System.out.println(resultado);
		
		resultado -= 1;
		System.out.println(resultado);
		
	}

}
