package Graphs;

/*
 * Vertice
 */

public class Vertex<E> { //contiene un dato (una información)
	protected E data;
	protected ListLinked<Edge<E>> listAdj; //lista de adyacencia de cada vértice, es otra lista enlazada, que guarda tipos arista
	protected int label; // 0=unexplored - 1 = visited

	public Vertex(E data) { //cada vez que creo un vèrtice le mando un dato
		this.data = data;
		listAdj = new ListLinked<Edge<E>>(); //creo la lista de adyacencia vacía, como para poder insertar aristas
	}

	public boolean equals(Object o) {
		if (o instanceof Vertex<?>) {
			Vertex<E> v = (Vertex<E>) o;
			return this.data.equals(v.data);
		}
		return false;
	}

	/*
	 * Muestra el dato y la lista de adyacencia del vertice
	 */
	
	public String toString() {
		return this.data + " --> " + this.listAdj.toString() + "\n"; //tiene un dato y una lista enlazada
	}
}
