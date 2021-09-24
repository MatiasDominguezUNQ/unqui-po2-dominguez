package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class PuntoTestCase {
private Point point;
private Point point2;
	
	@Test
	void testNuevoPunto() {
		
		point = new Point(2, 8);
		
		assertTrue(point.getX() == 2 && point.getY() == 8);
	}
	
	@Test
	void testNuevoPuntoCero() {
		
		point = new Point();
		
		assertTrue(point.getX() == 0 && point.getY() == 0);
	}
	
	@Test
	void testMoverPunto() {
		
		point = new Point(2, 8);
		point.moveTo(3, 4);
		
		assertTrue(point.getX() == 3 && point.getY() == 4);
	}
	
	@Test
	void testSumarPunto() {
		
		point  = new Point(2, 8);
		point2 = new Point(3, 2);
		Point pointSum = point.sumWith(point2);
		assertTrue(pointSum.getX() == 5 && pointSum.getY() == 10);
	}
}