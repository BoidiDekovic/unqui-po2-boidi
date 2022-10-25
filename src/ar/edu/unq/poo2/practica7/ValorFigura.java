package ar.edu.unq.poo2.practica7;

public enum ValorFigura {

	DOS(2),TRES(3),CUATRO(4),CINCO(5),SEIS(6), SIETE(7), OCHO(8), NUEVE(9), 
	DIEZ(10), J(11), Q(12), K(13), A(14);

	ValorFigura(int i) {
		this.valor=i;
	}

	public int getValor() {
		return valor;
	}

	private int valor;
	
	
}