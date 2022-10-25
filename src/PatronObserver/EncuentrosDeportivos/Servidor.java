package PatronObserver.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;


public class Servidor implements IObserver {
	private List<String> informacionDeporte ;
	private AdministradorPartido administrador;
	
	public List<String> getInformacionDeporte() {
		return informacionDeporte;
	}

	public AdministradorPartido getAdministrador() {
		return administrador;
	}

	public Servidor(AdministradorPartido administrador) {
	
		this.informacionDeporte = new ArrayList<String>();
		this.administrador = administrador;
	}

	
	public void suscribir(String deporte) {
		this.getAdministrador().suscribir(this, deporte);
	}
	
	public void desuscribir(String deporte) {
		this.getAdministrador().desuscribir(this, deporte);
	}
	
	@Override
	public void update(String deporte) {
		this.getInformacionDeporte().add(deporte);
		
	}
	
	
	
	
	
	
}
