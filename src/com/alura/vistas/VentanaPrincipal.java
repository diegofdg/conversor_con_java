package com.alura.vistas;

import javax.swing.JOptionPane;
import com.alura.controlador.Coordinador;

public class VentanaPrincipal {
	
	Coordinador miCoordinador;
	boolean continua = true;

	public void iniciarConversor() {
		
		while(continua) {
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
				
				double numero = miCoordinador.validarNumero(input); 
				
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
						String resultado = (miCoordinador.convertirPesosADolares(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Dólares");
						
						continuaEjecucion();												
					}
					
					if(tipoConversion == "De Pesos a Euros") {						
						String resultado = (miCoordinador.convertirPesosAEuros(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Euros");
						
						continuaEjecucion();
						
					}
					
					if(tipoConversion == "De Pesos a Libras Esterlinas") {						
						String resultado = (miCoordinador.convertirPesosALibrasEsterlinas(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Libras Esterlinas");
						
						continuaEjecucion();													
					}
					
					if(tipoConversion == "De Pesos a Yen Japonés") {						
						String resultado = (miCoordinador.convertirPesosAYenJapones(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Yenes Japoneses");
						
						continuaEjecucion();											
					}
					
					if(tipoConversion == "De Pesos a Won Surcoreano") {						
						String resultado = (miCoordinador.convertirPesosAWonSurcoreano(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Wones Surcoreanos");
						
						continuaEjecucion();											
					}
					
					if(tipoConversion == "De Dólares a Pesos") {						
						String resultado = (miCoordinador.convertirDolaresAPesos(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Pesos");
						
						continuaEjecucion();										
					}
					
					if(tipoConversion == "De Euros a Pesos") {						
						String resultado = (miCoordinador.convertirEurosAPesos(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Pesos");
						
						continuaEjecucion();											
					}
					
					if(tipoConversion == "De Libras Esterlinas a Pesos") {						
						String resultado = (miCoordinador.convertirLibrasEsterlinasAPesos(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Pesos");
						
						continuaEjecucion();											
					}
					
					if(tipoConversion == "De Yen Japonés a Pesos") {						
						String resultado = (miCoordinador.convertirYenJaponesAPesos(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Pesos");
						
						continuaEjecucion();									
					}
					
					if(tipoConversion == "De Won Surcoreano a Pesos") {						
						String resultado = (miCoordinador.convertirWonSurcoreanoAPesos(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Pesos");
						
						continuaEjecucion();											
					}
				}				
			}
		}
	}

	private void continuaEjecucion() {
		int respuesta = JOptionPane.showConfirmDialog(
				null, 
				"Deseas realizar otra conversion?"
		);
		
		if(JOptionPane.OK_OPTION != respuesta) {							
			System.out.println("Programa terminado");
			continua = false;
		}		
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;		
	}
}
