package com.decorator.decoradores;

import com.decorator.componentes.Combo;

public class Tomate extends AdicionalesDecorator {

	private Combo combo;

	public Tomate(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescrpcion() + " Porcion de Tomate Adicional ";
	}

	@Override
	public double valor() {
		return 1.25 + combo.valor();
	}

}
