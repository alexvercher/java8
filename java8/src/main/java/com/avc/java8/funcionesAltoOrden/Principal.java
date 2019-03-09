package com.avc.java8.funcionesAltoOrden;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		HighApp app = new HighApp();
		//app.imprimir(app.convertirMayusculas, "alex");
		//app.imprimir(app.convertirMinusculas, "VERCHER");
		
		String respuesta = app.mostrar("Hola ").apply("Alex");
		//System.out.println(respuesta);
		
		List<String> lista = new ArrayList<String>();
		lista.add("Alejandro");
		lista.add("Vercher");
		lista.add("Chofre");
		
		app.filtrar(lista, System.out::println, 7, null);
		app.filtrar(lista, System.out::println, 0, "Ale");
	}

}
