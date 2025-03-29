package dsi;

public class Objeto {
	
	private String nombre;
	private String utilidad;
	
	public Objeto(String nombre, String utilidad) {
		super();
		this.nombre = nombre;
		this.utilidad = utilidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUtilidad() {
		return utilidad;
	}
	
	public void setUtilidad(String utilidad) {
		this.utilidad = utilidad;
	}

}
