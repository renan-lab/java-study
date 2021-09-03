package com.renan.cursojava.aula33.labs;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] nomesDisciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
		nomesDisciplinas = new String[3];
		notasDisciplinas = new double[3][4];
	}

	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.nomesDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getNomesDisciplinas() {
		return nomesDisciplinas;
	}

	public void setNomesDisciplinas(String[] nomesDisciplinas) {
		this.nomesDisciplinas = nomesDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	public void setNomesDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomesDisciplinas[pos] = nomeDisciplina;
	}
	
	public void setNotasDisciplinasPos(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}
	
	public void exibirInfo() {
		System.out.println();
		System.out.println("Nome: " + nome + "\n"
				+ "Matrícula: " + matricula + "\n"
				+ "Curso: " + curso);
		
		System.out.println();
		double soma;
		for (int i=0; i < notasDisciplinas.length; i++) {
			soma = 0;
			System.out.print("Disciplina " + nomesDisciplinas[i] + ": | ");
			for (int j=0; j < notasDisciplinas[i].length; j++){
				System.out.print(notasDisciplinas[i][j] + " | ");
				soma += notasDisciplinas[i][j];
			}
			
			//verificar aprovação
			if (soma / notasDisciplinas[i].length < 7) {
				System.out.println("- Reprovado");
			} else {
				System.out.println("- Aprovado");
			}
		}
	}

}