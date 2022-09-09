package tp2;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public abstract class Empleado {
	protected String nombre;
	protected String domicilio;
	protected Date fechaDeNacimiento;
	protected String estadoCivil;
	protected double sueldoBasico;
	protected boolean conyuge;
	
	public Empleado(String nombre, String domicilio, String estadoCivil, Date fechaDeNacimiento,
			double sueldoBasico, boolean conyuge) {
		this.nombre = nombre;
        this.domicilio = domicilio;
        this.estadoCivil = estadoCivil;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldoBasico = sueldoBasico;
        this.conyuge = conyuge;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	
	public int calcularEdad(int dia, int mes, int anio) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(anio, mes,dia);
		
		Period periodo = Period.between(fechaNacimiento,fechaHoy);
		
		return periodo.getYears();		
		
	}

	public abstract double calcularSueldoBruto();
	
	public abstract double retenciones();
	
	public double calcularSueldoNeto() {
		return calcularSueldoBruto() - retenciones();
	}
	
	public abstract Map<String, Object> getConceptos();
	
}
