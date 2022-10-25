package PatronComposite.JuegoDeEstrategia;

public class Ingeniero extends Personaje {
	private int lajas ;

	public Ingeniero() {
		
	}

	@Override
	public void caminar(Punto punto) {
		darPasoYdejarLaja(punto);
	}

	private void darPasoYdejarLaja(Punto punto) {
		if(!hayLaja()) {
			dejarLaja();
			darPaso(punto);
		}else {
			darPaso(punto);
		}
		
	}

	private Boolean hayLaja() {
			
		return null; // chequa si hay una laja en el piso
	}

	private void darPaso(Punto punto) {
		this.setPosicion(punto);
		
	}
	private void dejarLaja() {
		lajas = this.lajas - 1;
	}
	
	
	
	
	
}


