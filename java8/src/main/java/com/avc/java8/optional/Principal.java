package com.avc.java8.optional;

public class Principal {

	public static void main(String[] args) {
		
		OptionalApp app = new OptionalApp();
		//app.probar("Alex");
		//app.orElse("Alex");
		//app.orElseThrow(null);
		app.isPresent("Alex");
	}
}
