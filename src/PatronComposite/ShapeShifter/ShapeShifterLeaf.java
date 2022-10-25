 package PatronComposite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter {

	Integer valor;
	
	 
	public ShapeShifterLeaf(Integer valor) {
		super();
		this.valor = valor;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shape) {
		IShapeShifter nuevo = new ShapeShifter(this, shape);
		return nuevo ;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(this.getValor());
		return values;
	}

	public Integer getValor() {
		return valor;
	}

}