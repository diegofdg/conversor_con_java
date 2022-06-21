package com.alura.modelo;

import java.text.DecimalFormat;
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
	
	public String formatoResultado(double resultado) {
		String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}
}