package Aula_05;

import java.util.*;

/*
 * Ejercicio - Q1
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity
 * Question: What is the time complexity of method (numberListAsc)?
 * Answer: The time complexity is: O(n) --> lineal time 
 * Date	  : 25/10/2021
 */

public class E001_Q1_TimeComplexity {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("---------------------------");
		System.out.println("Numeros enteros del 0 a " + (n-1));
		System.out.println("---------------------------");
		numberListAsc(n);
	}
	
	//muestra la lista de numeros desde 0 hasta n-1 
	
	public static void numberListAsc(int n) {

		for (int i = 0; i < n; i++) {//			|O(n)	|= O(1) * 0(n)
			//statement							|		|= O(n)
			System.out.println(i);	 //	= O(1)	|		|
		}   //									|		|Time complexity = O(n)
	}
}
