package PatronObserver.EncuentrosDeportivos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partido {
	
	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	
	
	public String getResultado() {
		return resultado;
	}
	public List<String> getContrincantes() {
		return contrincantes;
	}
	public String getDeporte() {
		return deporte;
	}
	public Partido(String resultado , String deporte) {
		this.resultado = resultado;
		this.deporte = deporte;
		this.contrincantes = new ArrayList<String>();
		
	}

	public void agregarContrincante(String contrincante) {
		this.getContrincantes().add(contrincante);
	}
	
	public void eliminarContricante(String contrincante) {
		this.getContrincantes().remove(contrincante);
	}
	
	public List<String> datosDelPartido(){
		List<String> datos = Arrays.asList(this.getDeporte(), this.getResultado());
		datos.addAll(this.getContrincantes());
		return datos;
	}
	
	
	
}
