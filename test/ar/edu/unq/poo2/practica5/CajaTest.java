package ar.edu.unq.poo2.practica5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	Caja caja;
	Cliente cliente;
	IElemento yerba, cerveza, ferne, ginTonic;
	
	@BeforeEach
	void setUp() throws Exception {
	
		caja = new Caja();
		cliente = new Cliente();
		yerba = new Producto(11.50 , "yerba");
		cerveza = new Producto (50.50 , "Cerveza");
		ferne = new Producto (250.10, "Ferne");
		ginTonic = new Producto (500.10 , "Gin Tonic");
		
	}

	@Test
	void testControlDeStock(){
		Map<IElemento, Integer> stockFerne = new HashMap<IElemento, Integer>();
		stockFerne.put(ferne, 5);
		caja.setStock(stockFerne);
		
		assertEquals(5 , caja.getStock());
		
	}
	
	@Test 
	void test(){
		
	}
	
}
