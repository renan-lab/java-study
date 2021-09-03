package com.renan.cursojava.aula33.labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno:");
		aluno.setNome(scan.next());
		System.out.println("Digite o número de matrícula:");
		aluno.setMatricula(scan.next());
		System.out.println("Digite o curso:");
		aluno.setCurso(scan.next());
		
		for (int i=0; i < aluno.getNomesDisciplinas().length; i++) {
			System.out.println("Digite o nome da " + (i+1) + "ª disciplina:");
			aluno.setNomesDisciplinaPos(i, scan.next());
		}
		
		for (int i=0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Digite as notas da disciplina de " + aluno.getNomesDisciplinas()[i]);
			for (int j=0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Digite a " + (j+1) + "ª nota:");
				aluno.setNotasDisciplinasPos(i, j, scan.nextDouble());
			}
		}
		
		aluno.exibirInfo();
		
	}

}
