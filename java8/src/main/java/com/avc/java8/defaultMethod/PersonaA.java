package com.avc.java8.defaultMethod;

public interface PersonaA {

	public void caminar();
	
	default public void hablar() {
		System.out.println("Saludos a todos A");
	}
}
