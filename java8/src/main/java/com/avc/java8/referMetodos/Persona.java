package com.avc.java8.referMetodos;

public class Persona {

	int id;
	String nombre;
	
	public Persona(){
		
	}
	
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
