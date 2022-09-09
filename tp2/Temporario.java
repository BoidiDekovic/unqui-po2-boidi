package tp2;
import java.util.*;

public class Temporario extends Empleado {
	
		
	private Date fechaDesignacion;
	private int cantidadHorasExtras;
	
	
	public Temporario(String nombre, String domicilio, String estadoCivil, Date fechaDeNacimiento, double sueldoBasico ,boolean conyuge , Date fechaDeDesignacion , int cantidadDeHorasExtras) {
		super(nombre, domicilio, estadoCivil, fechaDeNacimiento, sueldoBasico, conyuge);
		this.fechaDesignacion = fechaDeDesignacion;
		this.cantidadHorasExtras = cantidadDeHorasExtras;
	}
	
	public Date getFechaDesignacion() {
		return fechaDesignacion;
	}
	public void setFechaDesignacion(Date fechaDesignacion) {
		this.fechaDesignacion = fechaDesignacion;
	}
	public int getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}
	public void setCantidadHorasExtras(int cantidadHorasExtras) {
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	
	
	private double aplicacionSiEsMayorA50Anios() {
		Date today = new Date();
		int anios = Math.toIntExact(today.getYear() - super.fechaDeNacimiento.getYear());
		return anios >= 50 ? 25 : 0 ;
	}
	
	
	
	private double sueldoBasico() {
		return this.sueldoBasico + (this.cantidadHorasExtras * 40);
	}
	
	public double obraSocial() {
		return 0.1 *  calcularSueldoBruto() + aplicacionSiEsMayorA50Anios();
		
	}
	
	public double aportesJubilatorios() {
		
		return (calcularSueldoBruto()* 0.1) + (this.cantidadHorasExtras * 5);  
	}
	


	@Override
	public double calcularSueldoBruto() {
		
		return sueldoBasico();
	}

	@Override
	public double retenciones() {
		
		return obraSocial() + aportesJubilatorios();
	}

	@Override
	public double calcularSueldoNeto() {
		
		return calcularSueldoBruto() - retenciones();
	}

	@Override
	public Map<String, Object> getConceptos() {
		Map<String, Object> conceptos = new HashMap<>();
		conceptos.put("Sueldo Basico", sueldoBasico());
		conceptos.put("Obra Social", obraSocial());
		conceptos.put("Aportes Jubilatorios", aportesJubilatorios());
		return conceptos;
	}
}
