package ar.edu.unq.poo2.practica5;

public class productoCoperativa extends Producto{

	public productoCoperativa(Double precio, String nombre) {
		super(aplicarDescuento(precio), nombre);
		
	}
	
	private static Double aplicarDescuento(Double precio) {
		return precio - (precio*10/100);
	}
	

}
