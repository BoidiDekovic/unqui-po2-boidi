package PatronCompiste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PatronComposite.JuegoDeEstrategia.Caballero;
import PatronComposite.JuegoDeEstrategia.Ejercito;
import PatronComposite.JuegoDeEstrategia.Ingeniero;
import PatronComposite.JuegoDeEstrategia.Personaje;
import PatronComposite.JuegoDeEstrategia.Punto;

class EjercitoTest {
	Ejercito ejercito;
	Caballero caballero , caballero12;
	Ingeniero  ingeniero;
	Punto point;
	@BeforeEach
	void setUp() throws Exception {
	
	
	caballero = new Caballero();
	caballero12 = new Caballero();
	ingeniero = new Ingeniero();
	point = new Punto();
	ejercito = new Ejercito();
	
	}

	@Test
	void testCaminarDeEjercito() {
		point = new Punto();
		ejercito = new Ejercito();
		
		ejercito.agregarPersonaje(caballero);
		ejercito.agregarPersonaje(caballero12);
		ejercito.caminar(point);
		
		assertEquals(caballero.getPosicion() , point);
		
	}


	@Test
	
	void testCaminarCaballero() {
		caballero.caminar(point);
		assertEquals(caballero.getPosicion(), point);
		
	}
	
	
}
