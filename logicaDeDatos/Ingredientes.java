package logicaDeDatos;

/** Una clase sobre los ingredientes de los productos
 * @author Pablo Echeverr�a
 *
 */

public class Ingredientes {
	
	private String nombreI;
	private String descI;
	private int codigoI;
	

/**
 * 
 * @param nombreI el nombre del ingrediente
 * @param descI una peqe�a descipci�n sobre que es el ongrediente
 * @param codigoI un codigo de indentificaci�n
 */
	
	
	public Ingredientes(String nombreI, String descI, int codigoI) {
		super();
		this.nombreI = nombreI;
		this.descI = descI;
		this.codigoI = codigoI;
	}

	public String getNombreI() {
		return nombreI;
	}

	public void setNombreI(String nombreI) {
		this.nombreI = nombreI;
	}

	public String getDescI() {
		return descI;
	}

	public void setDescI(String descI) {
		this.descI = descI;
	}

	public int getCodigoI() {
		return codigoI;
	}

	public void setCodigoI(int codigoI) {
		this.codigoI = codigoI;
	}

}
