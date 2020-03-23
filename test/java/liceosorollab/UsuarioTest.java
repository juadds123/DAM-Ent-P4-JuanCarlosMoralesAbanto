package test.java.liceosorollab;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.Before;
import main.java.liceosorollab.Usuario;

public class UsuarioTest {
	private Usuario usuario;

	@Before
	public void Before() {

		usuario = new Usuario("Alejandro","Sanchez Fernandez", LocalDate.of(2000, 06, 10), 6);
	}

	@Test

	public void comprobarNombre() {

		assertEquals("Alejandro", usuario.getNombre());
	}

	@Test

	public void comprobarApellidos() {

		assertEquals("Sanchez Fernandez", usuario.getApellidos());
	}

	@Test

	public void comprobarNombreCompleto() {

		assertEquals("Alejandro Sanchez Fernandez", usuario.getNombre()+" "+usuario.getApellidos());
	}

	@Test

	public void comprobarMayoriaDeEdad() {

		assertEquals(true,usuario.mayoriaEdad());
	}

	@Test

	public void comprobarIdentificador() {
		assertEquals(6,usuario.getIdentificador());
	}

	@Test
	public void comprobarNombreMayusculas() {
		assertEquals("ALEJANDRO",usuario.getNombre().toUpperCase());
	}

	@Test
	public void comprobarNombreMinusculas() {
		assertEquals("alejandro",usuario.getNombre().toLowerCase());
	}
	
	@Test
	public void comprobarNombreCompletoMayusculas() {
		assertEquals("ALEJANDRO SANCHEZ FERNANDEZ",usuario.nombreCompletoMayus());
	}
	
	@Test
	public void comprobarNombreCompletoMinusculas() {
		assertEquals("alejandro sanchez fernandez",usuario.nombreCompletoMinus());
	}
}