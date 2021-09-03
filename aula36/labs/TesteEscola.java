package com.renan.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteEscola {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Curso curso = new Curso();
		Aluno[] alunos = new Aluno[5];
		Professor[] professores = new Professor[1];
		Professor professor = new Professor();
		
		System.out.println("Digite o curso:");
		curso.setNome(scan.nextLine());
		System.out.println("Digite o horário:");
		curso.setHorario(scan.nextLine());
		
		System.out.println("Digite o nome do professor:");
		professor.setNome(scan.nextLine());
		System.out.println("Digite o departamento:");
		professor.setDepartamento(scan.nextLine());
		System.out.println("Digite o email:");
		professor.setEmail(scan.nextLine());
		
		professores[0] = professor;
		curso.setProfessores(professores);
		
		for (int i=0; i < 5; i++) {
			Aluno aluno = new Aluno();
			
			scan.nextLine();
			System.out.println((i+1) + "º aluno:");
			System.out.println("Digite o nome:");
			aluno.setNome(scan.nextLine());
			System.out.println("Digite a matrícula:");
			aluno.setMatricula(scan.nextLine());
			
			for (int j=0; j < aluno.getNotas().length; j++) {
				System.out.println("Digite a " + (j+1) + "ª nota:");
				aluno.setNotasPos(j, scan.nextDouble());
			}
			
			alunos[i] = aluno;
		}
		curso.setAlunos(alunos);
		
		scan.close();
		
		curso.exibirInfo();
	
	}

}
