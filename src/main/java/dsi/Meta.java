package dsi;

public class Meta {
	private String sujeto;
	private String accion;
	private String objeto;
	private boolean cumplida;




	public Meta(String sujeto, String accion, String objeto) {
		this.sujeto = sujeto;
		this.accion = accion;
		this.objeto = objeto;
		this.cumplida = false;
	}

	public boolean isCumplida() {
		return cumplida;
	}


	public void setCumplida(boolean cumplida) {
		this.cumplida = cumplida;
	}
	public String getSujeto() {
		return sujeto;
	}

	public String getAccion() {
		return accion;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setSujeto(String sujeto) {
		this.sujeto = sujeto;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	@Override
	public String toString() {
		return "Meta{" + "sujeto='" + sujeto + '\'' + ", accion='" + accion + '\'' + ", objeto='" + objeto + '\'' + '}';
	}
}
