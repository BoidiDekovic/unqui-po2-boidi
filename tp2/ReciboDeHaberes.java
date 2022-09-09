package tp2;
import java.util.*;
import java.util.Map;

public class ReciboDeHaberes {
	private String nombreEmpleado;
	private String domicilio;
	private Date fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private Map<String, Object> conceptos;
	
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombre(String nombre) {
		this.nombreEmpleado = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}



	public double getSueldoBruto() {
		return sueldoBruto;
	}



	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}



	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	
	
	public ReciboDeHaberes generarReciboDeHaberes(Empleado empleado) {
		this.nombreEmpleado = empleado.nombre;
		this.domicilio = empleado.domicilio;
		this.fechaEmision = new Date();
		this.sueldoBruto = empleado.calcularSueldoBruto();
		this.sueldoNeto = empleado.calcularSueldoNeto();
		this.setConceptos(empleado.getConceptos());
		return this;
	}
	public Map<String, Object> getConceptos() {
		return conceptos;
	}
	public void setConceptos(Map<String, Object> conceptos) {
		this.conceptos = conceptos;
	}
	
	
}