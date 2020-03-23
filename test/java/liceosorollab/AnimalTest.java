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
}
