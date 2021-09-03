package com.renan.cursojava.aula36.labs;

import java.text.DecimalFormat;

public class Curso {

	private String nome;
	private String horario;
	private Professor[] professores;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor[] getProfessores() {
		return professores;
	}
	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public void exibirInfo() {
		
		DecimalFormat deci = new DecimalFormat("0.00");
		
		System.out.println();
		System.out.println("Curso: " + nome + "\n"
				+ "Horário: " + horario);
		
		if (professores != null) {
			System.out.println("Professor: " + professores[0].getNome() + "\n"
					+ "Departamento: " + professores[0].getDepartamento() + "\n"
					+ "Email: " + professores[0].getEmail());
		}
		System.out.println();
		
		if (alunos != null) {
			
			double somaTotal = 0;
			double notasTotal = 0;
			for (int i=0; i < alunos.length; i++) {
				double soma = 0;
				notasTotal += alunos[i].getNotas().length;
				System.out.println("Aluno: " + alunos[i].getNome());
				System.out.print("Notas: | ");
				for (int j=0; j < alunos[i].getNotas().length; j++) {
					System.out.print(alunos[i].getNotas()[j] + " | ");
					soma += alunos[i].getNotas()[j];
				}
				
				if (soma / alunos[i].getNotas().length < 7) {
					System.out.println("- Reprovado\n");
				} else {
					System.out.println("- Aprovado\n");
				}
				somaTotal += soma;
			}
			System.out.println("Média da turma: " + deci.format(somaTotal / notasTotal));
			
		}
		
	}
	
}
