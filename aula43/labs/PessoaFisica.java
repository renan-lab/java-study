package com.renan.cursojava.aula43.labs;

public class PessoaFisica extends Contribuinte{

	public void calcularImposto() {
		
		if (super.getRendaBruta() >= 3600.01) {
			super.setVlrImposto((super.getRendaBruta() * 0.3) - 700);
		} else if (super.getRendaBruta() >= 2800.01 && super.getRendaBruta() <= 3600) {
			super.setVlrImposto((super.getRendaBruta() * 0.25) - 500);
		} else if (super.getRendaBruta() >= 2100.01 && super.getRendaBruta() <= 2800) {
			super.setVlrImposto((super.getRendaBruta() * 0.15) - 270);
		} else if (super.getRendaBruta() >= 1400.01 && super.getRendaBruta() <= 2100) {
			super.setVlrImposto((super.getRendaBruta() * 0.1) - 100);
		} else {
			super.setVlrImposto(0);
		}
		
	}
	
}
