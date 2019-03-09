package com.avc.java8.referMetodos;

public class Principal {

	public static void main(String[] args) {
		
		MeRefApp app = new MeRefApp();
		//app.operar();
		//app.referenciarMetodoInstanciaObjetoArbitrario();
		IOperacionSaludar op = app::referenciarMetodoInstanciaObjetoParticular;
		op.saludar();
	}

}
