package com.renan.cursojava.aula43.labs;

public class Peixe extends Animal{

	private String caracteristicas;

	public Peixe() {
		super();
		caracteristicas = "Barbatanas e cauda";
		super.setAmbiente("Mar");
		super.setPatas(0);
		super.setCor("Cinzento");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCaracterísticas: " + caracteristicas;
	}
	
}
