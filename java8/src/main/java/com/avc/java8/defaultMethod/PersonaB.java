package com.avc.java8.defaultMethod;

public interface PersonaB {

	default public void hablar() {
		System.out.println("Saludos a todos B");
	}
}
