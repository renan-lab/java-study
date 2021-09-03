package com.renan.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteAgenda {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[3];
		
		System.out.println("Digite o nome da agenda:");
		agenda.setNome(scan.nextLine());
		
		System.out.println("Entre com 3 contatos:");
		for (int i=0; i < 3; i++) {
			Contato contato = new Contato();
			
			System.out.println((i+1) + "º contato:");
			System.out.println("Digite o nome:");
			contato.setNome(scan.nextLine());
			System.out.println("Digite o telefone:");
			contato.setTelefone(scan.nextLine());
			System.out.println("Digite o email:");
			contato.setEmail(scan.nextLine());
			
			contatos[i] = contato;
		}
		agenda.setContatos(contatos);
		
		System.out.println();
		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
		scan.close();
	}

}
