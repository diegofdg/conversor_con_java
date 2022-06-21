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
							"Conversor de Moneda",
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
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Dólares"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Pesos a Euros") {
						String resultado = (miCoordinador.convertirPesosAEuros(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Euros"
						);
						
						continuaEjecucion();
						
					}
					
					if(tipoConversion == "De Pesos a Libras Esterlinas") {
						String resultado = (miCoordinador.convertirPesosALibrasEsterlinas(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Libras Esterlinas"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Pesos a Yen Japonés") {
						String resultado = (miCoordinador.convertirPesosAYenJapones(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Yenes Japoneses"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Pesos a Won Surcoreano") {
						String resultado = (miCoordinador.convertirPesosAWonSurcoreano(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Wones Surcoreanos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Dólares a Pesos") {
						String resultado = (miCoordinador.convertirDolaresAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Euros a Pesos") {
						String resultado = (miCoordinador.convertirEurosAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Libras Esterlinas a Pesos") {
						String resultado = (miCoordinador.convertirLibrasEsterlinasAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Yen Japonés a Pesos") {
						String resultado = (miCoordinador.convertirYenJaponesAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Won Surcoreano a Pesos") {
						String resultado = (miCoordinador.convertirWonSurcoreanoAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
				} else {
					JOptionPane.showMessageDialog(
							null, 
							"Ingresa un número válido"
					);
				}
				
			} else if(opciones == "Conversor de Temperatura") {
				String input = JOptionPane.showInputDialog(
						"Ingresa la cantidad de grados que deseas convertir: "
				);
				
				double numero = miCoordinador.validarNumero(input);
				
				if( numero != 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null, 
							"Elije una opción para convertir",
							"Conversor de Temperatura",
							JOptionPane.QUESTION_MESSAGE,
							null, 
							new Object[] {
									"De Celsius a Fahrenheit",
									"De Fahrenheit a Celsius",
									"De Celsius a Kelvin",
									"De Kelvin a Celsius",
							},
							"Seleccion"
					)).toString();
					
					if(tipoConversion == "De Celsius a Fahrenheit") {
						String resultado = miCoordinador.convertirCelsiusEnFahrenheit(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"º Celsius equivalen a "+resultado +"º Fahrenheit"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Fahrenheit a Celsius") {
						String resultado = miCoordinador.convertirFahrenheitEnCelsius(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"º Fahrenheit equivalen a "+resultado +"º Celsius"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Celsius a Kelvin") {
						String resultado = miCoordinador.convertirCelsiusEnKelvin(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"º Celsius equivalen a "+resultado +"º Kelvin"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Kelvin a Celsius") {
						String resultado = miCoordinador.convertirKelvinEnCelsius(numero);
						JOptionPane.showMessageDialog(
								null,
								input +"º Celsius equivalen a "+resultado +"º Kelvin"
						);
						
						continuaEjecucion();
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Ingresa un número válido");
				}
				
			} else if(opciones == "Conversor de Longitud") {
				String input = JOptionPane.showInputDialog(
						"Ingresa la longitud que deseas convertir: "
				);
				
				double numero = miCoordinador.validarNumero(input);
				
				if( numero > 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null,
							"Elije una opción para convertir",
							"Conversor de Longitudes",
							JOptionPane.QUESTION_MESSAGE,
							null,
							new Object[] {
									"De Kilómetros a Metros",
									"De Kilómetros a Millas",
									"De Kilómetros a Yardas",
									"De Metros a Kilómetros",
									"De Millas a Kilómetros",
									"De Yardas a Kilómetros",
							},
							"Seleccion"
					)).toString();
					
					if(tipoConversion == "De Kilómetros a Metros") {
						String resultado = miCoordinador.convertirKilometrosAMetros(numero);
						JOptionPane.showMessageDialog(null, input +" Kilómetros equivalen a "+resultado +" Metros");
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Kilómetros a Millas") {
						String resultado = miCoordinador.convertirKilometrosAMillas(numero);
						JOptionPane.showMessageDialog(null, input +" Kilómetros equivalen a "+resultado +" Millas");
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Kilómetros a Yardas") {
						String resultado = miCoordinador.convertirKilometrosAYardas(numero);
						JOptionPane.showMessageDialog(null, input +" Kilómetros equivalen a "+resultado +" Yardas");
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Metros a Kilómetros") {
						String resultado = miCoordinador.convertirMetrosAKilometros(numero);
						JOptionPane.showMessageDialog(null, input +" Metros equivalen a "+resultado +" Kilómetros");
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Millas a Kilómetros") {
						String resultado = miCoordinador.convertirMillasAKilometros(numero);
						JOptionPane.showMessageDialog(null, input +" Millas equivalen a "+resultado +" Kilómetros");
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Yardas a Kilómetros") {
						String resultado = miCoordinador.convertirYardasAKilometros(numero);
						JOptionPane.showMessageDialog(null, input +" Yardas equivalen a "+resultado +" Kilómetros");
						
						continuaEjecucion();
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Ingresa un número válido");
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
			JOptionPane.showMessageDialog(null, "Programa terminado");
			continua = false;
		}
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
