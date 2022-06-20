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
				
				double numero = miCoordinador.validarNumero(input); 
				
				if( numero > 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null, 
							"Elije una opci�n para convertir", 
							"Conversor de Monedas", 
							JOptionPane.QUESTION_MESSAGE, 
							null, 
							new Object[] {
									"De Pesos a D�lares",
									"De Pesos a Euros",
									"De Pesos a Libras Esterlinas",
									"De Pesos a Yen Japon�s",
									"De Pesos a Won Surcoreano",
									"De D�lares a Pesos",
									"De Euros a Pesos",
									"De Libras Esterlinas a Pesos",
									"De Yen Japon�s a Pesos",
									"De Won Surcoreano a Pesos",
							}, 
							"Seleccion"
					)).toString();
					
					if(tipoConversion == "De Pesos a D�lares") {						
						String resultado = (miCoordinador.convertirPesosADolares(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" D�lares");
						
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
					
					if(tipoConversion == "De Pesos a Yen Japon�s") {						
						String resultado = (miCoordinador.convertirPesosAYenJapones(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Yenes Japoneses");
						
						continuaEjecucion();											
					}
					
					if(tipoConversion == "De Pesos a Won Surcoreano") {						
						String resultado = (miCoordinador.convertirPesosAWonSurcoreano(numero));					
						JOptionPane.showMessageDialog(null, "Tienes "+resultado +" Wones Surcoreanos");
						
						continuaEjecucion();											
					}
					
					if(tipoConversion == "De D�lares a Pesos") {						
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
					
					if(tipoConversion == "De Yen Japon�s a Pesos") {						
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
