package com.renan.cursojava.aula20;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] jogoVelha = new char[3][3];
		
		String jogador1;
		String jogador2;
		
		System.out.println("Digite o nome do jogador 1:");
		jogador1 = scan.nextLine();
		System.out.println("Digite o nome do jogador 2:");
		jogador2 = scan.nextLine();
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0;
		int col = 0;
		
		while (!ganhou) {
			
			if (jogada % 2 != 0) { //jogador1
				System.out.println("Vez do " + jogador1 + ". Escolha linha e coluna (1-3)");
				sinal = 'X';
			} else { //jogador2
				System.out.println("Vez do " + jogador2 + ". Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			boolean colValida = false;
			
			while (!linhaValida || !colValida) {
				System.out.println("Entre com a linha e coluna (1, 2 ou 3)");
				linha = scan.nextInt();
				col = scan.nextInt();
				
				if ((linha >= 1 && linha <=3) && (col >= 1 && col <= 3)) {
					linhaValida = true;
					colValida = true;
				} else {
					System.out.println("Entrada inválida. Digite novamente.");
				}
			}
			
			linha--;
			col--;
			if (jogoVelha[linha][col] == 'X' || jogoVelha[linha][col] == 'O') {
				System.out.println("Posição ocupada. Digite novamente.");
			} else { //jogada valida
				jogoVelha[linha][col] = sinal;
				jogada++;
			}
			
			//imprimir tabuleiro
			for (int i=0; i < jogoVelha.length; i++) {
				for (int j=0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
			//verificar ganhador
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //linha1
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || //linha2
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //col1
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //col2
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || //col3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) { //diagonal
				ganhou = true;
				System.out.println("Parabéns, " + jogador1 + " ganhou!");
				
			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || //linha1
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || //linha2
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || //linha3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || //col1
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //col2
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || //col3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) { //diagonal
				ganhou = true;
				System.out.println("Parabéns, " + jogador2 + " ganhou!");
				} else if (jogada > 9) {
					ganhou = true;
					System.out.println("Deu velha!");
				}
		}
	}		
}
