package com.decorator.componentes;

public abstract class Combo {

	public String descripcion;

	public abstract double valor();

	public void setDescripcion(String descripcion) {

		this.descripcion = descripcion;
	}

	public String getDescrpcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "Combo [descripcion=" + descripcion + "]";
	}
	
	
}
