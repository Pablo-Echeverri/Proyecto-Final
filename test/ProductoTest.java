package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logicaDeDatos.Persona;
import logicaDeDatos.Producto;

public class ProductoTest {

	 Producto producto1;

	    @Before
	    public void setUp() {
	    	Producto producto1 = new Producto(null, null, 0, 0, 0, 0);
	    }

	    @After
	    public void tearDown() {
	        Object procudto1 = null;
	    }
	    
/**	    
*  Comprobar que la variable "nombre" es igual a la variable "nombre"
*/
	    
	    @Test
	    public void getNombreTest() {
	        String nombre = "Piruleta de Bubulubu";

	        producto1.setNombre(nombre);
	        assert (producto1.getNombre().equals(nombre));
	    }
	    
/**
 * Comprobar que el tipo "dulce" es diferente al tipo "salado"
 */
	    
	    @Test
	    public void getTipo(){
	    	String tipo =  "dulce";
	    	
	    	producto1.setTipo("salado");
	    	assertFalse(producto1.getTipo().equals(tipo));
	    }
	    
	    @Test
	    public void cantidadTest()throws Exception{
	    	producto1.setCantidad(0);
	    	assertFalse(producto1.hayExistencias());
	    	
	    	producto1.setCantidad(100);
	    	assertTrue(producto1.hayExistencias());
	    	assertEquals(producto1.hayExistencias(),true);
	    	
	    	producto1.setCantidad(1);
	    	assertTrue(producto1.hayExistencias());
	    	assertEquals(producto1.hayExistencias(),true);
	    }

}
