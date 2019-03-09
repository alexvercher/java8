package com.avc.java8.streamsParalelos;

import java.util.ArrayList;
import java.util.List;

public class ParalelStream {

	private List<Integer> numeros;
	
	public void llenar() {
		numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
	}
	
	public void probarStream() {
		numeros.stream().forEach(System.out::println);
	}
	
	public void probarParalelo() {
		numeros.parallelStream().forEach(System.out::println);
	}
}
