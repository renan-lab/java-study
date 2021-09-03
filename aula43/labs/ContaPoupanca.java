package com.renan.cursojava.aula43.labs;

public class ContaPoupanca extends ContaBancaria{

	private double diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo() {
		this.setSaldo(this.getSaldo() + (diaRendimento * this.getSaldo()));
	}
	
	
	
}
