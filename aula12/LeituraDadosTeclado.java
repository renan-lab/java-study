package com.renan.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: " + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se possui algum pet:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		int qtdFilhos = scan.nextInt();
		double altura = scan.nextDouble();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores:\n" +
		"Primeiro nome: " + primeiroNome + "\n"
		+ "Idade: " + idade + "\n"
		+ "Quantidade de filhos: " + qtdFilhos + "\n"
		+ "Altura: " + altura + "\n"
		+ "Possui pet: " + temPet);
		
	}

}