package main.java.liceosorollab;

public class Rectangulo {
	
	private int lado1;
	private int lado2;
	
	public Rectangulo(int lado1,int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public boolean cuadrado() {
		boolean cuadrado = false;
		if(this.lado1 == this.lado2) {
			cuadrado = true;
		};
		return cuadrado;
	}
	
	public int perimetroRectangulo() {
		int total= 0 ;
		total = 2 * (this.lado1 + this.lado2);
		return total;
	}
	
	public int areaRectangulo() {
		int total= 0 ;
		total = this.lado1 * this.lado2;
		return total;
	}
	
	public int diagonal() {
		int diagonal = (int) Math.sqrt((Math.pow(this.lado1, 2))+(Math.pow(this.lado2, 2)));
		return diagonal;
	}
}

