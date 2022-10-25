package PatronObserver.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTest {
	
	private Sistema sistema;
	private Articulo articulo , articulo2 ;
	private Investigador investigador;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		sistema = new Sistema();
		articulo = mock(Articulo.class);
		articulo2 = mock(Articulo.class);
		investigador = mock(Investigador.class);

		
	}

	@Test
	void testSistemaCargaArticulo() {
		sistema.agregarArticulo(articulo);
		sistema.agregarArticulo(articulo2);
		assertEquals(sistema.getArticualos().size() ,  2);
	}

	@Test
	
	void testEliminarARticulo() {
		sistema.agregarArticulo(articulo);
		sistema.agregarArticulo(articulo2);
		sistema.eliminarArticulo(articulo2);
		
		assertEquals(sistema.getArticualos().size(), 1);
	}
	
	@Test
	
	void testUnSistemaSuscribeUnInvestiadorConInteresPython() {
		sistema.agregarSubscriptor(investigador, "Python");
		assertEquals(sistema.getObservers().size(),1);
	
	}
	
	@Test
	
	void testUnSistemaDesuscribreUnInvestigadorConInteresPython() {
		sistema.agregarSubscriptor(investigador, "Python");
		sistema.eliminarSubscriptor(investigador, "Python");
		assertEquals(sistema.getObservers().size(),0);
	}
	
	@Test
	
	void testSistemaNotificaAlObservadorQueHayUnArticuloDeIntereS() {
		sistema.agregarSubscriptor(investigador, "Java");
		sistema.notificar("Java");
		
		verify(investigador, times(1)).update("Java");
	}
	
	@Test 
	
	void testSistemaNoNotificaAsuObservadorCuandoNoEsUnArticuloDeInteres() {
		sistema.agregarSubscriptor(investigador, "JavaScript");
		sistema.notificar("Java");
		
		verify(investigador, times(1)).update("Java");
		
	}
	
	
	
}
