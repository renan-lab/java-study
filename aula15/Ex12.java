package com.renan.cursojava.aula15;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora e a quantidade de horas trabalhadas:");
		double vlrHora = scan.nextDouble();
		int qtdHora = scan.nextInt();
		
		double sal = vlrHora * qtdHora;
		double desc = 0;
		double ir = 0;
		String irPerc = "";
		double inss = sal * 0.1;
		double fgts = sal * 0.11;
		
		if (sal <= 900) {
			ir = 0;
			irPerc = "0%";
			desc += inss + ir;
		} else if (sal > 900 && sal <= 1500) {
			ir = sal * 0.05;
			irPerc = "5%";
			desc += inss + ir;
		} else if (sal > 1500 && sal <= 2500) {
			ir = sal * 0.1;
			irPerc = "10%";
			desc += inss + ir;
		} else {
			ir = sal * 0.2;
			irPerc = "20%";
			desc += inss + ir;
		}
		
		System.out.println("\nSalário Bruto: (" + vlrHora + " * " + qtdHora + ") -------------------- : R$" + sal + "\n"
						+  "(-) IR (" + irPerc + ") ----------------------------------- : R$" + ir + "\n"
						+  "(-) INSS (10%) -------------------------------- : R$" + inss + "\n"
						+  "FGTS (11%) ------------------------------------ : R$" + fgts + "\n"
						+  "Total de descontos ---------------------------- : R$" + desc + "\n"
						+  "Salário Líquido ------------------------------- : R$" + (sal - desc));

	}

}
