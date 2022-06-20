package com.alura.funciones;

public class Funciones {
	
	public double validarNumero(String input) {
        try {
        	return Double.parseDouble(input);
        } catch(NumberFormatException e) {
            return 0;
        }
	}
}