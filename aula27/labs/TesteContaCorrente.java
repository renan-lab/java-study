package com.renan.cursojava.aula27.labs;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "312743542";
		conta.agencia = "001";
		conta.saldo = 2000000;
		conta.especial = true;
		conta.limiteEspecial = 20000000;
		conta.vlrEspecialUsado = 0;
		
		boolean saqueEfetuado = conta.realizarSaque(500000000);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso\n"
					+ "Saldo atual: " + conta.saldo);
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
		}
		
		conta.depositar(500);
		System.out.println("Saldo atual: " + conta.saldo);
		
	}

}
