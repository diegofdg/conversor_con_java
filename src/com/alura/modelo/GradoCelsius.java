package com.alura.modelo;

import com.alura.controlador.Coordinador;

public class GradoCelsius {
	
	Coordinador miCoordinador;

	public String convertirCelsiusEnFahrenheit(double grados) {
		double resultado = (grados * 9/5) + 32;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirCelsiusEnKelvin(double grados) {
		double resultado = grados + 273.15;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirFahrenheitEnCelsius(double grados) {
		double resultado = (grados - 32) * 5/9;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirKelvinEnCelsius(double grados) {
		double resultado = grados - 273.15;
		return miCoordinador.formatoResultado(resultado);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}