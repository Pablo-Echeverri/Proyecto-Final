package logicaDeDatos;

/** Una extensión de la clase persona para añadir atributos al empleado
 * @author Pablo Echeverría
 *
 */

public class Empleado extends Persona {

	private String usuarioE;
	private int contraseniaE;
	private int rangoE;
	
/**
 * 
 * @param nombreP nombre de la Persona
 * @param apellidoP apellido de la Persona
 * @param edadP cuantos años tiene la Persona
 * @param numContacto un número de telefono insertado para contacto
 * @param codigoIdentP un identificador para buscar a la Persona en la base de datos
 * @param usuarioE el nombre que utilizará el empleado para entrar a la tienda
 * @param contraseniaE la contraseña personal de acceso
 * @param rangoE que tipo de empleado es
 */
	
	public Empleado(String nombreP, String apellidoP, int edadP, int numContacto, int codigoIdentP, String usuarioE, int contraseniaE, int rangoE) {
		super(nombreP, apellidoP, edadP, numContacto, codigoIdentP);
		this.usuarioE = usuarioE;
		this.contraseniaE = contraseniaE;
		this.rangoE = rangoE;
		// TODO Auto-generated constructor stub
	}

	public String getUsuarioE() {
		return usuarioE;
	}

	public void setUsuarioE(String usuarioE) {
		this.usuarioE = usuarioE;
	}

	public int getContraseniaE() {
		return contraseniaE;
	}

	public void setContraseniaE(int contraseniaE) {
		this.contraseniaE = contraseniaE;
	}

	public int getRangoE() {
		return rangoE;
	}

	public void setRangoE(int rangoE) {
		this.rangoE = rangoE;
	}
	
}
