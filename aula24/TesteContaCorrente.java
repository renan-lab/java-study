package com.renan.cursojava.aula24;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente renan = new ContaCorrente();
		renan.numero = 312743542;
		renan.saldo = 2000000;
		renan.contaEspecial = true;
		renan.limite = 20000000;
		
		ContaCorrente ninguem = new ContaCorrente();
		ninguem.numero = 84757384;
		ninguem.saldo = 500000;
		ninguem.contaEspecial = false;
		ninguem.limite = 1000000;

		System.out.println("Renan");
		System.out.println("Número da conta: " + renan.numero + "\n"
				+ "Saldo: " + renan.saldo + "\n"
				+ "Conta Especial: " + renan.contaEspecial);
		
		System.out.println();
		
		System.out.println("Ninguem");
		System.out.println("Número da conta: " + ninguem.numero + "\n"
				+ "Saldo: " + ninguem.saldo + "\n"
				+ "Conta Especial: " + ninguem.contaEspecial);
		
	}

}
