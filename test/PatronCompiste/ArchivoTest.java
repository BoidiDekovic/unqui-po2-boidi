package PatronCompiste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PatronComposite.SistemaDeArchivos.Archivo;

class ArchivoTest {
	
	Archivo archivo, archivo1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		archivo = new Archivo("Pepito",15 , LocalDate.of(2022, 6, 17));
		archivo1 = new Archivo("Pepita",12 , LocalDate.of(2022, 6, 17)); 		
	}

	@Test
	void testImprimir() {
		archivo1.printStructure();
	}

}
