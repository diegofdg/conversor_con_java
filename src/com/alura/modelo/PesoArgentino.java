package com.alura.modelo;

import java.text.DecimalFormat;

import com.alura.controlador.Coordinador;

public class PesoArgentino {
	
	private double cotizacionEnDolares = 122.8541;
	private double cotizacionEnEuros = 129.1381;
	private double cotizacionEnLibrasEsterlinas = 150.4717;
	private double cotizacionEnYenJapones = 0.9095;
	private double cotizacionEnWonSurcoreano = 0.0951;
	Coordinador miCoordinador;
	
	public double getCotizacionEnDolares() {
		return cotizacionEnDolares;
	}
	
	public double getCotizacionEnEuros() {
		return cotizacionEnEuros;
	}
	
	public double getCotizacionEnLibrasEsterlinas() {
		return cotizacionEnLibrasEsterlinas;
	}
	
	public double getCotizacionEnYenJapones() {
		return cotizacionEnYenJapones;
	}
	
	public double getCotizacionEnWonSurcoreano() {
		return cotizacionEnWonSurcoreano;
	}

	public String convertirPesosADolares(double input) {		
		double resultado = input / this.getCotizacionEnDolares();		
		return miCoordinador.formatoResultado(resultado);
	}	
	
	public String convertirDolaresAPesos(double input) {		
		double resultado = input * this.getCotizacionEnDolares();		
		return miCoordinador.formatoResultado(resultado);
	}

	public String convertirPesosAEuros(double input) {
		double resultado = input / this.getCotizacionEnEuros();		
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirEurosAPesos(double input) {		
		double resultado = input * this.getCotizacionEnEuros();		
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirPesosALibrasEsterlinas(double input) {
		double resultado = input / this.getCotizacionEnLibrasEsterlinas();		
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirLibrasEsterlinasAPesos(double input) {		
		double resultado = input * this.getCotizacionEnLibrasEsterlinas();		
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirPesosAYenJapones(double input) {
		double resultado = input / this.getCotizacionEnYenJapones();		
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirYenJaponesAPesos(double input) {		
		double resultado = input * this.getCotizacionEnYenJapones();		
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirPesosAWonSurcoreano(double input) {
		double resultado = input / this.getCotizacionEnWonSurcoreano();		
		return miCoordinador.formatoResultado(resultado);
	}
	
	public String convertirWonSurcoreanoAPesos(double input) {		
		double resultado = input * this.getCotizacionEnWonSurcoreano();		
		return miCoordinador.formatoResultado(resultado);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;		
	}	
}