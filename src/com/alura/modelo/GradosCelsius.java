package com.alura.modelo;

import java.text.DecimalFormat;

import com.alura.controlador.Coordinador;

public class GradosCelsius {
	
	Coordinador miCoordinador;

	public String convertirCelsiusEnFahrenheit(double grados) {
		double resultado = (grados * 9/5) + 32;		
        String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}
	
	public String convertirCelsiusEnKelvin(double grados) {
		double resultado = grados + 273.15;		
        String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}
	
	public String convertirFahrenheitEnCelsius(double grados) {
		double resultado = (grados - 32) * 5/9;		
        String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}
	
	public String convertirKelvinEnCelsius(double grados) {
		double resultado = grados - 273.15;		
        String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
}