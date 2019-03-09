package com.avc.java8.lambda;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class LambdaApp{ 
    
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		lista.add("Code");
		lista.add("Mito");
		
		/*
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		*/
		
		//Lambda
		//Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		for (String elemento:lista) {
			System.out.println(elemento);
		}
	}

	public void calcular(){
		/*
		IOperacion operacion = new IOperacion() {
			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1+n2)/2;
			}
		};*/
		
		IOperacion operacion = (double num1, double num2) -> (num1+num2)/2;
		System.out.println(operacion.calcularPromedio(2, 3));
	}
}
