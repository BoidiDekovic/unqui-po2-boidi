package PatronObserver.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AdministradorPartido implements IPartido {

	private Map<IObserver , String> observers;
	private List<Partido> partidos;
	
	
	public Map<IObserver, String> getObservers() {
		return observers;
	}
	public List<Partido> getPartidos() {
		return partidos;
	}
	public AdministradorPartido() {
		this.observers = new HashMap<IObserver , String>();
		this.partidos = new ArrayList<Partido>();
	}
	 
	
	
	public void agregarPartido(Partido p) {
		this.getPartidos().add(p);
	}
	
	public void eliminarPartido(Partido p ) {
		this.getPartidos().remove(p);
	}
	@Override
	public void suscribir(IObserver observer, String deporte) {
		this.getObservers().put(observer, deporte);
		
	}
	@Override
	public void desuscribir(IObserver observer, String deporte) {
		this.getObservers().remove(observer, deporte);		
	}
	@Override
	public void noticar(String deporte) {
		for(Entry<IObserver , String> ob: this.getObservers().entrySet()) {
			if(ob.getValue().contains(deporte)) {
				ob.getKey().update(deporte);
			}
		}
	}	
}
