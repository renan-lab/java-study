package com.renan.cursojava.aula27.labs;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		if (lampada.ligada) {
			System.out.println("Lâmpada está acesa.");
		}
		
		lampada.desligar();
		
		if (!lampada.ligada) {
			System.out.println("Lâmpada está apagada.");
		}
		
	}

}
