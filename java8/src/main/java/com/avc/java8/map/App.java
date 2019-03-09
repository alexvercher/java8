package com.avc.java8.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class App {

	private Map<Integer, String> map;
	
	public void poblar() {
		map = new HashMap<>();
		map.put(1, "Alejandro");
		map.put(2, "Vercher");
		map.put(3, "Chofre");
	}
	
	public void imprimir_v7() {
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Llave: " + e.getKey() + " y valor: " + e.getValue());
		}
	}
	
	public void imprimir_v8() {
		//map.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: " + v));
		map.entrySet().stream().forEach(System.out::println);
	}
	
	public void recolectar() {
		Map<Integer, String> mapaRecolect = map.entrySet().stream()
				.filter(e -> e.getValue().contains("Cho"))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		mapaRecolect.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: " + v) );
	}
	
	public void insertarSiAusente() {
		map.putIfAbsent(3, "Jandro");
	}
	
	public void operarSiPresente() {
		map.computeIfPresent(3, (k, v) -> k + v);
		System.out.println(map.get(3));
	}
	
	public void obtenerOrPredeterminado() {
		String valor = map.getOrDefault(4, "Valor por defecto");
		System.out.println(valor);
	}
}
