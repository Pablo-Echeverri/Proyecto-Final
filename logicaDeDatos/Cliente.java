package logicaDeDatos;

/** Una extensi�n de la clase persona para a�adir atributos al cliente
 * @author Pablo Echeverr�a
 */

public class Cliente extends Persona{
	
	
	private String usuarioC;
	private int contraseniaC;
	private int saldo;
	private boolean esVIP;
	
/**
 * 
 * @param nombreP nombre de la Persona
 * @param apellidoP apellidoP  apellido de la Persona
 * @param edadP cuantos a�os tiene la Persona
 * @param numContacto un n�mero de telefono insertado para contacto
 * @param codigoIdentP un identificador para buscar a la Persona en la base de datos
 * @param usuarioC el nombre que utilizar� el cliente para entrar a la tienda
 * @param contraseniaC la contrase�a personal de acceso
 * @param saldo de cuanto dinero dispone
 * @param esVIP si el usuario tiene rango o no 
 */

	public Cliente(String nombreP, String apellidoP, int edadP, int numContacto, int codigoIdentP, String usuarioC, int contraseniaC, int saldo, boolean esVIP) {
		super(nombreP, apellidoP, edadP, numContacto, codigoIdentP);
		this.usuarioC = usuarioC;
		this.contraseniaC = contraseniaC;
		this.saldo = saldo;
		this.esVIP = esVIP;

		// TODO Auto-generated constructor stub
	}

	public String getUsuarioC() {
		return usuarioC;
	}

	public void setUsuarioC(String usuarioC) {
		this.usuarioC = usuarioC;
	}

	public int getContraseniaC() {
		return contraseniaC;
	}

	public void setContraseniaC(int contraseniaC) {
		this.contraseniaC = contraseniaC;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean isEsVIP() {
		return esVIP;
	}

	public void setEsVIP(boolean esVIP) {
		this.esVIP = esVIP;
	}
	

}
