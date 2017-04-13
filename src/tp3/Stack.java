package tp3;

import java.util.ArrayList;


public class Stack {
	ArrayList<Vertice> lista = new ArrayList<Vertice>();

	
public void apilar(Vertice v){
	this.lista.add(v);
}
public void desapilar(){
	this.lista.remove(lista.size()-1);
}
public Vertice tope(){
	return this.lista.get(lista.size()-1);
}
public boolean isEmpty(){
	return this.lista.isEmpty();
}
}