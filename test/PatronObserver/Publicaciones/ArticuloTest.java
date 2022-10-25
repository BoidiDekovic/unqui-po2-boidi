package PatronObserver.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticuloTest {

	private Articulo articulo;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		articulo = new Articulo("Patrones","Bill Gates","Universitario","Desarrollo","Java","USA");
		
		
	}

	@Test
	void testConstructor() {
		assertEquals(articulo.getTitulo(), "Patrones");
		assertEquals(articulo.getAutores(), "Bill Gates");
		assertEquals(articulo.getFiliaciaones() ,"Universitario");
		assertEquals(articulo.getTipoDeArticulo(), "Desarrollo");
		assertEquals(articulo.getClave(), "Java");
		assertEquals(articulo.getLugarDePublicacion(), "USA");
	
	

	}

}
