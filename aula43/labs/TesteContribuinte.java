package com.renan.cursojava.aula43.labs;

public class TesteContribuinte {

	public static void main(String[] args) {
		
		//Teste pessoa jur�dica
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
		PessoaJuridica pessoaJuridica3 = new PessoaJuridica();

		pessoaJuridica.setNome("Algu�m");
		pessoaJuridica.setRendaBruta(1000);
		pessoaJuridica.calcularImposto();
		System.out.println(pessoaJuridica);
		
		pessoaJuridica2.setNome("Algu�m 2");
		pessoaJuridica2.setRendaBruta(1500);
		pessoaJuridica2.calcularImposto();
		System.out.println(pessoaJuridica2);
		
		pessoaJuridica3.setNome("Algu�m 3");
		pessoaJuridica3.setRendaBruta(2000);
		pessoaJuridica3.calcularImposto();
		System.out.println(pessoaJuridica3);
		
		//Teste pessoa f�sica
		PessoaFisica pessoaFisica = new PessoaFisica();
		PessoaFisica pessoaFisica2 = new PessoaFisica();
		PessoaFisica pessoaFisica3 = new PessoaFisica();
		
		pessoaFisica.setNome("Ningu�m");
		pessoaFisica.setRendaBruta(1000);
		pessoaFisica.calcularImposto();
		System.out.println(pessoaFisica);
		
		pessoaFisica2.setNome("Ningu�m 2");
		pessoaFisica2.setRendaBruta(1500);
		pessoaFisica2.calcularImposto();
		System.out.println(pessoaFisica2);
		
		pessoaFisica3.setNome("Ningu�m 3");
		pessoaFisica3.setRendaBruta(3000);
		pessoaFisica3.calcularImposto();
		System.out.println(pessoaFisica3);
		
	}

}
