package ar.edu.unq.po2.tpcomposite;

import java.util.ArrayList;
import java.util.List;
	//Rol: Leaf
public class ShapeShifter implements IShapeShifter {
	private ArrayList<IShapeShifter> composiciones = new ArrayList<IShapeShifter>();
	private int value;
	
	public ShapeShifter(int value) {
		this.value = value;
	}
	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		this.composiciones.add(shapeShifter);
		return this;
	}

	@Override
	public int deepest() {
		if (!this.composiciones.isEmpty()) {
			int profundidadDeComposiciones = 0;
			for (IShapeShifter ss : this.composiciones) {
					profundidadDeComposiciones += ss.deepest();
		
			}
		
			return profundidadDeComposiciones + 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public IShapeShifter flat() {
		if(this.deepest() == 0) {
			return this;
		}
		else {
			IShapeShifter nuevoSS = new ShapeShifter(this.value);
			List<Integer> values = this.values();
			values.remove(0);
			for(Integer value : values) {
				nuevoSS.compose(new ShapeShifter(value));
			}
			return nuevoSS;
		}
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(this.value);
		for(IShapeShifter children : this.composiciones) {
			values.addAll(children.values());
		}
		return values;
	}

}
