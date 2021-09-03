package com.renan.cursojava.aula19;

public class Ex10 {

	public static void main(String[] args) {
		
		double[] a = new double[10];
		double[] b = new double[10];
		
		
		for (int i=0; i < a.length; i++) {
			a[i] = i;
			b[i] = a[i] % 2;
			System.out.println("Valor " + (i+1) + ": " + b[i]);
		}

	}

}
