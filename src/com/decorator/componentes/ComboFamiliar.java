package com.decorator.componentes;

public class ComboFamiliar extends Combo {
	
	public ComboFamiliar() {
		super.descripcion = "Porcion de papas fritas más Salsas, queso, hamburguesa Mediana, gaseosa";
	}
	@Override
	public double valor() {
		return 6.20;
	}

}
