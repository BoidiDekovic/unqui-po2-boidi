package tp2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Permanente extends Empleado {
	private int cantidadHijos;
	private int aniosAntiguedad;
	private boolean conyuge;
	
	
	public Permanente(String nombre, String domicilio, String estadoCivil, Date fechaDeNacimiento,double sueldoBasico, boolean conyuge , int cantidadHijos , int aniosAntiguedad ) {
		super(nombre, domicilio, estadoCivil, fechaDeNacimiento, sueldoBasico, conyuge);
		this.cantidadHijos = cantidadHijos;
		this.aniosAntiguedad = aniosAntiguedad;
	
	}
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}
	public void setAniosAntiguedad(int aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
	public boolean getConyuge() {
		return conyuge;
	}
	public void setConyuge(boolean conyuge) {
		this.conyuge = conyuge;
	}
	
	public double salarioFamiliar() {
		 
		 double resultado = asignacionPorHijos() + asignacionPorConyuge() + antiguedad();
		
		 return resultado;
	}
	
	
	private double asignacionPorHijos() {
		return (this.cantidadHijos * 150);
	}
	
	private double asignacionPorConyuge() {
		int asignacionConyuge;
		 if(getConyuge() == true ) {
			 asignacionConyuge = 100;
		 }else{
			 asignacionConyuge = 0;
		 }
		 return asignacionConyuge;
	}
	
	private int antiguedad() {
		return (this.aniosAntiguedad * 50);
	}
	
	
	private double aportesJubilatorios() {
		return calcularSueldoBruto() * 0.15;
	}
	
	
	public double obraSocial() {
		double diezPorCientoSueldoBruto = calcularSueldoBruto() * 0.1;
		int asignacionPorHijo = getCantidadHijos() * 20;
		
		return diezPorCientoSueldoBruto + asignacionPorHijo;
	}
		
	
	
	@Override
	public double calcularSueldoBruto() {
	
		return this.sueldoBasico + salarioFamiliar();
	}

	@Override
	public double retenciones() {
		return obraSocial() + aportesJubilatorios();
	}

	public Map<String, Object> getConceptos() {
		Map<String, Object> conceptos = new HashMap<>();
		conceptos.put("Sueldo Basico", this.sueldoBasico);
		conceptos.put("Asignacion por Hijo", asignacionPorHijos());
		conceptos.put("Asignacion por conyuge", asignacionPorConyuge());
		conceptos.put("Antiguedad", antiguedad());
		conceptos.put("Obra social", obraSocial());
		conceptos.put("Aportes Jubilatorios", aportesJubilatorios());	
		return conceptos;
	}
	

	
}
