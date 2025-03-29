package dsi;

import java.util.*;

public class Ser {

	private String nombre;
	private String estado;
	private List<String> habilidades;

	public Ser(String nombre, String estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.habilidades = new LinkedList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
