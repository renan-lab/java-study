package com.renan.cursojava.aula20;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		
		while (!sair) {
			System.out.println("Escolha uma ação:\n"
					+ "1 - Adicionar compromisso\n"
					+ "2 - Verificar compromisso\n"
					+ "0 - Sair");
			opcao = scan.nextByte();
			
			switch (opcao) {
			case 1: //add compromisso
				boolean diaValido = false;
				boolean horaValida = false;
				int dia = 0;
				int hora = 0;
				
				while (!diaValido || !horaValida) {
					System.out.println("Entre com o dia do mês e a hora:");
					dia = scan.nextInt();
					hora = scan.nextInt();
					
					if ((dia > 0 && dia <= 31) && (hora >= 0 && hora <= 24)) {
						diaValido = true;
						horaValida = true;
					} else {
						System.out.println("Dia ou hora inválido! Digite novamente:");
					}
				}
				
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[dia][hora] = scan.next();
				break;
				
			case 2: //verifica compromisso
				diaValido = false;
				horaValida = false;
				dia = 0;
				hora = 0;
				
				while (!diaValido || !horaValida) {
					System.out.println("Entre com o dia do mês e a hora:");
					dia = scan.nextInt();
					hora = scan.nextInt();
					
					if ((dia > 0 && dia <= 31) && (hora >= 0 && hora <= 24)) {
						diaValido = true;
						horaValida = true;
					} else {
						System.out.println("Dia ou hora inválido! Digite novamente:");
					}
				}
				
				dia--;
				System.out.println("O compromisso agendado é: " + compromissos[dia][hora]);
				break;
				
			case 0: sair = true; break; //sair
			default: System.out.println("Ação Inválida!");
			}
		}

	}

}
