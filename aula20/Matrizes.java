package com.renan.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = {{7, 8, 9, 10}, {8, 6, 7, 10}, {7, 5, 6, 4}};
		
		/*for (int i=0; i < notasAlunos.length; i++) {
			
			for (int j=0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " | ");
			}
			System.out.println();
		}*/
		
		double soma;
		
		for (int i=0; i < notasAlunos.length; i++) {
			
			soma = 0;
			for (int j=0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + (i+1) + " é: " + (soma / notasAlunos[i].length));
		}
		
		/* For Each
		for (double[] notaAluno : notasAlunos) {
			for (double nota : notaAluno) {
				System.out.print(nota + " | ");
			}
			System.out.println();
		}*/
		
		System.out.println();
		
		for (int i=0; i < notasAlunos.length; i++) {
			System.out.print("Aluno " + (i+1) + ": | ");
			for (int j=0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " | ");
			}
			System.out.println();
		}
		
	}

}
