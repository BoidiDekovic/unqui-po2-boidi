package ar.edu.unq.poo2.practica5;

import java.util.List;

public class Caja {
	
	List<Producto> productos;
	double montoAPagar;
	Producto prodructo;

	public Caja(List<Producto> productos, double montoAPagar, Producto prodructo) {
		this.productos = productos;
		this.montoAPagar = montoAPagar;
		this.prodructo = prodructo;
	}

	public int cantidadDeProductos(){
		return productos.size();
	}
	
	public void registrarProducto(Producto prodocuto) {
		productos.add(prodocuto);
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	public Double informarMonto(List<Producto> productos) {
		return productos.stream().mapToDouble(Producto::getPrecio).sum();
	}

	
	
}

