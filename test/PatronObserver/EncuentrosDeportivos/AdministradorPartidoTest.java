package PatronObserver.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdministradorPartidoTest {

	AdministradorPartido admin;
	Partido partido1, partido2;
	Servidor servidor;
	AplicacionMovil aplicacion;
	
	
	@BeforeEach
	void setUp() throws Exception {
	admin = new AdministradorPartido();
	partido1 = mock(Partido.class);
	partido2 = mock(Partido.class);
	aplicacion = mock(AplicacionMovil.class);
	servidor = mock(Servidor.class);
	}

	@Test
	void testAdministradorDePartidosNoTienePartidos() {
		assertEquals(admin.getPartidos().size(), 0);
	}
	
	@Test
	
	void testAdministradorDePartidoTieneDosPartidos() {
		admin.agregarPartido(partido1);
		admin.agregarPartido(partido2);
		assertEquals(admin.getPartidos().size(), 2);
	}

	@Test
	
	void tesAdministradorDePartidosTieneServidorDeSuscriptorDeBasket() {
		admin.suscribir(servidor, "Basket");
		assertTrue(admin.getObservers().containsKey(servidor));
		assertTrue(admin.getObservers().containsValue("Basket"));
	}
	
	@Test
	void testAdminstradorDePartidosNoTieneSuscripctores() {
		admin.suscribir(servidor, "Voley");
		admin.desuscribir(servidor, "Voley");
		assertEquals(admin.getObservers().size(), 0);
	}
	
	@Test
	void testAdministradorDePartidosTieneDiferentesSuscriptoresYNotificaALosDos() {
		admin.suscribir(servidor, "Basket");
		admin.suscribir(aplicacion, "Rugby");
		admin.agregarPartido(partido1);
		admin.agregarPartido(partido2);
		admin.noticar("Basket");
		admin.noticar("Rugby");
		
		verify(servidor , times(1)).update("Basket");
		verify(servidor, never()).update("Rubgy");
		verify(aplicacion, times(1)).update("Rugby");
	}
	
	
	
}
