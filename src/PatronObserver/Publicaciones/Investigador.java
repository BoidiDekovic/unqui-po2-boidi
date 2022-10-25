package PatronObserver.Publicaciones;



import java.util.ArrayList;
import java.util.List;

public class Investigador implements IObserver{


	private List<String> notificacionesDeInteres;
	
	public List<String> getNotificacionesDeInteres() {
		return notificacionesDeInteres;
	}
		
	public Investigador() {
		this.notificacionesDeInteres = new ArrayList<String>();
	}
	
	
	@Override
	public void update(String articuloDeInteres) {
		this.getNotificacionesDeInteres().add(articuloDeInteres);
		
	}

	public void agregarArticulo(Sistema sistema, Articulo articulo) {
		sistema.agregarArticulo(articulo);
	}
	
	public void eliminarArticulo(Sistema sistema, Articulo articulo) {
		sistema.eliminarArticulo(articulo);
	}
	
	public void subscribirse(Sistema sistema , String articuloDeInteres) {
		sistema.agregarSubscriptor(this, articuloDeInteres);
	}
	
	public void desSubscribirse(Sistema sistema , String articuloDeInteres) {
		sistema.eliminarSubscriptor(null, articuloDeInteres);
	}
	
	
	
	
	
}
