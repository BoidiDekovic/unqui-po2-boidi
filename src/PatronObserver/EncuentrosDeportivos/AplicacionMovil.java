package PatronObserver.EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements IObserver {

	private List<String> informacion;
	private AdministradorPartido admin;
	
	
	
	
	public AplicacionMovil(AdministradorPartido admin) {
		this.informacion = new ArrayList<String>();
		this.admin = admin;
	}

	public List<String> getInformacion() {
		return informacion;
	}

	public AdministradorPartido getAdmin() {
		return admin;
	}
	
	public void suscribir(String temaDeInteres) {
		this.getAdmin().suscribir(this, temaDeInteres);
	}

	public void desuscribir(String  temaDeInteres) {
		this.getAdmin().desuscribir(this, temaDeInteres);;
	}

	


	@Override
	public void update(String temaDeInteres) {
		
		this.getInformacion().add(temaDeInteres);
	}

}
