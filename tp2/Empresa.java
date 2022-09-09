package tp2;
import java.util.*;
import java.util.List;


public class Empresa{
	private String nombre;
	private String cuit;
	private	List<Empleado> empleados;
	private List<ReciboDeHaberes> reciboHaberes;
	
	public Empresa() {
		this.empleados = new ArrayList<>();
		this.reciboHaberes = new ArrayList<>();
	}
	
	
	public Empresa(String nombre, String cuit) {
		this();
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ReciboDeHaberes> getReciboDeHaberes() {
		return reciboHaberes;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public Empresa addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
		return this;
		}
	
	public Double calcularMontoTotalSueldosNeto() {
		return empleados.stream().map(Empleado::calcularSueldoNeto).reduce((double) 0, Double::sum);
	}
	
	public Double calcularMontoTotalSueldoBruto() {
		return empleados.stream().map(Empleado::calcularSueldoBruto).reduce((double) 0, Double::sum);
	}
		
	public Double calcularMontoTotalRetenciones() {
		return empleados.stream().map(Empleado::retenciones).reduce((double) 0, Double::sum);
	}
	
	public void loquidacionSueldos() {
		for(Empleado e: empleados) {
			ReciboDeHaberes reciboHaberes = new ReciboDeHaberes();
			reciboHaberes.generarReciboDeHaberes(e);
			this.reciboHaberes.add(reciboHaberes);
		}
	}
	
}