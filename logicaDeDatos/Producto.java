package logicaDeDatos;

/**
 * 
 * @author Pablo Echeverría
 *
 */

public class Producto {
	
	private String nombre;
	private String tipo;
	private int codigoP;
	private int numIngre;
	private int precio;
	private int cantidad;
	
/**
 * 
 * @param nombre nombre del producto
 * @param tipo si el producto, es salado, dulce ...
 * @param codigoP un númerom de indentificación para el producto
 * @param numIngre cuantos ingredientes utiliza el producto
 * @param precio que precio teine el producto
 * @param cantidad cuantas unidades del producto hay en la tiendad
 */
	
	public Producto(String nombre, String tipo, int codigoP, int numIngre, int precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.codigoP = codigoP;
		this.numIngre = numIngre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCodigoP() {
		return codigoP;
	}

	public void setCodigoP(int codigoP) {
		this.codigoP = codigoP;
	}

	public int getNumIngre() {
		return numIngre;
	}

	public void setNumIngre(int numIngre) {
		this.numIngre = numIngre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int numIngreMayor () throws Exception {
		if (this.numIngre >= 3)
			throw new Exception ("El producto es elaborado");
		
		return this.numIngre = numIngre;
	}
	
	public boolean hayExistencias() throws Exception {
        if (this.cantidad == 0)
            throw new Exception("No hay existencias del producto");

        return this.cantidad >= 1;
    }
	

}