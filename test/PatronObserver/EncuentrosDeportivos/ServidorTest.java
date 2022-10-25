package PatronObserver.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorTest {

	Servidor servidor;
	AdministradorPartido admin;

	@BeforeEach
	void setUp() throws Exception {
	
		admin = mock(AdministradorPartido.class);
		servidor = new Servidor(admin);
	}

	@Test
	void testServidorSuscribirDeporteBasket() {
		servidor.suscribir("Basket");
		verify(admin).suscribir(servidor,"Basket");
	}

	@Test
	
	void testServidorDessuscribeDeporteBasket() {
		servidor.suscribir("Basket");
		servidor.desuscribir("Basket");
		verify(admin).desuscribir(servidor, "Basket");
	}
	
	@Test
	
	void testServidorNotificaDeporteDeSuInteres() {
		servidor.update("Basket");
		assertEquals(servidor.getInformacionDeporte().size() , 1);
	}
	
	
	
}
