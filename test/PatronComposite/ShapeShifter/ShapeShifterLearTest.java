package PatronComposite.ShapeShifter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterLearTest {

	ShapeShifterLeaf shapeLeaf , shapeLeaf2 ;
	List<Integer> values;
	@BeforeEach
	void setUp() throws Exception {
		shapeLeaf = new ShapeShifterLeaf(1);
		shapeLeaf2 = new ShapeShifterLeaf(2);
		values = new ArrayList<Integer>();
	
	}

	@Test
	void testValueShifterLeaf() {
		values.add(1);
		assertEquals(shapeLeaf.values() , values);
	}
	
	@Test
	void testComposeShifterLeaf() {
		values.add(1);
		values.add(2);
		shapeLeaf.compose(shapeLeaf2);
				
	}
	
	
	
	
	
	
}
