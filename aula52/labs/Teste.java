package com.renan.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while (opcao != 0) {
		
			opcao = obterOpcaoMenu(scan);
		
			if (opcao == 1) { //consultar contato
				consultarContato(scan, agenda);
			} else if (opcao == 2) { //add contato
				addContato(scan, agenda);
			}
			
		}
		
	}

	public static void addContato(Scanner scan, Agenda agenda) {
		
		try {
			
		System.out.println("Criando um contato");
		String nome = lerInformacao(scan, "Entre com o nome do contato:");
		String telefone = lerInformacao(scan, "Entre com o telefone do contato:");
		String email = lerInformacao(scan, "Entre com o email do contato:");
		
		Contato contato = new Contato();
		
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		
		System.out.println("Contato a ser criado:");
		System.out.println(contato);
		
		agenda.addContato(contato);
		
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda:");
			System.out.println(agenda);
		}
		
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		
		String nomeContato = lerInformacao(scan, "Entre com o nome do contato a ser pesquisado:");
		try {
			if (agenda.consultarContato(nomeContato) >= 0) {
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static String lerInformacao(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean opcaoValida = false;
		int opcao = 0;
		
		while (!opcaoValida) {
			
			System.out.println("Digite a opção desejada:\n"
					+ "1 - Consultar contato\n"
					+ "2 - Adicionar contato\n"
					+ "0 - Sair");
			
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if (opcao == 1 || opcao == 2 || opcao == 0) {
					opcaoValida = true;
				} else {
					throw new Exception();
				}
			}
			catch (Exception e) {
				System.out.println("Opção inválida, digite novamente\n");
			}
			
		}
		return opcao;
		
	}
	
}
