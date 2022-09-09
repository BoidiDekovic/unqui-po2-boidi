package tp2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Contratado extends Empleado{

	private int numeroContrato;
	private String medioDePago;
	
	public Contratado(String nombre, String domicilio, String estadoCivil, Date fechaDeNacimiento,
			double sueldoBasico , boolean conyuge , int numeroDeContrato, String medioDePago) {
		super(nombre, domicilio, estadoCivil, fechaDeNacimiento, sueldoBasico, conyuge);
		this.numeroContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}
	


	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public double getSueldoBruto() {
		
		return this.sueldoBasico;
		
	}

	public double gastosAdministrativosContractuales(){
		
		return 50;
	}


	
	

	@Override
	public double calcularSueldoBruto() {
		
		return super.sueldoBasico;
	}



	@Override
	public double retenciones() {
		
		return gastosAdministrativosContractuales();
	}

	@Override
	public double calcularSueldoNeto() {
		return calcularSueldoBruto() - retenciones();
	}



	@Override
	public Map<String, Object> getConceptos() {
		Map<String, Object> conceptos = new HashMap<>();
		conceptos.put("Sueldo Basico",this.sueldoBasico);
		conceptos.put("Gastos administrativos Contractuales",gastosAdministrativosContractuales());
		return conceptos;
	}
	
	
}