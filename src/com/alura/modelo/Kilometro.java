package com.alura.modelo;

import com.alura.controlador.Coordinador;

public class Kilometro {
	
	Coordinador miCoordinador;
	
	public String convertirKilometrosAMetros(double longitud) {
		double resultado = (longitud * 1000);
		return miCoordinador.formatoResultado(resultado);        
	}
	
	public String convertirKilometrosAMillas(double longitud) {
		double resultado = (longitud / 1.609);
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirKilometrosAYardas(double longitud) {
		double resultado = (longitud * 1094);
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirMetrosAKilometros(double longitud) {
		double resultado = (longitud / 1000);
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirMillasAKilometros(double longitud) {
		double resultado = (longitud * 1.609);
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirYardasAKilometros(double longitud) {
		double resultado = (longitud / 1094);
		return miCoordinador.formatoResultado(resultado);
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}