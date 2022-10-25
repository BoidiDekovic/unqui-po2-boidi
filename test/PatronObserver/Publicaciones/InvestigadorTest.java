package PatronObserver.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestigadorTest {
	
	Investigador investigador;
	Sistema sistema ;
	Articulo articulo;
	
	@BeforeEach
	void setUp() throws Exception {
		investigador = new Investigador();
		sistema = mock(Sistema.class);
		articulo = mock(Articulo.class);
	}

	@Test
	void testInvestigadorCargarArticulo() {
		//setup
		investigador.agregarArticulo(sistema, articulo);
		
		// verify
		
		verify(sistema,times(1)).agregarArticulo(articulo);
		
	}

	@Test
	
	void testInvestigadorEliminaArticulo() {
		//setup
		investigador.eliminarArticulo(sistema, articulo);
		//verify
		
		verify(sistema,times(1)).eliminarArticulo(articulo);
		
	}
	
	
}














