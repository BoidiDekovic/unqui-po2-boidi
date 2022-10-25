package PatronComposite.JuegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Personaje {

	private List<Personaje> personajes;
	private Punto posicion;
	
	public Ejercito() {
		personajes = new ArrayList<Personaje>();
	}
	
	public void agregarPersonaje(Personaje pj) {
		this.personajes.add(pj);
	}
	
	public void eliminarPersonaje(Personaje pj) {
		this.personajes.remove(pj);
	}
	
	@Override
	public void caminar(Punto punto) {
	
		this.personajes.stream().forEach(p -> p.caminar(punto));
	}

}
