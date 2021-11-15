package Graphs;

public class Edge<E> { //lo que se encapsula en cada elemento de la lista enlazada
	protected Vertex<E> refDest; //tiene la referencia de nuestro destino, que es un vértice
	protected int weight; //ponderado (parámetro), no ponderado (-1)
	
	public Edge (Vertex<E> refDest) {
		this(refDest, -1); 
	}
	
	public Edge (Vertex<E> refDest, int weight) {
		this.refDest = refDest;
		this.weight = weight;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Edge<?>) {
			Edge<E> e = (Edge<E>) o;
			return this.refDest.equals(e.refDest);
		}
		return false;
	}
	
	public String toString() {
		//información del vértice destino y en caso tenga, la de su peso
		if (this.weight > -1) {
			return refDest.data + " [" + this.weight + "], ";
		}else {
			return refDest.data + ", "; 
		}
	}
}
 