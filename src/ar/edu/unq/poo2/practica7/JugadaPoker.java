package ar.edu.unq.poo2.practica7;

public enum JugadaPoker {

	Poker(4), Color(3), Trio(2), Nada(0);
	
	JugadaPoker(int i) {
		this.poker=i;
	}

	public int getPokerValor() {
		return poker;
	}

	private int poker;
}