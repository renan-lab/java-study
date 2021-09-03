package com.renan.cursojava.aula27.labs;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double vlrEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double vlrSaque) {
		
		if (saldo >= vlrSaque) {
			saldo -= vlrSaque;
			return true;
		} else if (especial) {
			double limite = limiteEspecial + saldo;
			if (limite >= vlrSaque) {
				saldo -= vlrSaque;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	void depositar(double vlrDeposito) {
		saldo += vlrDeposito;
	}

}
