package com.alura.controlador;

import com.alura.modelo.Funciones;
import com.alura.modelo.GradoCelsius;
import com.alura.modelo.Kilometro;
import com.alura.modelo.PesoArgentino;
import com.alura.vistas.VentanaPrincipal;

public class Coordinador {
	
	private VentanaPrincipal miVentanaPrincipal;
	private Funciones misFunciones;
	private PesoArgentino miPesoArgentino;
	private GradoCelsius miGradoCelsius;
	private Kilometro miKilometro;
	
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	public void setMisFunciones(Funciones misFunciones) {
		this.misFunciones = misFunciones;
	}

	public void setMiPesoArgentino(PesoArgentino miPesoArgentino) {
		this.miPesoArgentino = miPesoArgentino;
	}
	
	public void setMisGradosCelsius(GradoCelsius miGradoCelsius) {
		this.miGradoCelsius = miGradoCelsius;
	}
	
	public void setMisKilometros(Kilometro miKilometro) {
		this.miKilometro = miKilometro;
	}
	
	public void mostrarVentanaPrincipal() {
		miVentanaPrincipal.iniciarConversor();		
	}

	public double validarNumero(String input) {
		return misFunciones.validarNumero(input);
	}
	
	public String formatoResultado(double resultado) {
		return misFunciones.formatoResultado(resultado);
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
		return miGradoCelsius.convertirCelsiusEnFahrenheit(numero);
	}
	
	public String convertirCelsiusEnKelvin(double numero) {
		return miGradoCelsius.convertirCelsiusEnKelvin(numero);
	}
	
	public String convertirFahrenheitEnCelsius(double numero) {
		return miGradoCelsius.convertirFahrenheitEnCelsius(numero);
	}
	
	public String convertirKelvinEnCelsius(double numero) {
		return miGradoCelsius.convertirKelvinEnCelsius(numero);
	}

	public String convertirKilometrosAMetros(double numero) {
		return miKilometro.convertirKilometrosAMetros(numero);
	}

	public String convertirKilometrosAMillas(double numero) {
		return miKilometro.convertirKilometrosAMillas(numero);
	}

	public String convertirKilometrosAYardas(double numero) {
		return miKilometro.convertirKilometrosAYardas(numero);
	}

	public String convertirMetrosAKilometros(double numero) {
		return miKilometro.convertirMetrosAKilometros(numero);
	}

	public String convertirMillasAKilometros(double numero) {
		return miKilometro.convertirMillasAKilometros(numero);
	}

	public String convertirYardasAKilometros(double numero) {
		return miKilometro.convertirYardasAKilometros(numero);
	}
}