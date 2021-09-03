package com.renan.cursojava.aula19;

public class Ex1 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		for (int i=0; i < a.length; i++) {
			a[i] = i;
			b[i] = a[i];
			System.out.println("A: " + a[i] + "\n"
					+ "B: " + b[i]);
		}
		
	}

}
