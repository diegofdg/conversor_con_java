package com.alura.monedas;

import java.text.DecimalFormat;

public class PesoArgentino {
	private double cotizacionEnDolares = 0.0081;
	private double cotizacionEnEuros = 0.0078;
	private double cotizacionEnLibrasEsterlinas = 0.0066;
	private double cotizacionEnYenJapones = 1.10;
	private double cotizacionEnWonSurcoreano = 10.52;
	
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
		double resultado = input * this.getCotizacionEnDolares();		
        String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}	
}