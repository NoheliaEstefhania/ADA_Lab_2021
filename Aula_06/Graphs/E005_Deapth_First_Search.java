package Graphs;

/*
 * Ejercicio - E005
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Graphs
 * Date	  		: 08/11/2020
 */

public class E005_Deapth_First_Search {
	public static void main(String[] args) {
		GraphLink<String> g = new GraphLink<String>();

		g.insertVertex("A");
		System.out.println(g);
		g.insertVertex("aqp");
		g.insertVertex("cusco");
		System.out.println(g);
		g.insertVertex("piura");
		System.out.println(g);
		g.insertVertex("tarapoto");
		System.out.println(g);
		g.insertVertex("libertad");
		System.out.println(g);
		g.insertVertex("ucayali");

		g.insertEdge("lima", "aqp");
		System.out.println(g);
		g.insertEdge("cusco", "aqp");
		System.out.println(g);
		g.insertEdge("piura", "lima");
		System.out.println(g);
		g.insertEdge("cusco", "lima");
		System.out.println(g);
		g.insertEdge("piura", "tarapoto");

		System.out.println("----------------------------");

		System.out.println(g);
		System.out.println("probando DFS: ");
		g.DFS("lima");
		System.out.println(g);
		System.out.println(" ");
		g.DFS("tarapoto");
		System.out.println(g);
	}
}
