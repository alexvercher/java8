package com.avc.java8.anotacionesRepeticion;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class App {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Lenguajes {
		Lenguaje[] value() default {};
	}
	
	@Repeatable(value = Lenguajes.class)
	public @interface Lenguaje {
		String value();
	}
	
	//1.7
	/*@Lenguajes({
		@Lenguaje("Java"),
		@Lenguaje("Cobol")
	})*/
	
	//1.8
	@Lenguaje("Java")
	@Lenguaje("Cobol")
	
	public interface LenguajeProgramacion{
		
	}
	
}
