package com.renan.cursojava.aula43.labs;

public class Mamifero extends Animal{

	private String alimento;

	public Mamifero() {
		super();
		super.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s;
		
		if (alimento == null) {
			s = super.toString();
		} else {
			s = super.toString() + "\nAlimento: " + alimento;
		}
		
		return s;
	}
	
}
