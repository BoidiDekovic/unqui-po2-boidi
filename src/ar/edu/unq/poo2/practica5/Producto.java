package ar.edu.unq.poo2.practica5;

public class Producto implements IElemento{
	private Double precio;
	private String nombre;
	
	
	public Producto(Double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
		
	}

	
	public Double getPrecio() {
		return precio;
	}
	
	public Producto() {
	}


	public String getNombre() {
		return nombre;
	}
	
	

}

