package test.java.liceosorollab;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorollab.Numero;


public class NumeroTest {
	
	private Numero numero;

	@Before
	public void before() {
		numero = new Numero(6,10);
	}
		
	@Test
	public void comprobarNumero1() {
		
		assertEquals(6,numero.getNumero1());
	}
	
	@Test
	public void comprobarNumero2() {
		
		assertEquals(10,numero.getNumero2());
	}
	
	@Test
	public void comprobarSuma() {
		
		assertEquals(16,numero.suma());
	}
	
	@Test
	public void comprobarResta() {
		
		assertEquals(-4,numero.resta());
	}
	
	@Test
	public void comprobarMultiplicar() {
		
		assertEquals(60,numero.multiplicar());
	}
	
}
