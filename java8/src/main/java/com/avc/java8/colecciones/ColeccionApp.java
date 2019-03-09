package com.avc.java8.colecciones;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;
	
	public void llenarLista() {
		lista = new ArrayList<>();
		lista.add("Alejandro");
		lista.add("Vercher");
		lista.add("Chofre");
	}
	
	public void usarForEach() {
		/*
		for (String elemento : lista) {
			System.out.println(elemento);
		}*/
		
		//lista.forEach(x -> System.out.println(x));
		lista.forEach(System.out::println);
	}
	
	public void removeIf() {
		//Iterator<String> iterator = lista.iterator();
		/*
		while(iterator.hasNext()) {
			if(iterator.next().equalsIgnoreCase("Alejandro")) {
				iterator.remove();
			}
		}*/
		
		lista.removeIf(x -> x.equalsIgnoreCase("Alejandro"));
		
	}
	
	public void usarSort() {
		lista.sort((x, y) -> x.compareToIgnoreCase(y));
	}
}
