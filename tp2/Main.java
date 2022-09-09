package tp2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa("QuickSilver" , "32516546-3" );
		Empleado permanenteUno = new Permanente ("Pedro", "Amoedo 1220","Casado", parseDate("22-3-1989"),85000,true,2,5);
		Empleado permanenteDos = new Permanente ("Martina", "12 de Octubre 1220","Soltero", parseDate("17-8-1991"),50000,false,1,7);
		Empleado temporarioUno = new Temporario ("Nicolas", "Unamuno 123","Casado", parseDate("12-10-1990"),75000,true, parseDate("12-10-2021"),2);
		Empleado temporarioDos = new Temporario ("Flor", "Zapiola 1255","Soltero", parseDate("10-12-1995"),105000,false, parseDate("12-10-2017"),5);
		Empleado contratado = new Contratado ("Catriel", "Madariaga 1320" ," Soltero" , parseDate("09-09-2000"),80000 , false, 4174810, "Debito" );
		
		empresa.addEmpleado(permanenteUno)
			   .addEmpleado(permanenteDos)
			   .addEmpleado(temporarioUno)
			   .addEmpleado(temporarioDos)
			   .addEmpleado(contratado);
		
		System.out.println("***Empleado Permanente Uno***");
		System.out.println("permanenteUno.calcularEdad() = " + permanenteUno.calcularEdad(22, 3, 1989));
		System.out.println("permanenteUno.calcularSueldoBruto = " + permanenteUno.calcularSueldoBruto());
		System.out.println("permanenteUno.retenciones = "+ permanenteUno.retenciones());
		System.out.println("permanenteUno.calcularSueldoNeto = " + permanenteUno.calcularSueldoNeto());
	
		
		System.out.println(" \n ***Empleado Permanente Dos***");
		System.out.println("permanenteDos.calcularEdad() = " + permanenteDos.calcularEdad(17, 8, 1991));
		System.out.println("permanenteDos.calcularSueldoBruto = " + permanenteDos.calcularSueldoBruto());
		System.out.println("permanenteDos.retenciones = "+ permanenteDos.retenciones());
		System.out.println("permanenteDos.calcularSueldoNeto = " + permanenteDos.calcularSueldoNeto());
	
		System.out.println(" \n ***Empleado Temporario Uno***");
		System.out.println("temporarioUno.calcularEdad() = " + temporarioUno.calcularEdad(12, 10, 1990));
		System.out.println("temporarioUno.calcularSueldoBruto = " + temporarioUno.calcularSueldoBruto());
		System.out.println("temporarioUno.retenciones = "+ temporarioUno.retenciones());
		System.out.println("temporarioUno.calcularSueldoNeto = " + temporarioUno.calcularSueldoNeto());
	
		System.out.println(" \n ***Empleado Temporario Dos***");
		System.out.println("temporarioDos.calcularEdad() = " + temporarioDos.calcularEdad(10,12,1995));
		System.out.println("temporarioDos.calcularSueldoBruto = " + temporarioDos.calcularSueldoBruto());
		System.out.println("temporarioDos.retenciones = "+ temporarioDos.retenciones());
		System.out.println("temporarioDos.calcularSueldoNeto = " + temporarioDos.calcularSueldoNeto());
	
		System.out.println(" \n ***Empleado Contratado***");
		System.out.println("contratado.calcularEdad() = " + contratado.calcularEdad(9,9,2000));
		System.out.println("contratado.calcularSueldoBruto = " + contratado.calcularSueldoBruto());
		System.out.println("contratado.retenciones = "+ contratado.retenciones());
		System.out.println("contratado.calcularSueldoNeto = " + contratado.calcularSueldoNeto());
	
		
		 System.out.println("\n***********Empresa***********");
	        System.out.println("empresa.calcularMontoTotalSueldosBruto() = " + empresa.calcularMontoTotalSueldoBruto());
	        System.out.println("empresa.calcularMontoTotalRetenciones() = " + empresa.calcularMontoTotalRetenciones());
	        System.out.println("empresa.calcularMontoTotalSueldosNeto() = " + empresa.calcularMontoTotalSueldosNeto());

	        System.out.println("\n***********Empresa Liquidacion de sueldo***********");
	        empresa.loquidacionSueldos();
	        empresa.getReciboDeHaberes().forEach(System.out::println);
	}

	private static Date parseDate(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			
		return null;
		}
	}
}
