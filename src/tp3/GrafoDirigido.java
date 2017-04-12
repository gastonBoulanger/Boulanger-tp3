package tp3;

import java.util.HashMap;

public class GrafoDirigido extends Grafo {

	private int ciclos = 0;
	@Override
	public boolean isAdjacent(Vertice u, Vertice v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addVertice(int i) {
		Vertice v = new Vertice(i);
		super.vertices.add(v);

	}

	@Override
	public void addArista(Vertice u, Vertice v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteArista(Vertice u, Vertice v) {
		// TODO Auto-generated method stub

	}

	public void DFS() {
		
		// HashMap<Integer, Boolean> visitado = new HashMap<Integer, Boolean>();
		/*
		 * for (Vertice v : super.vertices) { // System.out.println("0");
		 * v.setVisitado(false);
		 * 
		 * }
		 */
		// w.setVisitado(true);
		// System.out.println("01");
		for (Vertice adyacente : super.vertices) {
			adyacente.setVisitado(false);
		}
		for (Vertice adyacente : super.vertices) {
			if (!adyacente.isVisitado()) {
				DFS_visit(adyacente);
			}
		}
		/*for (int i = 1; i < super.vertices.size(); i++) {
			Vertice w = this.getVertice(i);
			if (!w.isTerminado()) {
				DFS_visit(w);
			}
		}*/
	}



	private void DFS_visit(Vertice v) {
		v.setVisitado(true);
		//System.out.println("1");

		for (Vertice adyacente : v.getAdyacentes()) {
			if ((adyacente.isVisitado()) && (!adyacente.isTerminado())){ //Si es amarillo (&& no es negro)
				System.out.println("Ciclo encontrado en el Vértice: " + adyacente.getEtiqueta());
				System.out.println("isVisitado: " + adyacente.isVisitado());
				System.out.println("isTerminado: " + adyacente.isTerminado());
				ciclos++;
			}
			if (!adyacente.isVisitado()){
				
				
				DFS_visit(adyacente);
			
			 /*if (!adyacente.isTerminado()) {
				 System.out.println("No esta terinado");
				 if(!adyacente.isVisitado()){
					 System.out.println("no esta visitado");
						DFS_visit(adyacente);
				 }else{
					 System.out.println("esta visitado");
					 System.out.println("Habemus ciclo " + v.getEtiqueta() + " isVisitado: " + v.isVisitado() + " "
							 + adyacente.getEtiqueta());
				 }
				

			}/*
			 /*if (!adyacente.isTerminado() && adyacente.isVisitado()) {
				 System.out.println("Habemus ciclo " + v.getEtiqueta() + " isVisitado: " + v.isVisitado() + " "
						 + adyacente.getEtiqueta());
			 } */
			//System.out.println("3");

			//System.out.println("NO Habemus ciclo 22" + v.getEtiqueta() + " isVisitado: " + v.isVisitado());
			//System.out.println("4");

		}
		}
			
		v.setTerminado(true);
		//System.out.println("NO Habemus ciclo " + v.getEtiqueta() + " isVisitado: " + v.isVisitado());
		//System.out.println("Se encontraron " + ciclos + " ciclos.");
	}

	
	public int getCiclos() {
		return ciclos;
	}

	private Vertice getVertice(int u) {
		return this.getElemByEtiqueta(u);
	}
	
	@Override
	public boolean pathExists(Vertice u, Vertice v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int pathSize(Vertice u, Vertice v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteVertice(String etiqueta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAdyacente(int u, int v) {
		this.getElemByEtiqueta(u).addAdyacente(this.getElemByEtiqueta(v));

	}

	@Override
	public Vertice getElemByEtiqueta(int u) {
		Vertice answer = new Vertice(u);
		for (Vertice v : super.vertices) {
			if (v.getEtiqueta() == u) {
				// System.out.println("algo");
				answer = v;
			}
		}
		return answer;
	}

	public void printVertices(GrafoDirigido grafo){
		System.out.print("Vertices del grafo: ");
		System.out.print("[ ");
		for (int i=0; i<super.vertices.size();i++){
			System.out.print(super.vertices.get(i).getEtiqueta() + " ");
		}
		System.out.println(" ]");
	}
	
}
