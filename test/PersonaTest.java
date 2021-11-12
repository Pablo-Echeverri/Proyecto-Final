package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logicaDeDatos.Persona;

public class PersonaTest {
		
	 Persona persona1;

	    @Before
	    public void setUp() {
	        persona1 = new Persona(null, null, 0, 0, 0);
	    }

	    @After
	    public void tearDown() {
	        persona1 = null;
	    }

/**	    
 *  Comprobar que la variable "nombre" es igual a la variable "nombre"
 */
	    
	    @Test
	    public void getNombrePTest() {
	        String nombre = "Javier";

	        persona1.setNombreP(nombre);
	        assert (persona1.getNombreP().equals(nombre));
	    }
	    
/**
 *  Comprobar que la variable "nombre" es diferente al nombre "Eve"
 */

	    @Test
	    public void setNombrePTest() {
	        String nombre = "Javier";

	        persona1.setNombreP("Ev"
	        		+ "e");
	        assertFalse(persona1.getNombreP().equals(nombre));

	    }

/**
 * Comprobar que las edades selecionadas son mayores a 18 o no
 * @throws Exception
 */

	    @Test
	    public void mayorDeEdadTest() throws Exception {
	        persona1.setEdadP(15);
	        assertFalse(persona1.mayorEdad());

	        persona1.setEdadP(16);
	        assertFalse(persona1.mayorEdad());

	        persona1.setEdadP(18);
	        assertTrue(persona1.mayorEdad());
	        assertEquals(persona1.mayorEdad(), true);

	        persona1.setEdadP(20);
	        assertTrue(persona1.mayorEdad());
	        assertEquals(persona1.mayorEdad(), true);
	    }


	    @Test(expected = Exception.class)
	    public void mayorDeEdad_Exception_Test() throws Exception {
	        persona1.mayorEdad();
	    }

	    @Test
	    public void mayorDeEdad_Exception_Test2() throws Exception {
	        try {
	            persona1.mayorEdad();
	            fail();
	        } catch(Exception e) {
	            assertTrue(true);
	        }

	    }
	}