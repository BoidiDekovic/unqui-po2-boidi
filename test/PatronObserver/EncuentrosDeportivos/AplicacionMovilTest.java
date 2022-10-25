package PatronObserver.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicacionMovilTest {

	AplicacionMovil aplicacion;
	AdministradorPartido admin;
	Partido app;
	
	@BeforeEach
	void setUp() throws Exception {
		admin = mock(AdministradorPartido.class);
		aplicacion = new AplicacionMovil(admin);
	
	}

	@Test
	void testAplicacionSuscribreAlDeporteT() {
		aplicacion.suscribir("Tenis");
		verify(admin).suscribir(aplicacion, "Tenis");
	}


	
	
	
	
}
