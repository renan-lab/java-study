package com.renan.cursojava.aula15;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as duas notas parciais obtidas durante um semestre:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2) / 2;
		String conceito = "";
		String situacao = "";
		
		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else {
			conceito = "E";
		}
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": situacao = "APROVADO"; break;
		case "D":
		case "E": situacao = "REPROVADO"; break;
		}
		
		System.out.println("Notas obtidas: " + n1 + " e " + n2 + "\n"
				         + "Média: " + media + "\n"
				         + "Conceito: " + conceito + "\n"
				         + "Situação: " + situacao);

	}

}
