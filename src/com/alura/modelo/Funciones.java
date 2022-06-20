package com.alura.modelo;

import com.alura.controlador.Coordinador;

public class Funciones {
	
	Coordinador miCoordinador;
	
	public double validarNumero(String input) {
        try {
        	return Double.parseDouble(input);
        } catch(NumberFormatException e) {
            return 0;
        }
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;		
	}
}