package ar.edu.unq.po2.tp3;

public class Point {
	
	private float x;
	private float y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public void moveTo(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point sumWith(Point punto) {
		float resultadoX = this.getX() + punto.getX();
		float resultadoY = this.getY() + punto.getY();
		Point resultado  = new Point(resultadoX, resultadoY);
		return resultado;
	}
}
