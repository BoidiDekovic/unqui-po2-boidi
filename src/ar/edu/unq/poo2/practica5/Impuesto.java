package ar.edu.unq.poo2.practica5;

public class Impuesto extends Factura{

	private Double tasaDelServicio;
	
	@Override
	public void registrarPago() {
		this.agencia.registrarPago(this);
	}

	@Override
	public Double getPrecio() {
		return this.tasaDelServicio;
	}

}
