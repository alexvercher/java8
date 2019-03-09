package com.avc.java8.anotacionesRepeticion;

import com.avc.java8.anotacionesRepeticion.App.Lenguaje;
import com.avc.java8.anotacionesRepeticion.App.LenguajeProgramacion;
import com.avc.java8.anotacionesRepeticion.App.Lenguajes;

public class Principal {

	public static void main(String[] args) {
		Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("Se tiene " + lenguajeArray.length + " anotaciones en lenguaje");
		
		Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
		for( Lenguaje elemento:len.value()) {
			System.out.println(elemento.value());
		}
	}

}
