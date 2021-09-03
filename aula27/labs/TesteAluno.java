package com.renan.cursojava.aula27.labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		aluno.nome = scan.nextLine();
		System.out.println("Digite o nome do curso:");
		aluno.curso = scan.nextLine();
		System.out.println("Digite a matrícula:");
		aluno.matricula = scan.nextLine();
		
		for (int i=0; i < aluno.nomesDisciplinas.length; i++) {
			System.out.println("Digite o nome da disciplina " + (i + 1) + ":");
			aluno.nomesDisciplinas[i] = scan.next();
		}
		
		for (int i=0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno.nomesDisciplinas[i]);
			for (int j=0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Digite a nota " + (j+1) + " da disciplina:");
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.exibirInfo();

	}

}
