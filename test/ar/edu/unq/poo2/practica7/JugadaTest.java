package ar.edu.unq.poo2.practica7;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class JugadaTest {

	PokerStatus poker, poker2;
	Jugada jugada1,jugada2;
	JugadaPoker jugadaPoker;
	Carta carta1,carta2,carta3,carta4,carta5;
	List<Carta> mano1, mano2;
	
	@BeforeEach
	void setUp() throws Exception {
		poker = new PokerStatus();
	
		
		carta1 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.NEGRO);
		carta3 = new Carta(Palo.TREBOL, ValorFigura.SEIS, Color.NEGRO);
		carta4 = new Carta(Palo.PICA, ValorFigura.SEIS, Color.NEGRO);
		carta5 = new Carta(Palo.CORAZON, ValorFigura.A, Color.NEGRO);
		
		mano1 = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		mano2 = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		jugada1 = new Jugada(mano1, poker);
		
	}

	
	
	@Test
	void testElGanadorDeLaJugadaEsPokerContraColor() {
		carta1 = new Carta(Palo.PICA, ValorFigura.DOS, Color.NEGRO);
		carta2 = new Carta(Palo.PICA, ValorFigura.CUATRO, Color.NEGRO);
		carta3 = new Carta(Palo.PICA, ValorFigura.TRES, Color.NEGRO);
		carta4 = new Carta(Palo.PICA, ValorFigura.SEIS, Color.NEGRO);
		carta5 = new Carta(Palo.PICA, ValorFigura.A, Color.NEGRO);
		mano2 = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		
		
		jugada2 = new Jugada(mano2, poker);
		
		
		assertEquals(jugada1.jugadaGanadora(jugada2), jugada1);
	}

}