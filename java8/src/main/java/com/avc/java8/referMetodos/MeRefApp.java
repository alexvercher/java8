package com.avc.java8.referMetodos;

import java.util.Arrays;
//import java.util.Comparator;

public class MeRefApp {

	public static void referenciarMetodoStatic() {
		System.out.println("Metodo referido static");
	}

	public void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] nombres = {"Mito", "Code", "Alex"};
		
		/*Arrays.sort(nombres, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});*/
		
		Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(Arrays.toString(nombres));
		
		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));
	}
	
	public void referenciarMetodoInstanciaObjetoParticular() {
		System.out.println("Metodo referido instancia de clase");
	}
	
	public void referenciarConstructor() {
		IPersona iper = new IPersona() {
			@Override
			public Persona crear(int id, String nombre) {
				return new Persona(id, nombre);
			}
		};
		iper.crear(1, "Alex");
		
		IPersona iper2 = (x, y) -> new Persona(x, y);
		Persona per = iper2.crear(2, "Vercher");
		System.out.println(per.getId() + " - " + per.getNombre());
		
		IPersona iper3 = Persona::new;
		Persona per2 = iper3.crear(3, "Chofre");
		System.out.println(per2.getId() + " - " + per2.getNombre());
	}
	
	public void operar() {
		IOperacionSaludar op = () -> MeRefApp.referenciarMetodoStatic();
		op.saludar();
		
		IOperacionSaludar op2 = MeRefApp::referenciarMetodoStatic;
		op2.saludar();
	}
	
	
}
