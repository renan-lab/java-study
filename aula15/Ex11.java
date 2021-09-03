package com.renan.cursojava.aula15;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		double sal = scan.nextDouble();
		
		String perc = "";
		double salNovo = 0;
		
		if (sal <= 280) {
			salNovo = sal * 1.20;
			perc = "20%";
		} else if (sal > 280 && sal < 700) {
			salNovo = sal * 1.15;
			perc = "15%";
		} else if (sal >= 700 && sal < 1500) {
			salNovo = sal * 1.1;
			perc = "10%";
		} else {
			salNovo = sal * 1.05;
			perc = "5%";
		}
		
		System.out.println("Salário antes do reajuste: R$" + sal + "\n"
				+ "Percentual de aumento aplicado: " + perc + "\n"
				+ "Valor do aumento: R$" + (salNovo - sal) + "\n"
				+ "Novo salário após o aumento: R$" + salNovo);

	}

}
