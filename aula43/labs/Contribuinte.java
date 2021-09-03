package com.renan.cursojava.aula43.labs;

public abstract class Contribuinte {

	private String nome;
	private double rendaBruta;
	private double vlrImposto;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public double getVlrImposto() {
		return vlrImposto;
	}

	public void setVlrImposto(double vlrImposto) {
		this.vlrImposto = vlrImposto;
	}

	public abstract void calcularImposto();

	@Override
	public String toString() {
		return "Contribuinte: " + nome + "\n"
				+ "Valor do imposto a ser pago: R$" + vlrImposto + "\n";
	}
	
}
