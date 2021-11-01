package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio - Q9
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity
 * Question: What is the time complexity of method (rootMethod)?
 * Answer: The time complexity is: O(sqrt(n)) --> square root time     
 * Date	  : 25/10/2021
 */

public class E009_Q9_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("----------------------------------");
		System.out.println("Lista de numeros desde el 0 hasta sqrt(" + (n-1) + ")");
		System.out.println("----------------------------------");
		rootMethod(n);
	}

	//

	public static void rootMethod(int n) {
		
		for (int i = 0; i * i < n; i++) {//		|O(sqrt(n))	|= O(1) * 0(sqrt(n))
			//statement							|			|= O(sqrt(n))
			System.out.println(i);	 //	= O(1)	|			|
		}   //									|			|Time complexity = O(sqrt(n))					
	}
}	

/*	
 
	Condition       	i * i < n
	To finish       	i * i >= n
	We assume that     	i^2 = n
                    	i = sqrt(n)
		
	complexity = O(sqrt(n))
 
 */
