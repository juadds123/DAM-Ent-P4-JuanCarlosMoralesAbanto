package main.java.liceosorollab;

public class Numero {
	
	private int numero1;
	private int numero2;
	
	public Numero(int numero1, int numero2) {
		
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int getNumero1() {
		return numero1;
	}
	
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public int getNumero2() {
		return numero2;
	}
	
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public String toString() {
		return "numero1 " + numero1 + ", numero2 " + numero2;
	}

	public int suma() {
		int total;
		 total = numero1 +numero2;
		 
		return total;
	}
	
	public int resta() {
		
		int total;
		
		total = numero1-numero2;
		return total;
	}
	
	public int multiplicar() {
		return numero1*numero2;
	}
	
	

	
}
