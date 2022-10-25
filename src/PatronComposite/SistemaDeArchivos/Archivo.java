package PatronComposite.SistemaDeArchivos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Archivo implements FyleSystem{
    
    private String nombre;
    private int tamanio;
    private LocalDate fechaModificacion;
    
    
    public Archivo(String nombre, int tamanio, LocalDate fechaModificacion) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.fechaModificacion = fechaModificacion;
	}

	@Override
    public int totalSize() {
        return this.tamanio;
    }

    @Override
    public void printStructure() {
        System.out.print(this.nombre);
    }

    @Override
    public FyleSystem lastModified() {
        return this;
    }

    @Override
    public FyleSystem oldestElement() {
        // TODO Auto-generated method stub
        return this;
    }

	@Override 
	public LocalDate getFecha() {
		return this.fechaModificacion;
	}
	
	@Override
	public FyleSystem ultimoModificadoEntre(FyleSystem archivo) {
		if(this.getFecha().isAfter(archivo.getFecha())) {
			return this;
		}
			else {
				return archivo;
			}
		}
	
	@Override
	public FyleSystem masAntiguoEntre(FyleSystem elemento) {
		if(this.getFecha().isBefore(elemento.getFecha())) {
			return this;
		}else {
			return elemento;
		}
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
	
}