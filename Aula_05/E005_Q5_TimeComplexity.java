package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio - Q5
 * Author: Nohelia Estefhania Tacca Apaza
 * Description: Review of Time Complexity
 * Question: What is the time complexity of method (twoNumbers)?
 * Answer: The time complexity is: O(n²) --> quadratic time 
 * Date	  : 25/10/2021
 */

public class E005_Q5_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Resultado ");
		System.out.println("-----------------------------");
		twoNumbers(n);
	}

	//muestra pares de numeros 

	public static void twoNumbers(int n) {
		//						      __					    ____
		for (int i = 0; i < n; i++) {//				|= O(n)	  	      __			|
			for (int j = 0; j < i; j++) {//						|= O(1)*0((n+1)/2)	|= O(n) * 0(n)
			//statement								|= O(n/2)		|
			System.out.println(i + " - " + j);	//= O(1)			|= O(n)			|= O(n²)
			}//								      __|			|
		}   //						      __|					    ____|Time complexity = O(n²)
	}//																	
}	

/*	Tracing the values of the variables
	i   j      nº of times
	------------------------
	0   0 ❌     0
	------------------------
	1   0 ✔️     1
  		1 ❌     
	------------------------
	2   0 ✔️     2
		1 ✔️  
		2 ❌ 
	------------------------
	.    
	.    
	.    
	------------------------
	n             n

	1 + 2 + 3 + ... + n = n * (n + 1) / 2    
	O(n²)
 
 */
