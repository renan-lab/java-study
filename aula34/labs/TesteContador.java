package com.renan.cursojava.aula34.labs;

public class TesteContador {

	static void imprimirValor() {
		System.out.println(Contador.retornar());
	}
	
	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValor();
		
	}

}
