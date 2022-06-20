package com.alura.controlador;

import javax.swing.JOptionPane;

import com.alura.modelo.Procesos;

public class Principal {

	public static void main(String[] args) {
		Procesos misProcesos = new Procesos();
		
		while(true) {
			String opciones = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Conversor con Java", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if(misProcesos.ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					misProcesos.convertir(Minput);
					int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion afirmativa");
					} else {
						System.out.println("Programa terminado");
						break;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número");
				}
			} else if(opciones == "Conversor de Temperatura") {
				String input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir: ");
				if(misProcesos.ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					misProcesos.convertirTemperatura(Minput);
					
					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar?");
					if((respuesta == 0) && (misProcesos.ValidarNumero(input) == true)) {
						System.out.println("Selecciona opcion afirmativa");
					} else {
						System.out.println("Programa terminado");
						break;
					}
				} else {
					JOptionPane.showConfirmDialog(null, "Valor invalido");
				}				
			}
		}
	}
}