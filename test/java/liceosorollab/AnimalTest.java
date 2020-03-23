package test.java.liceosorollab;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import main.java.liceosorollab.Animal;

public class AnimalTest {

	private Animal animal;
	
	@Before
	public void Before() {
		animal = new Animal("Mamifero","Gato",3,2,"gris");
	}
	
	@Test
	public void comprobarEspecie() {
		assertEquals("Mamifero", animal.getEspecie());
	}
	
	@Test
	public void comprobarRaza() {
		assertEquals("Gato", animal.getRaza());
	}
	
	@Test
	public void comprobarPeso() {
		assertEquals(3 ,animal.getPeso());
	}
	
	@Test
	public void comprobarEdad() {
		assertEquals(2 ,animal.getEdad());
	}
	
}
