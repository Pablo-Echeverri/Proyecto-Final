package logicaDeDatos;

/** La clase principal para definir a las personas
 * @author Pablo Echeverría
 */

public class Persona {
	
	private String nombreP;
	private String apellidoP;
	private int edadP;
	private int numContacto;
	private int codigoIdentP;
	
	/** Contructor de la Persona
	 * 
	 * @param nombreP  nombre de la Persona
	 * @param apellidoP  apellido de la Persona
	 * @param edadP  cuantos años tiene la Persona
	 * @param numContacto  un número de telefono insertado para contacto
	 * @param codigoIdentP  un identificador para buscar a la Persona en la base de datos
	 */
	
	public Persona(String nombreP, String apellidoP, int edadP, int numContacto, int codigoIdentP) {
		super();
		this.nombreP = nombreP;
		this.apellidoP = apellidoP;
		this.edadP = edadP;
		this.numContacto = numContacto;
		this.codigoIdentP = codigoIdentP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public int getEdadP() {
		return edadP;
	}

	public void setEdadP(int edadP) {
		this.edadP = edadP;
	}

	public int getNumContacto() {
		return numContacto;
	}

	public void setNumContacto(int numContacto) {
		this.numContacto = numContacto;
	}

	public int getCodigoIdentP() {
		return codigoIdentP;
	}

	public void setCodigoIdentP(int codigoIdentP) {
		this.codigoIdentP = codigoIdentP;
	}
	
	
	/** Un método para comprobar que el usuario es mayor de edad
	 * @return 
	 * @throws Exception
	 */
	
	public boolean mayorEdad() throws Exception {
        if (this.edadP == 0)
            throw new Exception("Edad sin definir");

        return this.edadP >= 18;
    }
	
	
}
