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
	
}