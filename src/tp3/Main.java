package tp3;



public class Main {

	public static void main(String[] args) {
		GrafoDirigido grafo = new GrafoDirigido();
		final int SIZE = 1000;
		for(int i=1; i<SIZE; i++){
			grafo.addVertice(i);
		}
		for(int i=1; i<SIZE; i++){
			int j = (int) Math.floor(Math.random() *SIZE);	//genera de 0 a SIZE adyacentes por vertice
				for (int k = 0; k < j; k++) {
					int h = (int) Math.ceil(Math.random() * SIZE);// elije como adyacente un numero dentro del SIZE
					grafo.addAdyacente(i ,h);
				}
	}

		
		System.out.println("Hay ciclos (metodo DFS recursivo: " + grafo.dfs());
		System.out.println("Hay ciclos (metodo DFS iterativo: " + grafo.dfsIterativo());

		
	
	}
}
