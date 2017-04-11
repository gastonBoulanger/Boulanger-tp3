package tp3;

import java.util.ArrayList;

public abstract class Grafo {
	private ArrayList<Arista> aristas;
	protected ArrayList<Vertice> vertices = new ArrayList<Vertice>();

	public abstract Vertice getElemByEtiqueta(int u);

	public abstract boolean isAdjacent(Vertice u, Vertice v);

	public abstract void addArista(Vertice u, Vertice v);

	public abstract void addVertice(int u);

	public abstract void addAdyacente(int u, int v);

	public abstract void deleteArista(Vertice u, Vertice v);

	public abstract void deleteVertice(String etiqueta);

	public abstract boolean pathExists(Vertice u, Vertice v);

	public abstract int pathSize(Vertice u, Vertice v);
}
