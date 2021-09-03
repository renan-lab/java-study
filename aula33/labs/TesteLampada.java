package com.renan.cursojava.aula33.labs;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		Scanner scan = new Scanner(System.in);
		
		boolean opcaoValida = false;
		byte opcao;
		
		while (!opcaoValida) {
			System.out.println("Digite a a��o:\n"
					+ "1 - Acender\n"
					+ "2 - Apagar");
			opcao = scan.nextByte();
		
			switch (opcao) {
			case 1: lampada.setLigar(true); opcaoValida = true; break;
			case 2: lampada.setLigar(false); opcaoValida = true; break;
			default: System.out.println("Op��o inv�lida");
			}
		}
		
		if (lampada.isLigar()) {
			System.out.println("L�mpada acesa");
		} else {
			System.out.println("L�mpada apagada");
		}

	}

}