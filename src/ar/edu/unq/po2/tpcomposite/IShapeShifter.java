package ar.edu.unq.po2.tpcomposite;

import java.util.List;
	//Rol: Component
public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter shapeShifter);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();

}