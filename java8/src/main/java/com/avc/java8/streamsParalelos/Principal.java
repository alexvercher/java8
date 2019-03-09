package com.avc.java8.streamsParalelos;

public class Principal {

	public static void main(String[] args) {
		
		ParalelStream app = new ParalelStream();
		app.llenar();
		app.probarStream();
		app.probarParalelo();
	}
}
