package tp3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		GrafoDirigido grafito = new GrafoDirigido();
		GrafoDirigido grafote = new GrafoDirigido();

		for (int i = 1; i < 11; i++) {
			grafito.addVertice(i);
		}

		// 1
		grafito.addAdyacente(1, 2);
		grafito.addAdyacente(1, 3);
		grafito.addAdyacente(1, 4);

		// 2
		//grafito.addAdyacente(2, 2);

		// 3
		grafito.addAdyacente(3, 6);

		// 4
		grafito.addAdyacente(4, 2);
		grafito.addAdyacente(4, 3);

		// 5
		grafito.addAdyacente(5, 4);
		grafito.addAdyacente(5, 5);
		grafito.addAdyacente(5, 6);
		grafito.addAdyacente(5, 7);

		// 6
		grafito.addAdyacente(6, 4);
		grafito.addAdyacente(6, 5);
		grafito.addAdyacente(6, 7);

		// 7
		grafito.addAdyacente(7, 8);

		// 8
		grafito.addAdyacente(8, 6);

		// 9
		grafito.addAdyacente(9, 7);
		grafito.addAdyacente(9, 8);
		grafito.addAdyacente(9, 10);

		// 10
		// grafito.addAdyacente(10,8);
		for (int i = 1; i < 10; i++) {
			grafito.DFS(i);
		}
		
		grafote.addVertice(11);
		grafote.addVertice(20);
		grafote.addVertice(31);
		grafote.addVertice(17);
		grafote.addVertice(45);
		grafote.addVertice(18);
		
		grafote.addAdyacente(11, 45);
		grafote.addAdyacente(45, 20);
		grafote.addAdyacente(45, 17);
		grafote.addAdyacente(20, 11);
		grafote.addAdyacente(31, 31);
		grafote.addAdyacente(31, 17);
		grafote.addAdyacente(17, 18);
		grafote.DFS(17);
	}
}
