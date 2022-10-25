package PatronCompiste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PatronComposite.SistemaDeArchivos.Archivo;
import PatronComposite.SistemaDeArchivos.Directorio;

class DirectorioTest {

	Directorio directorio , directorio2, directorio3;
	Archivo archivo1, archivo2;
	@BeforeEach
	void setUp() throws Exception {
		directorio = new Directorio("Carpeta1" , LocalDate.of(2020, 5, 14));
		directorio2 = new Directorio("Carpeta2" , LocalDate.of(2020, 6 , 17));
		directorio3 = new Directorio("Carpeta3" , LocalDate.of(2020, 5, 14));
		archivo1 = new Archivo("Pepita",15 , LocalDate.of(2022, 5, 14));
		archivo2 = new Archivo("Pepito",15 , LocalDate.of(2020, 5, 14));
		
		directorio.agregarElemento(archivo1);
		directorio.agregarElemento(archivo2);
		directorio.agregarElemento(directorio2);
		directorio.agregarElemento(directorio3);
		
	}

	@Test
	void testPrinter() {
		directorio.printStructure();
	}
	
	@Test
	
	void testUltimoModificado() {
		directorio = new Directorio("Carpeta", LocalDate.of(2020, 4, 18));
		archivo1 = new Archivo("Reac",12, LocalDate.of(2020, 2, 18));
		archivo2 = new Archivo("Python" ,11, LocalDate.of(2020, 8, 18));
		directorio.agregarElemento(archivo1);
		directorio.agregarElemento(archivo2);
		assertEquals(directorio.lastModified(), archivo2);
	}
	
	@Test 
	
	void testMasAntiguio() {
		directorio = new Directorio("Carpeta", LocalDate.of(2020, 2, 18));
		archivo1 = new Archivo("Reac",12, LocalDate.of(2020, 4, 18));
		archivo2 = new Archivo("Python" ,11, LocalDate.of(2020, 8, 18));
		directorio.agregarElemento(archivo1);
		directorio.agregarElemento(archivo2);
		assertEquals(directorio.oldestElement(), directorio);
		
		
	}
	
	
	
	
}
