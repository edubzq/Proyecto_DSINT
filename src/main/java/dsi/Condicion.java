package dsi;

public class Condicion {

	private String receptor;
	private String tipo;
	private String emisor;

	public Condicion(String subject, String type, String object) {
		this.receptor = subject;
		this.tipo = type;
		this.emisor = object;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	
	  @Override
	    public String toString() {
	        return "Condicion{" +
	                "sujeto='" + emisor + '\'' +
	                ", relacion='" + tipo + '\'' +
	                ", objeto='" + receptor + '\'' +
	                '}';
	    }

}
