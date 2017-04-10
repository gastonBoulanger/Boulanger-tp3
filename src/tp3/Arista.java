package tp3;

public class Arista {
	private Vertice u;
	private Vertice v;
	private int peso;
	private String etiqueta;
	
	public Arista(Vertice u, Vertice v, String etiqueta) {
		this.u = u;
		this.v = v;
		this.etiqueta = etiqueta;
	}
	public Arista(Vertice u, Vertice v, int peso) {
		this.u = u;
		this.v = v;
		this.peso = peso;
	}
	public Arista(Vertice u, Vertice v) {
		this.u = u;
		this.v = v;
	}
	public Arista(Vertice u, Vertice v, int peso, String etiqueta) {
		this.u = u;
		this.v = v;
		this.peso = peso;
		this.etiqueta = etiqueta;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	public Vertice getU() {
		return u;
	}
	public void setU(Vertice u) {
		this.u = u;
	}
	public Vertice getV() {
		return v;
	}
	public void setV(Vertice v) {
		this.v = v;
	}

}
