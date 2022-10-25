package PatronObserver.Publicaciones;



import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Articulo {
	private String titulo;
	private String autores;
	private String filiaciaones;
	private String tipoDeArticulo;
	private String clave;
	private String lugarDePublicacion;
	public String getTitulo() {
		return titulo;
	}
	public String getAutores() {
		return autores;
	}
	public String getFiliaciaones() {
		return filiaciaones;
	}
	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}
	public String getClave() {
		return clave;
	}
	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}
	public Articulo(String titulo, String autores, String filiciaones, String tipoDeArticulo, String clave,
			String lugarDePublicacion) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciaones = filiciaones;
		this.tipoDeArticulo = tipoDeArticulo;
		this.clave = clave;
		this.lugarDePublicacion = lugarDePublicacion;
	}
	
	public List<String> criteroDeInteres(){
		List <String> criterio = Arrays.asList(this.getTitulo(), this.getTipoDeArticulo(),
				this.getLugarDePublicacion(),this.getClave(),this.getFiliaciaones(),this.getAutores());
		return criterio;
	}
	
	
	
	
}
