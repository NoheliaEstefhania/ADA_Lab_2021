package Graphs;

public class GraphLink<E> {
	protected ListLinked<Vertex<E>> listVertex;

	public GraphLink() { //creo una lista vacía 	
		listVertex = new ListLinked<Vertex<E>>();//me genera una lista vacìa de aristas
	}

	public void insertVertex(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		if (this.listVertex.search(nuevo) != null) {
			System.out.println("Vertice ya fue insertado anteriormente ... ");
		}
		this.listVertex.insertFirst(nuevo);
		System.out.println("vertice " + nuevo + " insertado");
	}

	public void insertEdge(E verOri, E verDest) {
		this.insertEdge(verOri, verDest, -1);
	}

	public void insertEdge(E verOri, E verDest, int weight) {
		Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri));
		Vertex<E> refDest = this.listVertex.search(new Vertex<E>(verDest));
		if (refOri == null || refDest == null) {
			System.out.println("Vertice origen y/o destino no existen ... ");
			return;
		}
		if (refOri.listAdj.search(new Edge<E>(refDest)) != null) {
			System.out.println("Arista ya fue insertada anteriormente ... ");
			return;
		}
		refOri.listAdj.insertFirst(new Edge<E>(refDest, weight));
		refDest.listAdj.insertFirst(new Edge<E>(refOri, weight)); //la inserto en el destino, cuyo destino es el origen, si fuera un no dirigido, eliminamos esta lìnea
	}

	public String toString() {
		return this.listVertex.toString();
	}

	private void initLabel() {
		Node<Vertex<E>> aux = this.listVertex.first;
		for (; aux != null; aux = aux.getNext()) {
			aux.data.label = 0;
			Node<Edge<E>> auxE = aux.data.listAdj.first;
			for (; auxE != null; auxE = auxE.getNext())
				auxE.data.label = 0;
		}
	}

	//DFS
	public void DFS(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		Vertex<E> v = this.listVertex.search(nuevo);
		if (v == null) {
			System.out.println("Vertice no existe");
			return;
		}
		initLabel();
		DFSRec(v);
	}
	//DFS Recursivo
	private void DFSRec(Vertex<E> v) {
		v.label = 1;
		System.out.print(v.data + ", ");
		Node<Edge<E>> e = v.listAdj.first;
		for (; e != null; e = e.getNext()) {
			if (e.data.label == 0) {
				Vertex<E> w = e.data.refDest;
				if (w.label == 0) {
					e.data.label = 1;
					DFSRec(w);
				} else {
					e.data.label = 2;
				}
			}
		}
	}
}
