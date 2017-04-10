package tp3;

import java.util.ArrayList;

public class GrafoNoDirigido extends Grafo {



	@Override
	public boolean isAdjacent(Vertice u, Vertice v) {
		return false;
	}


	@Override
	public void addVertice(int peso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVertice(String etiqueta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVertice(int peso, String etiqueta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVertice(String etiqueta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addArista(Vertice u, Vertice v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArista(Vertice u, Vertice v) {
		// TODO Auto-generated method stub
		
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

}
