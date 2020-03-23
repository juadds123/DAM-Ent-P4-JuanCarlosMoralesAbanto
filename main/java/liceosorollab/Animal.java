package main.java.liceosorollab;

public class Animal {
	
	private String especie;
	private String raza;
	private int peso;
	private int edad;
	private String colorPelo;

	public Animal(String especie, String raza, int peso, int edad, String colorPelo) {
		this.especie = especie;
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
		this.colorPelo = colorPelo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
}
