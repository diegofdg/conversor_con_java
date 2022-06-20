package com.alura.controlador;

import com.alura.modelo.Funciones;
import com.alura.modelo.GradosCelsius;
import com.alura.modelo.Kilometros;
import com.alura.modelo.PesoArgentino;
import com.alura.vistas.VentanaPrincipal;

public class Coordinador {
	
	private VentanaPrincipal miVentanaPrincipal;
	private Funciones misFunciones;
	private PesoArgentino miPesoArgentino;
	private GradosCelsius misGradosCelsius;
	private Kilometros misKilometros;
	
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;		
	}
	
	public void setMiPesoArgentino(PesoArgentino miPesoArgentino) {
		this.miPesoArgentino = miPesoArgentino;		
	}
	
	public void setMisGradosCelsius(GradosCelsius misGradosCelsius) {
		this.misGradosCelsius = misGradosCelsius;		
	}	
	
	public void mostrarVentanaPrincipal() {
		miVentanaPrincipal.iniciarConversor();		
	}

	public void setMisFunciones(Funciones misFunciones) {
		this.misFunciones = misFunciones;		
	}

	public double validarNumero(String input) {
		return misFunciones.validarNumero(input);
	}
	
	public String convertirPesosADolares(double numero) {
		return miPesoArgentino.convertirPesosADolares(numero);
	}

	public String convertirPesosAEuros(double numero) {
		return miPesoArgentino.convertirPesosAEuros(numero);
	}

	public String convertirPesosALibrasEsterlinas(double numero) {
		return miPesoArgentino.convertirPesosALibrasEsterlinas(numero);
	}

	public String convertirPesosAYenJapones(double numero) {
		return miPesoArgentino.convertirPesosAYenJapones(numero);
	}

	public String convertirPesosAWonSurcoreano(double numero) {
		return miPesoArgentino.convertirPesosAWonSurcoreano(numero);
	}

	public String convertirDolaresAPesos(double numero) {
		return miPesoArgentino.convertirDolaresAPesos(numero);
	}

	public String convertirEurosAPesos(double numero) {
		return miPesoArgentino.convertirEurosAPesos(numero);
	}

	public String convertirLibrasEsterlinasAPesos(double numero) {
		return miPesoArgentino.convertirLibrasEsterlinasAPesos(numero);
	}

	public String convertirYenJaponesAPesos(double numero) {
		return miPesoArgentino.convertirYenJaponesAPesos(numero);
	}

	public String convertirWonSurcoreanoAPesos(double numero) {
		return miPesoArgentino.convertirWonSurcoreanoAPesos(numero);
	}
	
	public String convertirCelsiusEnFahrenheit(double numero) {
		return misGradosCelsius.convertirCelsiusEnFahrenheit(numero);
	}
	
	public String convertirFahrenheitEnCelsius(double numero) {
		return misGradosCelsius.convertirFahrenheitEnCelsius(numero);
	}

	public String convertirCelsiusEnKelvin(double numero) {
		return misGradosCelsius.convertirCelsiusEnKelvin(numero);
	}

	public String convertirKelvinEnCelsius(double numero) {
		return misGradosCelsius.convertirKelvinEnCelsius(numero);
	}

	public void setMisKilometros(Kilometros misKilometros) {
		this.misKilometros = misKilometros;
		
	}

	public String convertirKilometrosAMetros(double numero) {
		return misKilometros.convertirKilometrosAMetros(numero);
	}

	public String convertirKilometrosAMillas(double numero) {
		return misKilometros.convertirKilometrosAMillas(numero);
	}

	public String convertirKilometrosAYardas(double numero) {
		return misKilometros.convertirKilometrosAYardas(numero);
	}

	public String convertirMetrosAKilometros(double numero) {
		return misKilometros.convertirMetrosAKilometros(numero);
	}

	public String convertirMillasAKilometros(double numero) {
		return misKilometros.convertirMillasAKilometros(numero);
	}

	public String convertirYardasAKilometros(double numero) {
		return misKilometros.convertirYardasAKilometros(numero);
	}

	public String formatoResultado(double resultado) {
		return misFunciones.formatoResultado(resultado);
	}
}