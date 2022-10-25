package PatronObserver.EncuentrosDeportivos;

public interface IPartido {
	
	public void suscribir(IObserver observer , String temaDeInteres);
	public void desuscribir(IObserver observer, String temaDeInteres);
	public void noticar (String temaDeInteres);
}
