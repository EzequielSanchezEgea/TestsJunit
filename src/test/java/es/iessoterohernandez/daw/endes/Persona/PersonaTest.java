package es.iessoterohernandez.daw.endes.Persona;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PersonaTest {
	private static Persona persona, persona1, persona2, persona3, persona4;

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@BeforeAll
	public static void init() {
		persona = new Persona("Juan", 30, 'H', 60, 1.75);
		persona1 = new Persona("Catalina", 25, 'M', 60, 1.65);
		persona2 = new Persona("Pedro", 40, 'H', 90, 1.75);
		persona3 = new Persona("Antonio", 25, 'H', 70, 1.80);
		persona4 = new Persona("Laura", 17, 'M', 55, 1.60);
	}

	@AfterAll
	public static void finish() {
		persona = null;
		persona1 = null;
		persona2 = null;
		persona3 = null;
		persona4 = null;
	}

	@Test
	public void testCalcularIMC_BajoPeso() {

		assertEquals(-1, persona.calcularIMC());
	}

	@Test
	public void testCalcularIMC_PesoIdeal() {
		assertEquals(0, persona1.calcularIMC());
	}

	@Test
	public void testCalcularIMC_SobrePeso() {

		assertEquals(1, persona2.calcularIMC());
	}

	@Test
	public void testEsMenorDeEdad() {

		assertFalse(persona4.esMayorDeEdad());
	}

	@Test
	public void testEsMayorDeEdad() {

		assertTrue(persona3.esMayorDeEdad());
	}
	  
	}

