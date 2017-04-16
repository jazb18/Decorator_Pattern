package com.decorator.componentes;

public class ComboBasico extends Combo{
	
	
	
	public ComboBasico() {
		descripcion = "Porcion de papas fritas más salsas, queso, hamburguesa sencilla, gaseosa";
//		setDescripcion("Porcion de papas fritas más salsas, queso, hamburguesa sencilla, gaseosa");
		
	}

	@Override
	public double valor() {
		return 5.20;
	}
	
}
