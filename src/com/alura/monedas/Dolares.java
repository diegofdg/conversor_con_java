package com.alura.monedas;

import java.text.DecimalFormat;

public class Dolares {
	private double cotizacionEnPesos = 122.86;
	private double cotizacionEnEuros = 0.95;
	private double cotizacionEnLibrasEsterlinas = 0.82;
	private double cotizacionEnYenJapones = 135.09;
	private double cotizacionEnWonSurcoreano = 1292.60;
	
	public double getCotizacionEnPesos() {
		return cotizacionEnPesos;
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

	public String convertirDolaresAPesos(double input) {		
		double resultado = input * this.getCotizacionEnPesos();		
        String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}
}
