package Graphs;

/*
 * Ejercicio - E005
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Graphs
 * Date	  		: 08/11/2020
 */

public class E005_Deapth_First_Search {
	public static void main(String[] args) {
		GraphLink<Integer> g = new GraphLink<Integer>();

		g.insertVertex(1);
		System.out.println(g);
		g.insertVertex(2);
		g.insertVertex(3);
		System.out.println(g);
		g.insertVertex(12);
		System.out.println(g);
		g.insertVertex(19);
		System.out.println(g);
		g.insertVertex(5);
		System.out.println(g);
		g.insertVertex(20);

		g.insertEdge(8, 2);
		System.out.println(g);
		g.insertEdge(3, 2);
		System.out.println(g);
		g.insertEdge(12, 8);
		System.out.println(g);
		g.insertEdge(2, 8);
		System.out.println(g);
		g.insertEdge(12, 19);

		System.out.println("----------------------------");

		System.out.println(g);
		System.out.println("probando DFS: ");

		g.DFS(19);
		System.out.println(g);
	}
}
