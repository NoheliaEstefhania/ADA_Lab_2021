package Graphs;

public class GraphLink <E>{
	protected ListLinked<Vertex<E>> listVertex;

	public GraphLink() { //creo una lista vacía 	
		listVertex = new ListLinked<Vertex<E>>();//me genera una lista vacìa de aristas
	}

	public void insertVertex(E data) { //me envìa la informaciòn que me va a almacenar este vèrtice
		Vertex<E> nuevo = new Vertex<E>(data); //primero genero
		if (this.listVertex.search(nuevo) != null) { //si es diferente de nulo indica que ese vértice ya está dentro de la lista
			System.out.println("Vertice ya fue insertado anteriormente ... ");
		}
		this.listVertex.insertFirst(nuevo);//en caso no esté, la inserto en mi lista, inserto mi vértice
		System.out.println("vertice " + nuevo + " insertado");
	}

	public void insertEdge(E verOri, E verDest) {	
		Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri));//buscamos en la lista de vértices el origen
		Vertex<E> refDest = this.listVertex.search(new Vertex<E>(verDest));//también buscamos el destino
		//en caso existan, nos devuelven la referencia del dato, 
		System.out.println("Existen ambos vertices");
		if (refOri == null || refDest == null) {//si alguna no existe no se puede realizar la inserción
			System.out.println("Vertice origen y/o destino no existen ... ");
			return;
		}
		if (refOri.listAdj.search(new Edge<E>(refDest))!= null) { //como ya existe, ahora evalúo la existencia de la arista en alguna de las dos aristas, en este caso en la del origen
			System.out.println("Arista ya fue insertada anteriormente ... ");
			return;
		}
		//la inserto por duplicado
		refOri.listAdj.insertFirst(new Edge<E>(refDest));//la inserto en el origen, cuyo destino es el destino
		refOri.listAdj.insertFirst(new Edge<E>(refOri)); //la inserto en el destino, cuyo destino es el origen, si fuera un no dirigido, eliminamos esta lìnea
	}
	public String toString() {
		return this.listVertex.toString();
	}
}
