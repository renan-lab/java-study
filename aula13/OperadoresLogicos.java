package com.renan.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int vlr1 = 1;
		int vlr2 = 2;
		
		boolean resultado1 = (vlr1 == 1) && (vlr2 == 2);
		System.out.println("vlr1 é 1 AND vlr2 é 2: " + resultado1);
		
		boolean resultado2 = (vlr1 == 1) || (vlr2 == 2);
		System.out.println("vlr1 é 1 OR vlr2 é 2: " + resultado2 + "\n");
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(a ^ b);
		System.out.println(!a && b);
		
	}

}
