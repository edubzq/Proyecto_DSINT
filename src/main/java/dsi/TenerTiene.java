package dsi;

public class TenerTiene extends Relacion{
	
	private Objeto objeto;
	private Ser propietario;
	
	public TenerTiene(Objeto objeto, Ser propietario) {
		this.propietario = propietario;
		this.objeto = objeto;
	}
	
	public Objeto getObjeto() {
		return objeto;
	}

	public Ser getPropietario() {
		return propietario;
	}

	public void setPropietario(Ser propietario) {
		this.propietario = propietario;
	}
	
	
}
