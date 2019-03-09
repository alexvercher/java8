package com.avc.java8.rxJava;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.functions.Action1;


public class Principal {

	public static void main(String[] args) {

		/*List<String> lista = new ArrayList<>();
		lista.add("Alejandro");
		lista.add("Vercher");
		lista.add("Chofre");
		
		Observable<String> obs = Observable.from(lista);
		obs.subscribe(new Action1<String>() {
			@Override
			public void call(String elemento) {
				System.out.println(elemento);
			}
		});*/
		
		RxApp app = new RxApp();
		app.buscar();
	}

}
