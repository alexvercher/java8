package com.avc.java8.interfacesFuncionales;

import com.avc.java8.lambda.IOperacionCalc;

public class FuncInterApp {

	public double operar(double x, double y) {
		IOperacionCalc op = (n1, n2) -> n1 + n2;
		return op.calcular(x, y);
	}
}
