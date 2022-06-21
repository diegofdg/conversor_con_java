package com.alura.main;

import com.alura.controlador.Coordinador;
import com.alura.modelo.Funciones;
import com.alura.modelo.GradoCelsius;
import com.alura.modelo.Kilometro;
import com.alura.modelo.PesoArgentino;
import com.alura.vistas.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		Funciones misFunciones = new Funciones();
		PesoArgentino miPesoArgentino = new PesoArgentino();
		GradoCelsius misGradosCelsius = new GradoCelsius();
		Kilometro miKilometro = new Kilometro();
		Coordinador miCoordinador = new Coordinador();
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		misFunciones.setCoordinador(miCoordinador);
		miPesoArgentino.setCoordinador(miCoordinador);
		misGradosCelsius.setCoordinador(miCoordinador);
		miKilometro.setCoordinador(miCoordinador);
		
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMisFunciones(misFunciones);
		miCoordinador.setMiPesoArgentino(miPesoArgentino);
		miCoordinador.setMisGradosCelsius(misGradosCelsius);
		miCoordinador.setMisKilometros(miKilometro);
		
		miCoordinador.mostrarVentanaPrincipal();
	}
}