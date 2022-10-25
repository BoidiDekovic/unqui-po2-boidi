package ar.edu.unq.poo2.practica7;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;

public class PokerStatus {

	private JugadaPoker jugada;
	

	public JugadaPoker verificar(List<Carta> cartas) {
		
		if(verificarEsPoker(cartas)) {
			return jugada.Poker;
		}
		else if(verificarEsColor(cartas)) {
			return jugada.Color;
		}
		else if(verificarEsTrio(cartas)) {
			return jugada.Trio;
		}
		else {
			return jugada.Nada;
		}
		
	}
	
	
	public Boolean verificarEsPoker(List<Carta> manoDeCartas) {
		return manoDeCartas.stream().anyMatch(x -> this.tienePoker(x, manoDeCartas));
	}

	public Boolean tienePoker(Carta carta,List<Carta> manoDeCartas) {
		return manoDeCartas.stream().filter(x -> x.esMismoValorQue(carta)).count() == 4;
	}
	
	public Boolean verificarEsColor(List<Carta> manoDeCartas) {
		return manoDeCartas.stream().anyMatch(x -> this.tieneColor(x, manoDeCartas)) && 
			   manoDeCartas.stream().anyMatch(x -> this.tienePalo(x, manoDeCartas));
	}
	
	public Boolean verificarEsTrio(List<Carta> manoDeCartas) {
		return manoDeCartas.stream().anyMatch(x -> this.tieneTrio(x, manoDeCartas));
	}

	private Boolean tienePalo(Carta carta, List<Carta> manoDeCartas) {
		return manoDeCartas.stream().filter(x -> x.esMismoPaloQue(carta)).count() == 5;
	}

	private Boolean tieneColor(Carta carta, List<Carta> manoDeCartas) {
		return manoDeCartas.stream().filter(x -> x.esMismoColorQue(carta)).count() == 5;
	}

	private Boolean tieneTrio(Carta carta, List<Carta> manoDeCartas) {
		return manoDeCartas.stream().filter(x -> x.esMismoValorQue(carta)).count() == 3;
	}

	public Jugada jugadaGanadoraDelEmpate(Jugada jugada1, Jugada jugada2) {
		//poker las 4, color las 5 y trio las 3
		if(empateConPoker(jugada1, jugada2)) {
			return desempatePokerOTrio(jugada1, jugada2);
		}
		else if(empateConColor(jugada1, jugada2)) {
			return desempateColor(jugada1, jugada2);
		}
		return desempatePokerOTrio(jugada1, jugada2);
	}


	private Jugada desempatePokerOTrio(Jugada jugada1, Jugada jugada2) {
		if(puntajeDeLaManoConPokerOTrio(jugada1) > puntajeDeLaManoConPokerOTrio(jugada2)) {
			return jugada1;
		}
		else {
			return jugada2;
		}
	}
	
	private Jugada desempateColor(Jugada jugada1, Jugada jugada2) {
		if(puntajeDeLaManoConColor(jugada1) > puntajeDeLaManoConColor(jugada2)) {
			return jugada1;
		}
		else {
			return jugada2;
		}
	}

	public int puntajeDeLaManoConPokerOTrio(Jugada jugada) {
		int resultado = 0;
		Carta carta = jugada.getManoDeCartas().get(0);
		for(Carta c2 : jugada.getManoDeCartas()) {
			if(c2.esMismoValorQue(carta)) {
				resultado+=c2.getValor();
			}
		}
		return resultado;
	}
	
	public Double puntajeDeLaManoConColor(Jugada jugada) {
		double valor = jugada.getManoDeCartas().stream().mapToDouble(Carta::getValor).sum();
		return valor;
	}
	
	

	//compara para saber si hay empate entre dos jugadas
	public Boolean empateConPoker(Jugada jugada1, Jugada jugada2) {
		return verificarEsPoker(jugada1.getManoDeCartas()) && verificarEsPoker(jugada2.getManoDeCartas());
	}
	
	public Boolean empateConColor(Jugada jugada1, Jugada jugada2) {
		return this.verificarEsColor(jugada1.getManoDeCartas()) && this.verificarEsColor(jugada2.getManoDeCartas());
	}
	
	public Boolean empateConTrio(Jugada jugada1, Jugada jugada2) {
		return this.verificarEsTrio(jugada1.getManoDeCartas()) && this.verificarEsTrio(jugada2.getManoDeCartas());
	}
	
	
}