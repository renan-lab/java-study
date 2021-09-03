package com.renan.cursojava.aula43.labs;

public class ContaEspecial extends ContaBancaria{

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double vlrSaque) {
		
		if (vlrSaque > (this.getSaldo() + limite)) {
			System.out.println("Valor de saque superior ao limite da conta.");
		} else {
			System.out.println("Saque efetuado com sucesso. Valor sacado: R$" + vlrSaque);
			
			this.setSaldo(this.getSaldo() - vlrSaque);
		}
		
	}
	
}
