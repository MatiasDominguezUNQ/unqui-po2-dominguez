package ar.edu.unq.po2.tpcomposite;

import java.util.List;

public class CarroDeCompras {
	
	List<Product> products;
	
	private void setElements(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> getElements() {
		return this.products;
	}
	
	public int totalRounded() {
		return Math.round(this.total());
	}
	
	public float total() {
		float total = 0;
		for (Product producto : this.products) {
			total += producto.getPrice();
		}
		return total;
	}
}
