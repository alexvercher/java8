package com.avc.java8.optional;

import java.util.Optional;

public class OptionalApp {

	public void probar(String valor) {
		//System.out.println(valor.contains("le"));
		
		try {
			Optional op = Optional.empty();
			op.get();
		}catch(Exception e) {
			System.out.println("No hay elemento");
		}

	}
	
	public void orElse(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("Predeterminado");
		System.out.println(x);
	}
	
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
	}
	
	public void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}
}
