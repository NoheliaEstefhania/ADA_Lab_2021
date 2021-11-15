package Graphs;

public class ListLinked<T> {
	protected Node<T> first;

	public ListLinked() {
		this.first = null;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public T search(T data) { //le envìo el elemento
		Node<T> nodo = this.first; //mi cabezala mantengo fija
		while(nodo != null && !nodo.data.equals(data))//voy iterendo y moviéndome mientrs añun no encuentro mi elem
			nodo = nodo.next;
		if (nodo != null) //el elem. existe, por lo tanto
			return nodo.data;//devuelvo el dato del elemento que he estado buscando
		return null; //cuando recorra toda la lista llegaré a nulo
	}
	
	public void insertFirst(T data) { //inserción al inicio de una lista
		System.out.println("pasó 1");
		this.first = new Node<T>(data, this.first);
	}
	
	public String toString() {
		String r = "";
		Node<T> aux = this.first;
			while(aux != null) {
				r = r + aux.data; //voy concatenando la información
				aux = aux.next;
			}
			return r; 
	}

	private T remove(T data) {
		T item = null;
		Node<T> aux = this.first;
		if (this.first != null && this.first.data.equals(data)) {
			item = first.data;
			first = first.next;

		} else {
			while (aux.next != null && !aux.next.data.equals(data))
				aux = aux.getNext();
			if (aux.getNext() != null) {
				item = aux.next.data;
				aux.next = aux.next.next;
			}
		}
		return item;
	}
}
