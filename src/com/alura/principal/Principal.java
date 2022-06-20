package com.alura.principal;

import javax.swing.JOptionPane;

import com.alura.funciones.Funciones;
import com.alura.monedas.Dolares;
import com.alura.monedas.PesoArgentino;

public class Principal {

	public static void main(String[] args) {
		Funciones misProcesos = new Funciones();		
		
		while(true) {
			String opciones = (JOptionPane.showInputDialog(
					null, 
					"Selecciona una opci�n de conversi�n",
					"Conversor con Java",
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					new Object[] {
							"Conversor de Moneda", 
							"Conversor de Temperatura",
							"Conversor de Longitud"
					},
					"Seleccion"
			)).toString();
			
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog(
						"Ingresa la cantidad de dinero que deseas convertir: "
				);
				
				double numero = misProcesos.validarNumero(input); 
				
				if( numero > 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null, 
							"Elije una opci�n para convertir", 
							"Conversor de Monedas", 
							JOptionPane.QUESTION_MESSAGE, 
							null, 
							new Object[] {
									"De Pesos a D�lares", 
									"De D�lares a Pesos"
							}, 
							"Seleccion"
					)).toString();
					
					if(tipoConversion == "De Pesos a D�lares") {
						PesoArgentino pesos = new PesoArgentino();
						String resultado = (pesos.convertirPesosADolares(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" D�lares");
						
						int respuesta = JOptionPane.showConfirmDialog(
								null, 
								"Deseas realizar otra conversion?"
						);
						
						if(JOptionPane.OK_OPTION != respuesta) {							
							System.out.println("Programa terminado");
							break;
						}						
					}
					
					if(tipoConversion == "De D�lares a Pesos") {
						Dolares dolares = new Dolares();
						String resultado = (dolares.convertirDolaresAPesos(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Pesos");
						
						int respuesta = JOptionPane.showConfirmDialog(
								null, 
								"Deseas realizar otra conversion?"
						);
						
						if(JOptionPane.OK_OPTION != respuesta) {							
							JOptionPane.showMessageDialog(null, "Programa terminado");
							break;
						}						
					}
				}				
			}
		}
	}
}