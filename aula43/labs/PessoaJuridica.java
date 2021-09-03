package com.renan.cursojava.aula43.labs;

public class PessoaJuridica extends Contribuinte{

	public void calcularImposto() {
		super.setVlrImposto(super.getRendaBruta() * 0.1);
	}
	
}
