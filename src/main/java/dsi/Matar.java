package dsi;

public class Matar extends Relacion {
	private Ser emisor;
	private Ser receptor;
	
	
	public Matar(Ser emisor, Ser receptor) {
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