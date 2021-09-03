package com.renan.cursojava.aula43.labs;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double vlrSaque) {
		
		if (vlrSaque > saldo) {
			System.out.println("Saldo insuficiente para saque.");
		} else {
			System.out.println("Saque efetuado com sucesso. Valor sacado: R$" + vlrSaque);
			saldo -= vlrSaque;
		}
		
	}
	public void depositar(double vlrDeposito) {
		saldo += vlrDeposito;
	}
	
	@Override
	public String toString() {
		return "Nome do cliente: " + nomeCliente + "\n"
				+ "Número da conta: " + numConta + "\n"
				+ "Saldo: R$" + saldo;
	}
	
}
