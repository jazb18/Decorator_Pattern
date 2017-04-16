package com.decorator.decoradores;

import com.decorator.componentes.Combo;

public class Papa extends AdicionalesDecorator {

	private Combo combo;

	public Papa(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescrpcion() + " Porcion de Papa Adicional ";
	}

	@Override
	public double valor() {
		return 0.25 + combo.valor();
	}

	@Override
	public String toString() {
		return "Papa [combo=" + combo + ", getDescripcion()=" + getDescripcion() + ", valor()=" + valor() + "]";
	}

	
	

}
