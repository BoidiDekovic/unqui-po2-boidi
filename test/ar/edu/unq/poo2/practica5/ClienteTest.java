package ar.edu.unq.poo2.practica5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	Producto producto,producto1;
	Cliente cliente;
	
	@BeforeEach
	void setUp() throws Exception {
		
	
		List<IElemento> productos = new ArrayList<IElemento>();
		cliente = new Cliente(productos);
		producto = new Producto(120.50,"Cerveza Quilmes");
		producto1 = new Producto(250.50,"Fernet Branca");
		
		
	}

	@Test
	void testAgregarProducto() {
		cliente.agregarProducto(producto);
		cliente.agregarProducto(producto1);
		assertEquals(cliente.cantidadDeProductos(), 2);
	}
	
	@Test
	
	void testEliminarProducto() {
	//setup
	List<IElemento> productos = new ArrayList<IElemento>();
	cliente = new Cliente(productos);
	producto = new Producto(120.50,"Cerveza Quilmes");
	producto1 = new Producto(250.50,"Fernet Branca");
	
	cliente.agregarProducto(producto);
	cliente.agregarProducto(producto1);
	cliente.eliminarProducto(producto);
	cliente.eliminarProducto(producto1);

	assertEquals(cliente.cantidadDeProductos(),0);
	
	}

}
