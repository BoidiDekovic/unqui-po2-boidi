package PatronObserver.Publicaciones;



public interface ISistema {
	
	public void agregarSubscriptor(IObserver investiador, String articuloDeInteres);
	
	public void eliminarSubscriptor(IObserver investiador,String articualoDeInteres);
	
	public void notificar(String articualoDeInteres);
	
	
}
