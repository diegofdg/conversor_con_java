package com.alura.main;

import com.alura.controlador.Coordinador;
import com.alura.modelo.Funciones;
import com.alura.modelo.PesoArgentino;
import com.alura.vistas.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		
		// Se instancian las clases
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		Funciones misFunciones = new Funciones();
		PesoArgentino miPesoArgentino = new PesoArgentino();
		Coordinador miCoordinador = new Coordinador();
		
		// Se establecen las relaciones entre clases
		miVentanaPrincipal.setCoordinador(miCoordinador);
		misFunciones.setCoordinador(miCoordinador);		
		miPesoArgentino.setCoordinador(miCoordinador);
		
		// Se establecen relaciones con la clase Coordinador
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMisFunciones(misFunciones);
		miCoordinador.setMiPesoArgentino(miPesoArgentino);
		miCoordinador.mostrarVentanaPrincipal();
	}
}