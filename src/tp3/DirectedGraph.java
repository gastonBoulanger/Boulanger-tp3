package tp3;

import java.util.ArrayList;

public class DirectedGraph {
	private ArrayList<Vertice> vertices = new ArrayList<Vertice>();
	private boolean visited;

	public boolean dfsIterative() {
		setUnvisited();
		for (Vertice vertice : vertices) {

			Stack stack = new Stack();
			vertice.setVisitado(true);
			stack.apilar(vertice);

			while (!stack.isEmpty()) {
				Vertice vert = stack.tope();
				stack.desapilar();
				for (Vertice v : vert.getAdyacentes()) {
					if (!v.isVisitado()) {
						v.setVisitado(true);
						stack.apilar(v);
					} else if (v.isVisitado() && !v.isTerminado()) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public void addVertice(int i) {
		Vertice v = new Vertice(i);
		this.vertices.add(v);

	}

	public boolean dfs() {
		setUnvisited();
		for (Vertice adyacente : this.vertices) {
			if (!adyacente.isVisitado()) {
				DFS_visit(adyacente);
			}
		}
		return visited;
	}

	private void DFS_visit(Vertice v) {
		v.setVisitado(true);

		for (Vertice adyacente : v.getAdyacentes()) {
			if ((adyacente.isVisitado()) && (!adyacente.isTerminado())) {
				visited = true;
				break;
			}
			else if (!adyacente.isVisitado()) {
				DFS_visit(adyacente);
			}
		}
		v.setTerminado(true);
	}

	protected Vertice getVertice(int u) {
		return this.getElemByEtiqueta(u);
	}

	public void addAdyacente(int u, int v) {
		this.getElemByEtiqueta(u).addAdyacente(this.getElemByEtiqueta(v));

	}

	public Vertice getElemByEtiqueta(int u) {
		Vertice answer = new Vertice(u);
		for (Vertice v : this.vertices) {
			if (v.getEtiqueta() == u) {
				answer = v;
			}
		}
		return answer;
	}

	private void setUnvisited() {
		for (Vertice v : this.vertices) {
			v.setVisitado(false);
			v.setTerminado(false);
		}
	}
}
