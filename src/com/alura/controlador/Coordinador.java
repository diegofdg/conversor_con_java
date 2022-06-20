package com.alura.controlador;

import com.alura.modelo.Funciones;
import com.alura.modelo.PesoArgentino;
import com.alura.vistas.VentanaPrincipal;

public class Coordinador {
	
	private VentanaPrincipal miVentanaPrincipal;
	private Funciones misFunciones;
	private PesoArgentino miPesoArgentino;
	
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;		
	}
	
	public void setMiPesoArgentino(PesoArgentino miPesoArgentino) {
		this.miPesoArgentino = miPesoArgentino;		
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
}