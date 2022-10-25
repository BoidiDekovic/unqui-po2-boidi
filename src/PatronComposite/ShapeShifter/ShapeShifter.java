package PatronComposite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifter  implements IShapeShifter{

	private List<IShapeShifter> shapeshifters; 
	
	public List<IShapeShifter> getShapeshifters() {
		return shapeshifters;
	}
	
	public ShapeShifter() {
		
	}

	public ShapeShifter(ShapeShifterLeaf shapeShifterLeaf , IShapeShifter shapeshifter) {
		super();
		this.shapeshifters = new ArrayList<IShapeShifter>();
	}
	
	public void addShapeShifter(IShapeShifter shape) {
		this.shapeshifters.add(shape);
	}
	
	public void removeShapeShifter(IShapeShifter shape) {
		this.shapeshifters.remove(shape);
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		ShapeShifter shape = new ShapeShifter();
		shape.addShapeShifter(this);
		shape.addShapeShifter(shapeShifter);
		return shape;
	}

	@Override
	public int deepest() {
		int total = 1; 
		int max = 0;
		for(IShapeShifter sp : this.shapeshifters) {
			max = Math.max(max, sp.deepest());
		}
		return total + max;
	}

	@Override
	public IShapeShifter flat() {
		ShapeShifter shape = new ShapeShifter();
		for(Integer i : this.values()){
			shape.addShapeShifter(new ShapeShifterLeaf(i));
		} 
		return shape;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		for(IShapeShifter sf:this.shapeshifters) {
			values.addAll(sf.values());
		}
		return values;
	}
	

	
	
	
}
