package ar.edu.unq.poo2.practica5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	Cliente(){
		
	}
	
	private List<IElemento> productos;
	
	
	public Cliente(List<IElemento> producto) {
		super();
		this.productos = new ArrayList<IElemento>();
	}
		
	public List<IElemento> getProductos() {
		return productos;
	}

	public void agregarProducto(IElemento producto) {
		this.getProductos().add(producto);
	}
	
	public void eliminarProducto(IElemento producto) {
		this.getProductos().remove(producto);
	}
	
	public Double totalAPagar(Double total) {
		return total;
	}
	
	public int cantidadDeProductos() {
		return this.productos.size();
	}
	
	

}


