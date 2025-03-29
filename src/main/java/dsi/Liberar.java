package dsi;

public class Liberar extends Relacion {
	private Ser emisor;
	private Ser receptor;
	
	
	public Liberar(Ser emisor, Ser receptor) {
		super();
		this.emisor = emisor;
		this.receptor = receptor;
		
	}

	public Ser getEmisor() {
		return emisor;
	}

	public Ser getReceptor() {
		return receptor;
	}


	
	public void setEmisor(Ser emisor) {
		this.emisor = emisor;
	}

	public void setReceptor(Ser receptor) {
		this.receptor = receptor;
	}

}
