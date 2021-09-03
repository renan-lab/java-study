package com.renan.cursojava.aula43.labs;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Mamifero camelo = new Mamifero();
		
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero ursoDoCanada = new Mamifero();
		
		ursoDoCanada.setNome("Urso-do-canadá");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = ursoDoCanada;
		
		System.out.println("Zoo:");
		System.out.println("--------------------------");
		for (Animal animal : animais) {
			System.out.println(animal);
			System.out.println("--------------------------");
		}
		
	}

}
