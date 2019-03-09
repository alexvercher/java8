package com.avc.java8.lambda;


public class Principal {

	public static void main(String[] args) {
		//LambdaApp app = new LambdaApp();
		//app.ordenar();
		//app.calcular();
		
		//SintaxisLambda appLambda = new SintaxisLambda();
		//System.out.println(appLambda.probarSintaxis());
		
		Scopes appScopes = new Scopes();
		//System.out.println(appScopes.probarLocalVariable());
		System.out.println(appScopes.probarAtributosStaticVariables());
	}

}
