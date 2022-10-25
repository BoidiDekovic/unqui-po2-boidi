package ar.edu.unq.poo2.practica7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest{

	PokerStatus poker;
	Carta carta1,carta2,carta3,carta4, carta5, carta6, carta7,carta8,carta9,carta10;
	List<Carta> manoDeCartas, manoDeCartas2;
	Jugada jugada1, jugada2;
	JugadaPoker jugada;
	
	@BeforeEach
	void setUp() throws Exception {
		//setup
		poker = new PokerStatus();
		carta1 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.NEGRO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.NEGRO);
		carta3 = new Carta(Palo.TREBOL, ValorFigura.SEIS, Color.NEGRO);
		carta4 = new Carta(Palo.PICA, ValorFigura.SEIS, Color.NEGRO);
		carta5 = new Carta(Palo.CORAZON, ValorFigura.A, Color.NEGRO);
		
		
	}

	@Test
	void testVerificarSiLaManoTienePoker() {
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);

		//verify
		assertEquals(poker.verificar(manoDeCartas), jugada.Poker);
	}
	
	@Test
	void testVerificarSiLaManoTieneColor() {
		//setup
		carta1 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta3 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta4 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta5 = new Carta(Palo.DIAMANTE, ValorFigura.A, Color.ROJO);
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		
		//verify
		assertTrue(poker.verificarEsColor(manoDeCartas));
	}

	
	@Test
	void testVerificarSiLaManoTieneTrio() {
		//setup
		carta1 = new Carta(Palo.PICA, ValorFigura.DIEZ, Color.ROJO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta3 = new Carta(Palo.PICA, ValorFigura.SEIS, Color.ROJO);
		carta4 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.ROJO);
		carta5 = new Carta(Palo.DIAMANTE, ValorFigura.A, Color.ROJO);
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		
		//verify
		assertTrue(poker.verificarEsTrio(manoDeCartas));
	}
	
	@Test
	void testVerificarSiLaManoNoTieneNada() {
		//setup
		carta1 = new Carta(Palo.PICA, ValorFigura.DIEZ, Color.ROJO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta3 = new Carta(Palo.PICA, ValorFigura.DOS, Color.ROJO);
		carta4 = new Carta(Palo.CORAZON, ValorFigura.TRES, Color.ROJO);
		carta5 = new Carta(Palo.DIAMANTE, ValorFigura.A, Color.ROJO);
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);

		//verify
		assertEquals(jugada.Nada, poker.verificar(manoDeCartas));
	}
	
	@Test
	void testVerificarSiHayEmpateEntreDosJugadasConPoker() {
		//setup
		poker = new PokerStatus();
		
		//primera mano
		carta1 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.ROJO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta3 = new Carta(Palo.TREBOL, ValorFigura.SEIS, Color.NEGRO);
		carta4 = new Carta(Palo.PICA, ValorFigura.SEIS, Color.NEGRO);
		carta5 = new Carta(Palo.CORAZON, ValorFigura.A, Color.ROJO);
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		//segunda mano
		carta6 = new Carta(Palo.CORAZON, ValorFigura.DOS, Color.ROJO);
		carta7 = new Carta(Palo.DIAMANTE, ValorFigura.DOS, Color.ROJO);
		carta8 = new Carta(Palo.TREBOL, ValorFigura.DOS, Color.NEGRO);
		carta9 = new Carta(Palo.PICA, ValorFigura.DOS, Color.NEGRO);
		carta10 = new Carta(Palo.DIAMANTE, ValorFigura.A, Color.ROJO);
		manoDeCartas2 = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		
		jugada1 = new Jugada(manoDeCartas, poker);
		jugada2 = new Jugada(manoDeCartas2, poker);
		
		//verify
		assertTrue(poker.empateConPoker(jugada1, jugada2));
	}
	
	@Test
	void testVerificaSiHayEmpateDePokerYDevuelveLaJugadaGanadora() {
		//setup
		poker = new PokerStatus();
		
		//primera mano
		carta1 = new Carta(Palo.CORAZON, ValorFigura.SEIS, Color.ROJO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.SEIS, Color.ROJO);
		carta3 = new Carta(Palo.TREBOL, ValorFigura.SEIS, Color.NEGRO);
		carta4 = new Carta(Palo.PICA, ValorFigura.SEIS, Color.NEGRO);
		carta5 = new Carta(Palo.CORAZON, ValorFigura.DOS, Color.ROJO);
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		//segunda mano
		carta6 = new Carta(Palo.CORAZON, ValorFigura.CINCO, Color.ROJO);
		carta7 = new Carta(Palo.DIAMANTE, ValorFigura.CINCO, Color.ROJO);
		carta8 = new Carta(Palo.TREBOL, ValorFigura.CINCO, Color.NEGRO);
		carta9 = new Carta(Palo.PICA, ValorFigura.CINCO, Color.NEGRO);
		carta10 = new Carta(Palo.DIAMANTE, ValorFigura.A, Color.ROJO);
		manoDeCartas2 = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		
		jugada1 = new Jugada(manoDeCartas, poker);
		jugada2 = new Jugada(manoDeCartas2, poker);
		
		//verify
		assertEquals(poker.jugadaGanadoraDelEmpate(jugada1, jugada2), jugada1);
	}
	
	@Test
	void testVerificaSiHayEmpateDeColorYDevuelveLaJugadaGanadora() {
		//setup
		poker = new PokerStatus();
		
		//primera mano
		carta1 = new Carta(Palo.DIAMANTE, ValorFigura.K, Color.ROJO);
		carta2 = new Carta(Palo.DIAMANTE, ValorFigura.J, Color.ROJO);
		carta3 = new Carta(Palo.DIAMANTE, ValorFigura.Q, Color.ROJO);
		carta4 = new Carta(Palo.DIAMANTE, ValorFigura.A, Color.ROJO);
		carta5 = new Carta(Palo.DIAMANTE, ValorFigura.DIEZ, Color.ROJO);
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		//segunda mano
		carta6 = new Carta(Palo.PICA, ValorFigura.K, Color.NEGRO);
		carta7 = new Carta(Palo.PICA, ValorFigura.TRES, Color.NEGRO);
		carta8 = new Carta(Palo.PICA, ValorFigura.Q, Color.NEGRO);
		carta9 = new Carta(Palo.PICA, ValorFigura.DIEZ, Color.NEGRO);
		carta10 = new Carta(Palo.PICA, ValorFigura.A, Color.NEGRO);
		manoDeCartas2 = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		
		jugada1 = new Jugada(manoDeCartas, poker);
		jugada2 = new Jugada(manoDeCartas2, poker);
		
		//verify
		assertEquals(poker.jugadaGanadoraDelEmpate(jugada1, jugada2), jugada1);
	}
	
	
	@Test
	void testVerificaSiHayEmpateDeTrioYDevuelveLaJugadaGanadora() {
		//setup
		poker = new PokerStatus();
		
		//primera mano
		carta1 = new Carta(Palo.DIAMANTE, ValorFigura.K, Color.ROJO);
		carta2 = new Carta(Palo.PICA, ValorFigura.K, Color.NEGRO);
		carta3 = new Carta(Palo.CORAZON, ValorFigura.K, Color.ROJO);
		carta4 = new Carta(Palo.DIAMANTE, ValorFigura.A, Color.ROJO);
		carta5 = new Carta(Palo.DIAMANTE, ValorFigura.DIEZ, Color.ROJO);
		manoDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		//segunda mano
		carta6 = new Carta(Palo.TREBOL, ValorFigura.DIEZ, Color.NEGRO);
		carta7 = new Carta(Palo.PICA, ValorFigura.DIEZ, Color.NEGRO);
		carta8 = new Carta(Palo.DIAMANTE, ValorFigura.DIEZ, Color.ROJO);
		carta9 = new Carta(Palo.PICA, ValorFigura.NUEVE, Color.NEGRO);
		carta10 = new Carta(Palo.PICA, ValorFigura.A, Color.NEGRO);
		manoDeCartas2 = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		
		jugada1 = new Jugada(manoDeCartas, poker);
		jugada2 = new Jugada(manoDeCartas2, poker);
		
		//verify
		assertEquals(poker.jugadaGanadoraDelEmpate(jugada1, jugada2), jugada1);
	}
}