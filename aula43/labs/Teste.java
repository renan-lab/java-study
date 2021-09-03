package com.renan.cursojava.aula43.labs;

public class Teste {

	public static void main(String[] args) {
		
		//Teste Conta Bancaria
		
		ContaBancaria contaBancaria = new ContaBancaria();
		
		contaBancaria.setNomeCliente("Renan");
		contaBancaria.setNumConta("48759834");
		
		contaBancaria.depositar(100);
		contaBancaria.sacar(100);
		
		System.out.println(contaBancaria);
		
		System.out.println();
		
		//Teste com Conta Poupança
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("Ninguem");
		contaPoupanca.setNumConta("38749283");
		contaPoupanca.setDiaRendimento(0.5);
		
		contaPoupanca.depositar(100);
		
		contaPoupanca.calcularNovoSaldo();
		
		System.out.println("Rendimento aplicado novo saldo é de: R$" + contaPoupanca.getSaldo());
		
		System.out.println(contaPoupanca);
		
		System.out.println();
		
		//Teste com Conta Especial
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("Alguém");
		contaEspecial.setNumConta("3857935");
		contaEspecial.setLimite(100);
		
		contaEspecial.depositar(100);
		
		contaEspecial.sacar(50);
		contaEspecial.sacar(50);
		contaEspecial.sacar(50);
		contaEspecial.sacar(50);
		contaEspecial.sacar(50);
		
		System.out.println(contaEspecial);
		
	}

}
