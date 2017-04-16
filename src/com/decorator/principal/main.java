package com.decorator.principal;

import com.decorator.componentes.Combo;
import com.decorator.componentes.ComboBasico;
import com.decorator.decoradores.AdicionalesDecorator;
import com.decorator.decoradores.Papa;

public class main {

	public static void main(String[] args){
		
		Combo  combo = new ComboBasico();
		AdicionalesDecorator adicionales = new Papa(combo);
		System.out.println("Combo " + combo);
		System.out.println("Combo " + adicionales);
	}

}
