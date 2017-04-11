package tp3;

import java.util.ArrayList;

public class Vertice {
	private int etiqueta;
	private String visitado = "no";
	private int grado;
	private ArrayList<Vertice> adyacentes = new ArrayList<Vertice>();
	
	public int getGrado() {
		return grado;
	}

	public String isVisitado() {
		return visitado;
	}

	public void setVisitado(String visitado) {
		this.visitado = visitado;
	}

	public void incrementGrado() {
		this.grado++;
	}
	public void decrementGrado() {
		this.grado--;
	}
	
	public void addAdyacente(Vertice v){
		this.adyacentes.add(v);
	}

	public Vertice(int etiqueta){
		this.etiqueta = etiqueta;
	}
	
	public ArrayList<Vertice> getAdyacentes() {
		ArrayList<Vertice> copia = (ArrayList<Vertice>) adyacentes.clone();
		return copia;
	}
	public int getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(int etiqueta) {
		this.etiqueta = etiqueta;
	}
	
}
