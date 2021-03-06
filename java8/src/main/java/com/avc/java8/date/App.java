package com.avc.java8.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class App {
	
	public void verificar(int version) {
		if (version == 7) {
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();
			fecha1.set(1991, 0, 21);
			System.out.println(fecha1.after(fecha2));
		}else if (version == 8) {
			LocalDate fecha1 = LocalDate.of(1980, 05, 9);
			LocalDate fecha2 = LocalDate.now();
			System.out.println(fecha1.isAfter(fecha2));
			System.out.println(fecha1.isBefore(fecha2));
			
			LocalTime hora1 = LocalTime.of(22, 30, 50);
			LocalTime hora2 = LocalTime.now();
			System.out.println(hora1.isAfter(hora2));
			System.out.println(hora1.isBefore(hora2));
			
			LocalDateTime fechahora1 = LocalDateTime.of(1980, 01, 9, 22, 30, 50);
			LocalDateTime fechahora2 = LocalDateTime.now();
			System.out.println(fechahora1.isAfter(fechahora2));
			System.out.println(fechahora1.isBefore(fechahora2));
		}
	}
	
	//currentTimeMillis
	public void medirTiempo(int version) throws InterruptedException{
		if (version == 7) {
			long ini = System.currentTimeMillis();
			Thread.sleep(1000);
			long fin = System.currentTimeMillis();
			System.out.println(fin - ini);
		} else if(version == 8) {
			Instant ini = Instant.now();
			Thread.sleep(1000);
			Instant fin = Instant.now();
			System.out.println(Duration.between(ini, fin));
		}
	}
	
	//Calendar
	public void periodoEntreFechas(int version){
		if (version == 7) {
			Calendar nacimiento = Calendar.getInstance();
			Calendar actual = Calendar.getInstance();
			nacimiento.set(1980, 0, 9);

			int edad = 0;
			while (nacimiento.before(actual)) {
				nacimiento.add(Calendar.YEAR, 1);
				edad++;
			}
			
			System.out.println(edad);
		} else if(version == 8) {
			LocalDate nacimiento = LocalDate.of(1980, 05, 9);
			LocalDate actual = LocalDate.now();
			
			Period periodo = Period.between(nacimiento, actual);
		}
		
	}
	
	public void convertir(int version) throws ParseException{
		if (version == 7) {
			String fecha = "09/05/1980";
			DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaConvertida = formateador.parse(fecha);
			System.out.println(fechaConvertida);
			
			Date fechaActual = Calendar.getInstance().getTime();
			formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
			String fechaCadena = formateador.format(fechaActual);
			System.out.println(fechaCadena);
			
		}else if (version == 8) {
			String fecha = "09/05/1980";
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yy");
			LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
			System.out.println(fechaLocal);
			System.out.println(formateador.format(fechaLocal));
		}
	}
	
}
