package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio - Q4
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity
 * Question: What is the time complexity of method (twoNumbers)?
 * Answer: The time complexity is: O(n²) --> quadratic time 
 * Date	  : 25/10/2021
 */

public class E004_Q4_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Par de numeros entre 0 y " + ((n-1)));
		System.out.println("-----------------------------");
		twoNumbers(n);
	}

	//muestra los pares de numeros que se pueden formar con los numeros entre 0 y n-1

	public static void twoNumbers(int n) {
		//							  __				    ____
		for (int i = 0; i < n; i++) {//				    |= O(n)   __			|
			for (int j = 0; j < n; j++) {//					|			|
			//statement							|= O(1) * 0(n)		|= O(n) * 0(n)
			System.out.println(i + " - " + j);	//= O(1)		|= O(n)			|= O(n²)
			}//						      	      __|			|
		}   //							  __|				    ____|Time complexity = O(n²)
	}//																	
}	
