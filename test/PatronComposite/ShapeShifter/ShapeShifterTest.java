package PatronComposite.ShapeShifter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PatronComposite.ShapeShifter.ShapeShifter;
import PatronComposite.ShapeShifter.ShapeShifterLeaf;

class ShapeShifterTest {
	
	ShapeShifter shape, shape2;
	ShapeShifterLeaf shapeLeaf, shapeLeaf2;

	@BeforeEach
	void setUp() throws Exception {
	shape = new ShapeShifter();
	shapeLeaf = mock(ShapeShifterLeaf.class);
	shapeLeaf2 = mock(ShapeShifterLeaf.class);
	when(shapeLeaf.getValor()).thenReturn(1);
	when(shapeLeaf2.getValor()).thenReturn(2);
	
	}
	@Test
	void testDepeest() {
	shape.compose(shapeLeaf);
	assertEquals(shape.deepest(),1);
		
		
	}
	
	@Test
	void testFlat(){
		assertEquals(shape.flat(),shape);
		
	}
	
	
}
