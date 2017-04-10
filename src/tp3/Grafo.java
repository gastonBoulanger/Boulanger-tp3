package tp3;

import java.util.ArrayList;

public abstract class Grafo {
	private ArrayList<Arista> aristas;
	private ArrayList<Vertice> vertices;

	public abstract boolean isAdjacent(Vertice u, Vertice v);
	public abstract void addArista(Vertice u, Vertice v);
	public abstract void addVertice(int peso);
	public abstract void addVertice(String etiqueta);
	public abstract void addVertice(int peso, String etiqueta);
	public abstract void deleteArista(Vertice u, Vertice v);
	public abstract void deleteVertice(String etiqueta);
	public abstract boolean pathExists(Vertice u, Vertice v);
	public abstract int pathSize(Vertice u, Vertice v);
}
