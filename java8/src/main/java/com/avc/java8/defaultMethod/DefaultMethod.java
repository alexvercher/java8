package com.avc.java8.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{

	@Override
	public void caminar() {
		System.out.println("Caminando");
	}

	@Override
	public void hablar() {
		PersonaA.super.hablar();
	}
	 
}
