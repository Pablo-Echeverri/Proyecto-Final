package logicaDeDatos;

public class Mensajeria {
	
	private String fechaCreacion;
	private boolean verificado;
	
	public Mensajeria(String fechaCreacion, boolean verificado) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.verificado = verificado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

}
