package ar.edu.unq.poo2.practica7;

import java.util.function.BooleanSupplier;

public class Carta {
	
	
	private Palo palo;
	private ValorFigura valor;
	private Color color;
	
	public Palo getPalo() {
		return palo;
	}
	
	public int getValor() {
		return valor.getValor();
	}
	
	public Color getColor() {
		return color;
	}

	
	public Carta(Palo palo, ValorFigura valor, Color color) {
		this.palo = palo;
		this.valor = valor;
		this.color = color;
	}


	public Boolean esMismoColorQue(Carta carta2) {
		return this.getColor().equals(carta2.getColor());
	}
	
	public Boolean esMismoPaloQue(Carta carta2) {
		return this.getPalo().equals(carta2.getPalo());
	}

	public Boolean esMismoValorQue(Carta carta2) {
		return this.getValor() == carta2.getValor();
	}

	public Boolean esMayorQue(Carta carta2) {
		return this.getValor()> carta2.getValor();
	}

	


	
	
	
}