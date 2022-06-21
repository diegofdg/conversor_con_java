package com.alura.modelo;

import com.alura.controlador.Coordinador;

public class PesoArgentino {
	
	Coordinador miCoordinador;
	
	public String convertirPesosADolares(double input) {		
		double resultado = input / 122.8541;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirPesosAEuros(double input) {
		double resultado = input / 129.1381;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirPesosALibrasEsterlinas(double input) {
		double resultado = input / 150.4717;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirPesosAYenJapones(double input) {
		double resultado = input / 0.9095;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirPesosAWonSurcoreano(double input) {
		double resultado = input / 0.0951;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirDolaresAPesos(double input) {		
		double resultado = input * 122.8541;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirEurosAPesos(double input) {		
		double resultado = input * 129.1381;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirLibrasEsterlinasAPesos(double input) {		
		double resultado = input * 150.4717;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirYenJaponesAPesos(double input) {		
		double resultado = input * 0.9095;
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirWonSurcoreanoAPesos(double input) {		
		double resultado = input * 0.0951;
		return miCoordinador.formatoResultado(resultado);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}	
}