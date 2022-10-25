package PatronComposite.JuegoDeEstrategia;

public abstract class Personaje {
	private Punto posicion;
	
	public Punto getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
	public abstract void caminar (Punto punto);

	public void caminar() {
		// TODO Auto-generated method stub
		
	}
	
}
