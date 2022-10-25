package ar.edu.unq.poo2.practica5;

public abstract class Factura implements IElemento {
	
	Agencia agencia;
	
	public abstract void registrarPago();
	public abstract  Double getPrecio();

}
