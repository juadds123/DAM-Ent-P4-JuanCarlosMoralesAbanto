package test.java.liceosorollab;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorollab.Rectangulo;

public class RectanguloTest {
	
	private Rectangulo rectangulo;

	@Before
	public void before() {
		rectangulo = new Rectangulo(5,5);
	}
	@Test
	public void compruebaHoras() {
		assertEquals(true,rectangulo.cuadrado());
	}
	
	@Test
	public void compruebaPerimetro() {
		assertEquals(20,rectangulo.perimetroRectangulo());
	}
	
	@Test
	public void compruebaArea() {
		assertEquals(25,rectangulo.areaRectangulo());
	}
	
	@Test
	public void compruebaDiagonal() {
		assertEquals(7,rectangulo.diagonal());
	}
	
	@Test
	public void compruebaRadio() {
		assertEquals(3,rectangulo.radio());
	}
	
}