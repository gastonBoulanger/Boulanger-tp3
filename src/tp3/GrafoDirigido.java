package tp3;

import java.util.HashMap;


public class GrafoDirigido extends Grafo {

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
	public void DFS(int u) {
		Vertice w = this.getVertice(u);
		//HashMap<Integer, Boolean> visitado = new HashMap<Integer, Boolean>();
		for (Vertice v : super.vertices){
		//	System.out.println("0");
			v.setVisitado("no");
		
		}
			//w.setVisitado(true);
	//	System.out.println("01");
				DFS_visit(w);
			
	}
	private Vertice getVertice(int u){
		return this.getElemByEtiqueta(u);
	}
	private void DFS_visit(Vertice v) {
		v.setVisitado("si");
		System.out.println("1");
		for (Vertice adyacente : v.getAdyacentes()){
			
			if (adyacente.isVisitado().equals("no")){
				System.out.println("2");
				DFS_visit(adyacente);
				
			} else if(adyacente.isVisitado().equals("si")){
				System.out.println("Habemus ciclo " + v.getEtiqueta() + " isVisitado: " + v.isVisitado() +" " + adyacente.getEtiqueta());
				break;
			} 
				System.out.println("3");
				
				System.out.println("NO Habemus ciclo 22" + v.getEtiqueta() + " isVisitado: " + v.isVisitado());
			System.out.println("4");
			v.setVisitado("closed");
		}
		System.out.println("NO Habemus ciclo " + v.getEtiqueta() + " isVisitado: " + v.isVisitado());
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
		Vertice w = this.getVertice(u);
		this.getElemByEtiqueta(u).addAdyacente(w);
		
	}


	@Override
	public Vertice getElemByEtiqueta(int u) {
		Vertice answer = new Vertice(u);
		for ( Vertice v : super.vertices){
			if (v.getEtiqueta() == u){
				//System.out.println("algo");
				answer = v;
			} 
		}
		return answer;
	}

}
