package com.decorator.decoradores;

import com.decorator.componentes.Combo;

public class Carne extends AdicionalesDecorator {

	private Combo combo;

	public Carne(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescrpcion() +  " Porcion de Carne Adicional ";
	}

	@Override
	public double valor() {
		return 2.30 + combo.valor();
	}

}
