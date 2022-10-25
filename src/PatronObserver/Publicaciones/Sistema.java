package PatronObserver.Publicaciones;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sistema implements ISistema {
	private List<Articulo> articualos;
	private Map<IObserver, String> observers;
	

	
	public Sistema() {
		this.articualos = new ArrayList<Articulo>();
		this.observers = new HashMap<IObserver,String>();
	}

	public List<Articulo> getArticualos() {
		return articualos;
	}


	public Map<IObserver, String> getObservers() {
		return observers;
	}


	@Override
	public void agregarSubscriptor(IObserver investiador, String articuloDeInteres) {
		this.observers.put(investiador, articuloDeInteres);
	}

	@Override
	public void eliminarSubscriptor(IObserver investiador, String articualoDeInteres) {
		this.observers.remove(investiador, articualoDeInteres);
	}

	@Override
	public void notificar(String articualoDeInteres) {
		for(Entry<IObserver,String> ob : this.getObservers().entrySet()) {
			if(ob.getValue().contains(articualoDeInteres)) {
				ob.getKey().update(articualoDeInteres);
			}
		}
	}

	public void agregarArticulo(Articulo articulo) {
		this.getArticualos().add(articulo);
		
	}

	public void eliminarArticulo(Articulo articulo) {
		this.getArticualos().remove(articulo);		
	}

	
	
}
