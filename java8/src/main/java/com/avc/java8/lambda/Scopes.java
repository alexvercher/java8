package com.avc.java8.lambda;

public class Scopes {

	private static double atributo1;
	private double atributo2;
	
	public double probarLocalVariable() {
		
		final double n3 = 3;
		/*
		IOperacionCalc operacion = new IOperacionCalc() {
			@Override
			public double calcular(double n1, double n2) {
				return n1+n2+n3;
			}
		};
		*/
		
		//IOperacionCalc operacion = (n1, n2) -> n1+n2+n3;
		
		IOperacionCalc operacion = (n1, n2) -> {
			return n1 + n2 + n3;
		};
		
		return operacion.calcular(1, 1);
	}
	
	public double probarAtributosStaticVariables() {
		
		IOperacionCalc operacion = (n1, n2) -> {
			atributo1 = n1 + n2;
			atributo2 = atributo1;
			return atributo2;
		};
		
		return operacion.calcular(3, 2);		
	}
}
