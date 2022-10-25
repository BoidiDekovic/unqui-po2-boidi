package ar.edu.unq.poo2.practica7;
	
import java.util.List;

public class Jugada {

	private List<Carta> manoDeCartas;
	private PokerStatus poker;
	
	public List<Carta> getManoDeCartas() {
		return manoDeCartas;
	}
	
	
	public Jugada(List<Carta> manoDeCartas, PokerStatus poker) {
		this.manoDeCartas = manoDeCartas;
		this.poker = poker;
	}

	public Jugada jugadaGanadora(Jugada jugada2) {
		if(jugadaUnoMayorQue(jugada2)) {
			return this;
		}
		else if(!jugadaUnoMayorQue(jugada2))
			{return jugada2;}
		else {
			return esEmpateEntre(jugada2);
		}
		
	}

	private Jugada esEmpateEntre(Jugada jugada2) {
		return poker.jugadaGanadoraDelEmpate(this, jugada2);
	}

	private boolean jugadaUnoMayorQue(Jugada jugada2) {
		return poker.verificar(getManoDeCartas()).getPokerValor() > jugada2.poker.verificar(jugada2.getManoDeCartas()).getPokerValor();
	}
	
	


	
	
	
	
}

	
	
	
	

