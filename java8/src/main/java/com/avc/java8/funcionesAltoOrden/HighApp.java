package com.avc.java8.funcionesAltoOrden;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {

	public Function<String, String> convertirMayusculas = x -> x.toUpperCase();
	public Function<String, String> convertirMinusculas = x -> x.toLowerCase();
	
	public void imprimir(Function<String, String> funcion, String valor) {
		System.out.println(funcion.apply(valor));
	}
	
	public Function<String, String> mostrar(String mensaje) {
		//return (String x) -> mensaje + x;
		return x -> mensaje + x;
	}
	
	public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena) {
		//lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
		lista.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumidor);
	}
	
	public Predicate<String> establecerLogicaFiltro(int longitud) {
		return texto -> texto.length() < longitud;
	}
	
	public Predicate<String> establecerLogicaFiltro(String cadena) {
		return texto -> texto.contains(cadena);
	}
}
