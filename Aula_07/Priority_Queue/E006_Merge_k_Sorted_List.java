package Priority_Queue;

import java.util.*;

/*
 * Ejercicio	: E001
 * Author		: Nohelia Estefhania Tacca Apaza
 * Description	: Merge k sorted lists
 * Details		: You are given  an array of k  linked lists  lists,each  linked list  is sorted  in ascending  order .
				  Merge  all  the  linked	lists  into one  sorted  linked list  and return  it .
 * Date	  		: 15/11/2021
 */

public class E006_Merge_k_Sorted_List {
	public static void main(String args[]) {

		int[][] matriz = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };

		mergeKsortedList(matriz);
	}

	public static void mergeKsortedList(int[][] matriz) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		int x = matriz.length;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				pQueue.add(matriz[i][j]);
			}
		}
		System.out.println(pQueue.toString());
	}
}
