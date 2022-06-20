package com.alura.principal;

import javax.swing.JOptionPane;

import com.alura.funciones.Funciones;
import com.alura.monedas.PesoArgentino;

public class Principal {

	public static void main(String[] args) {
		Funciones misProcesos = new Funciones();
		PesoArgentino pesos = new PesoArgentino();
		
		while(true) {
			String opciones = (JOptionPane.showInputDialog(
					null, 
					"Selecciona una opción de conversión",
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
							"Elije una opción para convertir", 
							"Conversor de Monedas", 
							JOptionPane.QUESTION_MESSAGE, 
							null, 
							new Object[] {
									"De Pesos a Dólares",
									"De Pesos a Euros",
									"De Pesos a Libras Esterlinas",
									"De Pesos a Yen Japonés",
									"De Pesos a Won Surcoreano",
									"De Dólares a Pesos",
									"De Euros a Pesos",
									"De Libras Esterlinas a Pesos",
									"De Yen Japonés a Pesos",
									"De Won Surcoreano a Pesos",
							}, 
							"Seleccion"
					)).toString();
					
					if(tipoConversion == "De Pesos a Dólares") {						
						String resultado = (pesos.convertirPesosADolares(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Dólares");
						
						int respuesta = JOptionPane.showConfirmDialog(
								null, 
								"Deseas realizar otra conversion?"
						);
						
						if(JOptionPane.OK_OPTION != respuesta) {							
							System.out.println("Programa terminado");
							break;
						}						
					}
					
					if(tipoConversion == "De Pesos a Euros") {						
						String resultado = (pesos.convertirPesosAEuros(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Euros");
						
						int respuesta = JOptionPane.showConfirmDialog(
								null, 
								"Deseas realizar otra conversion?"
						);
						
						if(JOptionPane.OK_OPTION != respuesta) {							
							System.out.println("Programa terminado");
							break;
						}						
					}
					
					if(tipoConversion == "De Pesos a Libras Esterlinas") {						
						String resultado = (pesos.convertirPesosALibrasEsterlinas(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Libras Esterlinas");
						
						int respuesta = JOptionPane.showConfirmDialog(
								null, 
								"Deseas realizar otra conversion?"
						);
						
						if(JOptionPane.OK_OPTION != respuesta) {							
							System.out.println("Programa terminado");
							break;
						}						
					}
					
					if(tipoConversion == "De Pesos a Yen Japonés") {						
						String resultado = (pesos.convertirPesosAYenJapones(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Yenes Japoneses");
						
						int respuesta = JOptionPane.showConfirmDialog(
								null, 
								"Deseas realizar otra conversion?"
						);
						
						if(JOptionPane.OK_OPTION != respuesta) {							
							System.out.println("Programa terminado");
							break;
						}						
					}
					
					if(tipoConversion == "De Pesos a Won Surcoreano") {						
						String resultado = (pesos.convertirPesosAWonSurcoreano(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Wones Surcoreanos");
						
						int respuesta = JOptionPane.showConfirmDialog(
								null, 
								"Deseas realizar otra conversion?"
						);
						
						if(JOptionPane.OK_OPTION != respuesta) {							
							System.out.println("Programa terminado");
							break;
						}						
					}
					
					if(tipoConversion == "De Dólares a Pesos") {						
						String resultado = (pesos.convertirDolaresAPesos(numero));					
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
					
					if(tipoConversion == "De Euros a Pesos") {						
						String resultado = (pesos.convertirEurosAPesos(numero));					
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
					
					if(tipoConversion == "De Libras Esterlinas a Pesos") {						
						String resultado = (pesos.convertirLibrasEsterlinasAPesos(numero));					
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
					
					if(tipoConversion == "De Yen Japonés a Pesos") {						
						String resultado = (pesos.convertirYenJaponesAPesos(numero));					
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
					
					if(tipoConversion == "De Won Surcoreano a Pesos") {						
						String resultado = (pesos.convertirWonSurcoreanoAPesos(numero));					
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