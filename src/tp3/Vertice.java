package tp3;

import java.util.ArrayList;

public class Vertice {
	private int etiqueta;
	private boolean visitado = false;
	private boolean terminado = false;
	private int grado;
	private ArrayList<Vertice> adyacentes = new ArrayList<Vertice>();

	public int getGrado() {
		return grado;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public void incrementGrado() {
		this.grado++;
	}

	public void decrementGrado() {
		this.grado--;
	}

	public void addAdyacente(Vertice v) {
		this.adyacentes.add(v);
		grado++;
	}

	public Vertice(int etiqueta) {
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

	public void printAdyacentes() {
		System.out.println("Vertices adyacentes a " + this.getEtiqueta() + ": ");
		System.out.print("[ ");
		for (int i = 0; i < this.getAdyacentes().size(); i++) {
			System.out.print(this.getAdyacentes().get(i).getEtiqueta() + " ");
		}
		System.out.println(" ]");
	}
}
