package ar.edu.unq.po2.tpcomposite;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ShapeShifterTest {
	private IShapeShifter a;
	private IShapeShifter b;
	private IShapeShifter c;
	private IShapeShifter d;
	private IShapeShifter f;


	@Test
	public void testEjemploA() {
		a = new ShapeShifter(1);
		assertEquals(a.values(), Arrays.asList(1));
		assertEquals(a.deepest(), 0);
	}
	
	@Test
	public void testEjemploC() {
		a = new ShapeShifter(1);
		b = new ShapeShifter(2);
		c = a.compose(b);
		assertEquals(c.values(), Arrays.asList(1,2));
		assertEquals(c.deepest(), 1);
	}
	
	@Test
	public void testProfundidad() {
		a = new ShapeShifter(1);
		b = new ShapeShifter(2);
		c = a.compose(b);
		d = new ShapeShifter(3).compose(c);
		f = d.compose(new ShapeShifter(d.values().get(0)).compose(new ShapeShifter(5)).compose(new ShapeShifter(6)));
		assertEquals(f.deepest(), 3);
		
	}
	
	@Test
	public void testFlat() {
		a = new ShapeShifter(1);
		b = new ShapeShifter(2);
		c = a.compose(b);
		d = new ShapeShifter(3).compose(c);
		f = d.compose(new ShapeShifter(5).compose(new ShapeShifter(6)));
		IShapeShifter f2 = f.flat();

		assertEquals(f.deepest(), 3);
		assertEquals(f2.deepest(), 1);
		assertEquals(f2.values(), f.values());
		
	}

}
