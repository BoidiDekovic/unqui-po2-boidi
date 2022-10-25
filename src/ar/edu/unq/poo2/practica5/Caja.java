package ar.edu.unq.poo2.practica5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Caja {
	
	private int numero;
	private double montoAPagar;
	private Map<IElemento , Integer> stock;
	
	
	public Caja() {
		
	}
	
	public Caja(int numero) {
		this.numero = numero;
		this.stock = new HashMap<IElemento, Integer>();
	}

	public int getNumero() {
		return numero;
	}
	
	public double getMontoAPagar() {
		return montoAPagar;
	}

	
	public Integer getStock() {
		Integer stockTotal = 0;
		for(Entry<IElemento,Integer> stock: this.stock.entrySet()) {
			stockTotal += stock.getValue();
		}
		return stockTotal;
	}
	

	public void setStock(Map<IElemento, Integer> stock) {
		this.stock = stock;
		
	}
	
	
	public void registrarPago(Cliente cliente) {
		double total = 0;
		for(IElemento producto:cliente.getProductos()) {
			total += producto.getPrecio();
			this.disminuirStock(producto);
		}
		this.montoAPagar = total;
		informarTotal(cliente , total);
	}


	private void informarTotal(Cliente cliente, double total) {
		cliente.totalAPagar(total);
		
	}

	private void disminuirStock(IElemento producto) {
		int stockActual = this.stock.get(producto);
		this.stock.put(producto, stockActual - 1);
		
		
	}


	
	/*
	 public Double calcularMonto(List<Producto> productos) {
		return productos.stream().mapToDouble(Producto::getPrecio).sum();
	} 
	  */
	
	
	
}
