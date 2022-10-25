package PatronComposite.SistemaDeArchivos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements FyleSystem{

    private List<FyleSystem> contenido;
    private String nombre;
    private LocalDate fechaCreacion;

    public void agregarElemento(FyleSystem elemento) {
    	this.contenido.add(elemento);
    }
    
    public void removerElemento(FyleSystem elemento) {
    	this.contenido.remove(elemento);
    }
    
    
	public Directorio(String nombre, LocalDate fechaCreacion) {
        super();
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.contenido = new ArrayList<FyleSystem>();
    }

	
	 
	
    @Override
    public int totalSize() {
        int total=this.contenido.stream().mapToInt(FyleSystem::totalSize).sum();
        return total;
    }

    @Override
    public void printStructure() {
    	for(FyleSystem fs:this.contenido) {
    		fs.printStructure();
    		printEspacio();
    	}
    	System.out.println(this.nombre);
    }
    
    public void printEspacio() {
    	for(FyleSystem f:this.contenido) {
			System.out.println(" ");
		}
    }
  
  //this.contenido.stream().forEach(t -> t.printStructure()); 

	@Override
    public FyleSystem lastModified() {
		FyleSystem last = this;
		for(FyleSystem fs:this.contenido) {
				last = last.ultimoModificadoEntre(fs);
		}
		return last;
}
	
    @Override
    public FyleSystem oldestElement() {
        FyleSystem older = this;
        for(FyleSystem fs: this.contenido) {
        	older = older.masAntiguoEntre(fs);
        }
        return older;
    }

	
    @Override
	public FyleSystem ultimoModificadoEntre(FyleSystem archive) {
		if(this.getFecha().isAfter(archive.getFecha())) {
			return this;
		}else {
			return archive;
		
		}
	}
	
    @Override
	public FyleSystem masAntiguoEntre(FyleSystem archive) {
		if(this.getFecha().isBefore(archive.getFecha())){
			return this;
		}else {
			return archive;
		
		}
	}
	
	

	@Override
	public LocalDate getFecha() {
		return this.fechaCreacion;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	
}