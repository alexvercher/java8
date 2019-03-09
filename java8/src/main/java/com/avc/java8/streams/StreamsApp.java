package com.avc.java8.streams;

import java.util.ArrayList;
import java.util.List;


public class StreamsApp {

	private List<String> lista;
	private List<String> numeros;
	
	public StreamsApp() {
		lista = new ArrayList<>();
		lista.add("Alejandro");
		lista.add("Vercher");
		lista.add("Chofre");
		lista.add("Alex");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
	}
	
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
	}
	
	public void ordenar() {
		//lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transformar() {
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
		numeros.stream().map(x -> Integer.parseInt(x)).forEach(System.out::println);
	}
	
	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);;
	}
	
	public void contar() {
		long x =lista.stream().count();
		System.out.println(x);
	}
}
