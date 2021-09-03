package com.renan.cursojava.aula36.labs;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;
	
	public Aluno() {
		notas = new double[4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void setNotasPos(int pos, double nota) {
		notas[pos] = nota;
	}
	
}
