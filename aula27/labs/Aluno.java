package com.renan.cursojava.aula27.labs;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] nomesDisciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];
	
	void exibirInfo() {
		
		System.out.println();
		System.out.println("Nome: " + nome +"\n"
				+ "Matrícula: " + matricula + "\n"
				+ "Curso: " + curso);
		
		double soma;
		for (int i=0; i < notasDisciplinas.length; i++) {
			soma = 0;
			System.out.print(nomesDisciplinas[i] + ": | ");
			for (int j=0; j < notasDisciplinas[i].length; j++) {
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
