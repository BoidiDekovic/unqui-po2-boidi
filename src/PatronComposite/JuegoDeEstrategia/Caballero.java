package PatronComposite.JuegoDeEstrategia;

public class Caballero extends Personaje{

	
	
	public Caballero() {
	}
	@Override
	public void caminar(Punto punto) {
		hacerZigZag(punto);
		
	}

	private void hacerZigZag(Punto punto) {
		this.setPosicion(punto);	
	}

}