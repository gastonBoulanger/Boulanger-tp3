package tp3;
import java.util.ArrayList;



public class GrafoDirigido {
	private ArrayList<Vertice> vertices = new ArrayList<Vertice>();

	public boolean dfsIterativo() {
		deleteVisitados();
		for (Vertice vertice : vertices) {

			Pila q = new Pila();
			for (int v = 0; v < this.vertices.size(); v++) {
				vertice.setVisitado(true);
				q.apilar(vertice);

				while (!q.isEmpty()) {
					Vertice vert = q.tope();
					q.desapilar();
					for (Vertice w : vert.getAdyacentes()) {
						if (!w.isVisitado()) {
							w.setVisitado(true);
							q.apilar(w);
						} else if (w.isVisitado() && !w.isTerminado()) {
							return true;
						} else if ((w.isVisitado()) && (!w.isTerminado())) {
							w.setTerminado(true);
						}
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
		deleteVisitados();
		for (Vertice adyacente : this.vertices) {
			adyacente.setVisitado(false);
		}
		for (Vertice adyacente : this.vertices) {
			if (!adyacente.isVisitado()) {
				if(DFS_visit(adyacente)){
					return true;
				}
			}
		}
		return false;
	}

	private boolean DFS_visit(Vertice v) {
		v.setVisitado(true);

		for (Vertice adyacente : v.getAdyacentes()) {
			if ((adyacente.isVisitado()) && (!adyacente.isTerminado())) { // SI
																			// ESTA
																			// VISITADO
																			// Y
																			// NO
																			// TERMINADO
				return true;
				
			}
			if (!adyacente.isVisitado()) {

				DFS_visit(adyacente);
			}
		}

		v.setTerminado(true);
		return false;
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

	private void deleteVisitados() {
		for (Vertice v : this.vertices) {
			v.setVisitado(false);
			v.setTerminado(false);
		}
	}
}
