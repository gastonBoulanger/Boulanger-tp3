package tp3;

public class Vertice {
	private String etiqueta;
	private int grado;
	
	public int getGrado() {
		return grado;
	}

	public void incrementGrado() {
		this.grado++;
	}
	public void decrementGrado() {
		this.grado--;
	}


	public Vertice(String etiqueta){
		this.etiqueta = etiqueta;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
}
