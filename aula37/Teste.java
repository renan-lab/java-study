package com.renan.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		aluno.setNome("Algu�m");
		professor.setNome("Algu�m 2");
		
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Professor: " + professor.getNome());
		
	}

}
