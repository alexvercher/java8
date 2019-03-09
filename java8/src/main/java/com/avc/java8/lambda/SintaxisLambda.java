package com.avc.java8.lambda;

public class SintaxisLambda {

	public double probarSintaxis() {
		//IOperacion operacion = (double num1, double num2) -> {return (num1+num2)/2;};
		/*
		IOperacion operacion = (double num1, double num2) -> {
			double a=2.0;
			return (num1+num2)/2 + a;
		};
		*/
		IOperacion operacion = (num1, num2) -> num1+num2/2;
		
		return operacion.calcularPromedio(2, 3);
	}

}
