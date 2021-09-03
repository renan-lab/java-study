package com.renan.cursojava.aula45;

public class Aluno extends Pessoa {

	private String[] cursos;
	private double[][] notas;
	
	public Aluno() {
		super();
	}
	public Aluno(String nome, String endereco, String telefone, String[] cursos, double[][] notas) {
		super(nome, endereco, telefone);
		this.cursos = cursos;
		this.notas = notas;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("4857389454");
		
		this.setCpf("59894835907");
	}
	public String obterEtiquetaEndereco() {
		String s = "Endereço do aluno: ";
		s += super.getEndereco();
		
		return s;
	}

	
}
