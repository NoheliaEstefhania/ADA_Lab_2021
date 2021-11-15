package Graphs;

public class Vertex<E>{
	protected E data; //contiene un dato (una información)
	protected ListLinked<Edge<E>> listAdj; //lista de adyacencia de cada vértice, es otra lista enlazada, que guarda tipos arista
	
	public Vertex(E data) { //cada vez que creo un vèrtice le mando un dato
		this.data = data;
		listAdj = new ListLinked<Edge<E>>();//creo la lista de adyacencia vacía, como para poder insertar aristas
	}
	
	
	
	public boolean equals(Object o) {
		if( o instanceof Vertex<?>) {
			Vertex<E> v = (Vertex<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}
	
	public String toString() {
		return this.data + " --> " + this.listAdj.toString()+ "\n"; //tiene un dato y una lista enlazada
	}
}
