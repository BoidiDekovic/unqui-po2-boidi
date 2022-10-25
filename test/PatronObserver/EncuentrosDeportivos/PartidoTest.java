package PatronObserver.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTest {
	Partido partido;
	@BeforeEach
	void setUp() throws Exception {
	
	partido = new Partido("121 - 100" , "Basket");
	
	}

	@Test
	void testConstructrPartidoDeBasketGanadorLosAngelesLakers() {
		partido.agregarContrincante("Boston Celtics");
		assertEquals(partido.getResultado(), "121 - 100");
		assertEquals(partido.getDeporte(), "Basket");
		assertTrue(partido.getContrincantes().contains("Boston Celtics"));
	}

}
