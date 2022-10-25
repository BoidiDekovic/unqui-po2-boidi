package ar.edu.unq.poo2.practica7;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest{

	Carta carta1, carta2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		carta1 = new Carta(Palo.CORAZON, ValorFigura.A, Color.NEGRO);
		carta2 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
	}

	@Test
	void testDosCartasSonDelMismoPalo() {
		assertTrue(carta1.esMismoPaloQue(carta2));
	}

	@Test
	void testDosCartasSonDelMismoValor() {
		carta1 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		carta2 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		assertTrue(carta1.esMismoValorQue(carta2));
	}
	
	@Test
	void testLaPrimeraCartaEsMayorQueLaSegundaCarta() {
		carta1 = new Carta(Palo.CORAZON, ValorFigura.A, Color.NEGRO);
		carta2 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		assertTrue(carta1.esMayorQue(carta2));
	}
	
}