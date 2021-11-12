package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logicaDeDatos.Empleado;
import logicaDeDatos.Persona;

public class EmpleadoTest {
	
	Empleado empleado1;
	
	@Before
    public void setUp() {
        empleado1 =  new Empleado(null, null, 0, 0, 0, null, 0, 0);
    }

	@After
    public void tearDown() {
        empleado1 = null;
    }
	
	@Test
    public void getUsuarioETest() {
        String usuarioE = "GabrielCar";

        empleado1.setNombreP(usuarioE);
        assert (empleado1.getNombreP().equals(usuarioE));
    }
		    
	
}