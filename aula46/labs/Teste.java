package com.renan.cursojava.aula46.labs;

import java.text.DecimalFormat;

public class Teste {

	public static void main(String[] args) {
		
		Cubo cubo = new Cubo();
		Cilindro cilindro = new Cilindro();
		Piramide piramide = new Piramide();
		
		cubo.setNome("Cubo");
		cilindro.setNome("Cilindro");
		piramide.setNome("Pirâmide");
		
		Quadrado quadrado = new Quadrado();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		
		quadrado.setNome("Quadrado");
		circulo.setNome("Círculo");
		triangulo.setNome("Triângulo");
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = cubo;
		figuras[1] = cilindro;
		figuras[2] = piramide;
		figuras[3] = quadrado;
		figuras[4] = circulo;
		figuras[5] = triangulo;
		
		DecimalFormat deci = new DecimalFormat("0.00");
		
		for (FiguraGeometrica figura : figuras) {
			if (figura instanceof Figura3D) {
				System.out.println("Figura: " + figura.getNome());
				if (figura instanceof Cubo) {
					System.out.println("Área: " + Math.pow(3, 2));
					System.out.println("Volume: " + Math.pow(3, 3));
					System.out.println();
				} else if (figura instanceof Cilindro) {
					System.out.println("Área: " + deci.format(2 * (Math.PI * Math.pow(2, 2)) + 2 * (Math.PI * 2 * 4)));
					System.out.println("Volume: " + deci.format(Math.PI * Math.pow(2, 2) * 4));
					System.out.println();
				} else {
					System.out.println();
				}
			}
		}

	}

}
